package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        JdbcTemplate template = new JdbcTemplate(conexao.getConexao());

        // INSERT
        String sql = """
                INSERT INTO usuario
                (nome, email, senha, cargo, id_unidade)
                VALUES (?, ?, ?, ?, ?)
                """;

        template.update(
                sql,
                "Ana Souza",
                "ana.souza@email.com",
                "123456",
                "Professora",
                1
        );

        System.out.println("Dados inseridos com sucesso no banco growthmap!");


        // SELECT EMPRESA
        List<Empresa> empresas = template.query(
                "SELECT * FROM empresa",
                new BeanPropertyRowMapper<>(Empresa.class)
        );

        System.out.println("EMPRESA:");
        System.out.println(empresas);


        // SELECT MUNICIPIO
        List<Municipio> municipios = template.query(
                "SELECT * FROM municipio",
                new BeanPropertyRowMapper<>(Municipio.class)
        );

        System.out.println("MUNICIPIO:");
        System.out.println(municipios);


        // SELECT UNIDADE
        List<Unidade> unidades = template.query(
                "SELECT * FROM unidade",
                new BeanPropertyRowMapper<>(Unidade.class)
        );

        System.out.println("UNIDADE:");
        System.out.println(unidades);


        // SELECT USUARIO
        List<Usuario> usuarios = template.query(
                "SELECT * FROM usuario",
                new BeanPropertyRowMapper<>(Usuario.class)
        );

        System.out.println("USUARIO:");
        System.out.println(usuarios);


        // SELECT DESEMPENHO REGIONAL
        List<DesempenhoRegional> desempenhos = template.query(
                "SELECT * FROM desempenho_regional",
                new BeanPropertyRowMapper<>(DesempenhoRegional.class)
        );

        System.out.println("DESEMPENHO REGIONAL:");
        System.out.println(desempenhos);


        // SELECT PAINEL ACOMPANHAMENTO
        List<PainelAcompanhamento> paineis = template.query(
                "SELECT * FROM painel_acompanhamento",
                new BeanPropertyRowMapper<>(PainelAcompanhamento.class)
        );

        System.out.println("PAINEL ACOMPANHAMENTO:");
        System.out.println(paineis);


        // SELECT CONFIG NOTIFICACAO
        List<ConfigNotificacao> configuracoes = template.query(
                "SELECT * FROM config_notificacao",
                new BeanPropertyRowMapper<>(ConfigNotificacao.class)
        );

        System.out.println("CONFIG NOTIFICACAO:");
        System.out.println(configuracoes);


        // SELECT LOGS
        List<Logs> logs = template.query(
                "SELECT * FROM logs",
                new BeanPropertyRowMapper<>(Logs.class)
        );

        System.out.println("LOGS:");
        System.out.println(logs);
    }
}