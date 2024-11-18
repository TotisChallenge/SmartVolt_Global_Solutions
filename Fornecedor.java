import java.util.ArrayList;

public class Fornecedor extends Empresa{

    private ArrayList<FonteDeEnergia> fontesDeEnergia;
    private ArrayList<Double> energiaProduzida;


    public void produzirEnergia(FonteDeEnergia fonte, Double kwProduzidos){
        fontesDeEnergia.add(fonte);
        energiaProduzida.add(kwProduzidos);
        setCarbono(getCarbono()+fonte.getCarbono()*kwProduzidos);
        System.out.printf("\nO saldo de carbono da empresa %s é %2.2f \n",getNome(),getCarbono());
    }

    public Double verificarEnergiaProduzida(FonteDeEnergia fonteDesejada){
        Double fonteEncontrada = null;
        for(int i = 0; i < fontesDeEnergia.size(); i++){
            if(fontesDeEnergia.get(i) == fonteDesejada){
                fonteEncontrada = energiaProduzida.get(i);
            }
        }
        return fonteEncontrada;
    }

    public void exibirOpcoesEnergia(){
        for (int i = 0; i < fontesDeEnergia.size(); i++){
            System.out.printf("\n Fonte de Energia: %s  Energia Produzida(kw): %2.2f \n",fontesDeEnergia.get(i).getDescricao(),energiaProduzida.get(i));
        }
    }

    public void venderEnergia(Double kwVendidos,FonteDeEnergia fonteDesejada){
        for(int i = 0; i < fontesDeEnergia.size(); i++){
            if(fontesDeEnergia.get(i) == fonteDesejada){
                energiaProduzida.set(i,(energiaProduzida.get(i)-kwVendidos));
            }
        }
    }


    public Fornecedor(String nome, String CNPJ, String dataCadastro, Endereco endereco) {
        super(nome,CNPJ, dataCadastro, endereco);
        fontesDeEnergia = new ArrayList<FonteDeEnergia>();
        energiaProduzida = new ArrayList<Double>();
    }

}
