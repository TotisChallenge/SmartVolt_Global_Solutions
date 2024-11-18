public class FonteDeEnergia {
    private int id;
    private String descricao;
    private Double custoKw;
    private Double producaoMedia;
    private Double carbono;

    public FonteDeEnergia(int id, String descricao, Double producaoMedia, Double custoKw, Double carbono) {
        this.id = id;
        this.descricao = descricao;
        this.producaoMedia = producaoMedia;
        this.custoKw = custoKw;
        this.carbono = carbono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCustoKw() {
        return custoKw;
    }

    public void setCustoKw(Double custoKw) {
        this.custoKw = custoKw;
    }

    public Double getProducaoMedia() {
        return producaoMedia;
    }

    public void setProducaoMedia(Double producaoMedia) {
        this.producaoMedia = producaoMedia;
    }

    public Double getCarbono() {
        return carbono;
    }

    public void setCarbono(Double carbono) {
        this.carbono = carbono;
    }
}
