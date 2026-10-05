package school.sptech;

public class ConfigNotificacao {

    private Integer id;
    private String canal;
    private String destinatario;
    private Double limiarMedia;
    private Integer idUnidade;
    private Integer idUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Double getLimiarMedia() {
        return limiarMedia;
    }

    public void setLimiarMedia(Double limiarMedia) {
        this.limiarMedia = limiarMedia;
    }

    public Integer getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(Integer idUnidade) {
        this.idUnidade = idUnidade;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "ConfigNotificacao{" +
                "id=" + id +
                ", canal='" + canal + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", limiarMedia=" + limiarMedia +
                ", idUnidade=" + idUnidade +
                ", idUsuario=" + idUsuario +
                '}';
    }
}