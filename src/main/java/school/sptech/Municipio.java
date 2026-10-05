package school.sptech;

public class Municipio {

    private Integer coMunicipio;
    private String nomeMunicipio;
    private String uf;

    public Integer getCoMunicipio() {
        return coMunicipio;
    }

    public void setCoMunicipio(Integer coMunicipio) {
        this.coMunicipio = coMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "coMunicipio=" + coMunicipio +
                ", nomeMunicipio='" + nomeMunicipio + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}