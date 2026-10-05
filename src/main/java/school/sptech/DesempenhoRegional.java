package school.sptech;

public class DesempenhoRegional {

    private Integer id;
    private Integer coMunicipio;
    private Integer ano;
    private Double mediaCn;
    private Double mediaCh;
    private Double mediaLc;
    private Double mediaMt;
    private Double mediaRedacao;
    private Integer qtdParticipantes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoMunicipio() {
        return coMunicipio;
    }

    public void setCoMunicipio(Integer coMunicipio) {
        this.coMunicipio = coMunicipio;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getMediaCn() {
        return mediaCn;
    }

    public void setMediaCn(Double mediaCn) {
        this.mediaCn = mediaCn;
    }

    public Double getMediaCh() {
        return mediaCh;
    }

    public void setMediaCh(Double mediaCh) {
        this.mediaCh = mediaCh;
    }

    public Double getMediaLc() {
        return mediaLc;
    }

    public void setMediaLc(Double mediaLc) {
        this.mediaLc = mediaLc;
    }

    public Double getMediaMt() {
        return mediaMt;
    }

    public void setMediaMt(Double mediaMt) {
        this.mediaMt = mediaMt;
    }

    public Double getMediaRedacao() {
        return mediaRedacao;
    }

    public void setMediaRedacao(Double mediaRedacao) {
        this.mediaRedacao = mediaRedacao;
    }

    public Integer getQtdParticipantes() {
        return qtdParticipantes;
    }

    public void setQtdParticipantes(Integer qtdParticipantes) {
        this.qtdParticipantes = qtdParticipantes;
    }

    @Override
    public String toString() {
        return "DesempenhoRegional{" +
                "id=" + id +
                ", coMunicipio=" + coMunicipio +
                ", ano=" + ano +
                ", mediaCn=" + mediaCn +
                ", mediaCh=" + mediaCh +
                ", mediaLc=" + mediaLc +
                ", mediaMt=" + mediaMt +
                ", mediaRedacao=" + mediaRedacao +
                ", qtdParticipantes=" + qtdParticipantes +
                '}';
    }
}