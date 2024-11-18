public class FormaDePagamento {
    private int id;
    private String tipoDePagamento;
    private int prestacoes;
    private Double jurosPrestacoes;

    public FormaDePagamento(int id, String tipoDePagamento, int prestacoes, Double jurosPrestacoes) {
        this.id = id;
        this.tipoDePagamento = tipoDePagamento;
        this.prestacoes = prestacoes;
        this.jurosPrestacoes = jurosPrestacoes;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrestacoes() {
        return prestacoes;
    }

    public void setPrestacoes(int prestacoes) {
        this.prestacoes = prestacoes;
    }

    public Double getJurosPrestacoes() {
        return jurosPrestacoes;
    }

    public void setJurosPrestacoes(Double jurosPrestacoes) {
        this.jurosPrestacoes = jurosPrestacoes;
    }
}
