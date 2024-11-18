import java.util.ArrayList;

public class ListaDeConsumidores {
    private ArrayList<Consumidor> Consumidores;

    public ListaDeConsumidores(){
        Consumidores = new ArrayList<Consumidor>();
    }

    public Consumidor selecionarConsumidor(String nome){
        Consumidor consumidorEncontrado = null;
        for (Consumidor consumidor : Consumidores){
            if(consumidor.getNome().equals(nome)){
                consumidorEncontrado = consumidor;
            }
        }
        return consumidorEncontrado;
    }

    public void adicionarConsumidor(Consumidor consumidor){
        Consumidores.add(consumidor);
    }

    public void removerConsumidor(Consumidor consumidor){
        Consumidores.remove(consumidor);
    }
    
    public void imprimirConsumidores() {
        for (Consumidor consumidor : Consumidores) {
            System.out.printf("\n consumidor: %s \n", consumidor.getNome());
            System.out.printf("\n CNPJ: %s \n", consumidor.getCNPJ());
            System.out.printf("\n CEP: %s \n", consumidor.getEndereco().getCEP());
            System.out.printf("\n Consumo médio: %s \n", consumidor.getConsumoMedio());
            System.out.printf("\n Data de cadastro: %s \n", consumidor.getDataCadastro());
        }

    }
}
