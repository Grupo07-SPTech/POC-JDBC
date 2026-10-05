package school.sptech;

import java.time.LocalDateTime;

public class Logs {

    private Integer id;
    private Integer idUsuario;
    private String acao;
    private LocalDateTime dataHora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", acao='" + acao + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}