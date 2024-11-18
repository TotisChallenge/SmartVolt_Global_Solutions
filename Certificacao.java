public class Certificacao {
    private int id;
    private String descricao;
    private String dataEmissao;
    private String empresaEmissora;

    public Certificacao(int id, String descricao, String dataEmissao, String empresaEmissora) {
        this.id = id;
        this.descricao = descricao;
        this.dataEmissao = dataEmissao;
        this.empresaEmissora = empresaEmissora;
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

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getEmpresaEmissora() {
        return empresaEmissora;
    }

    public void setEmpresaEmissora(String empresaEmissora) {
        this.empresaEmissora = empresaEmissora;
    }
}
