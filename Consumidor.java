public class Consumidor extends Empresa{

    public Consumidor(String nome, String CNPJ, String dataCadastro, Endereco endereco) {
        super(nome, CNPJ, dataCadastro, endereco);
    }

    public void comprarEnergia(Double kwDesejados, FonteDeEnergia fonteDesejada, Fornecedor fornecedorDesejado, FormaDePagamento pagamento){
        if(fornecedorDesejado.verificarEnergiaProduzida(fonteDesejada) >= kwDesejados){
            fornecedorDesejado.venderEnergia(kwDesejados,fonteDesejada);
            System.out.printf("\n Foram comprados %2.2f KW de energia eólica da empresa %s \n",kwDesejados,fornecedorDesejado.getNome());
            setCarbono(getCarbono()+(fonteDesejada.getCarbono()*kwDesejados));
            System.out.printf("\n Seu saldo de carbono é %2.2f \n",getCarbono());
        }
        else{
            System.out.println("Não foi possivel realizar a compra...");
        }
    }

}
