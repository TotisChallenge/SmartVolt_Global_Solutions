import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String CNPJ;
    private String dataCadastro;
    private Double consumoMedio;
    private Double carbono = 0.0;
    private Endereco endereco;
    private ArrayList<Certificacao> certificacoes;

    public Empresa(String nome, String CNPJ, String dataCadastro, Endereco endereco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        certificacoes = new ArrayList<Certificacao>();
    }

    public void calcularConsumo(ListaDeMedicoes medicoes){
        consumoMedio = medicoes.calcularConsumoMedio(getNome());
    }

    public void registrarCertificacao(Certificacao certificacao){
        certificacoes.add(certificacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public Double getCarbono() {
        return carbono;
    }

    public void setCarbono(Double carbono) {
        this.carbono = carbono;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
