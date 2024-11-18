import java.util.ArrayList;

public class ListaDeFornecedores {

    private ArrayList<Fornecedor> Fornecedores;

    public ListaDeFornecedores() {
        Fornecedores = new ArrayList<Fornecedor>();
    }

    public Fornecedor selecionarFornecedor(String nome){
        Fornecedor fornecedorEncontrado = null;
        for (Fornecedor fornecedor : Fornecedores){
            if(fornecedor.getNome().equals(nome)){
                fornecedorEncontrado = fornecedor;
            }
        }
        return fornecedorEncontrado;
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        Fornecedores.add(fornecedor);
    }

    public void removerFornecedor(Fornecedor fornecedor) {
        Fornecedores.remove(fornecedor);
    }

    public void imprimirFornecedores() {
        for (Fornecedor fornecedor : Fornecedores) {
            System.out.printf("\n Fornecedor: %s \n", fornecedor.getNome());
            System.out.printf("\n CNPJ: %s \n", fornecedor.getCNPJ());
            System.out.printf("\n CEP: %s \n", fornecedor.getEndereco().getCEP());
            System.out.printf("\n Consumo médio: %s \n", fornecedor.getConsumoMedio());
            System.out.printf("\n Data de cadastro: %s \n", fornecedor.getDataCadastro());

        }

    }
}
