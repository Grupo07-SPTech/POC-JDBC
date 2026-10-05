package school.sptech;

import java.time.LocalDateTime;

public class PainelAcompanhamento {

    private Integer id;
    private Integer idUsuario;
    private Integer coMunicipio;
    private String areaConhecimento;
    private String observacao;
    private LocalDateTime dataCriacao;

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

    public Integer getCoMunicipio() {
        return coMunicipio;
    }

    public void setCoMunicipio(Integer coMunicipio) {
        this.coMunicipio = coMunicipio;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "PainelAcompanhamento{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", coMunicipio=" + coMunicipio +
                ", areaConhecimento='" + areaConhecimento + '\'' +
                ", observacao='" + observacao + '\'' +
                ", dataCriacao=" + dataCriacao +
                '}';
    }
}