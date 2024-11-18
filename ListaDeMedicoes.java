import java.util.ArrayList;

public class ListaDeMedicoes {
    private ArrayList<Medicao> MedicoesMensais;

    public ListaDeMedicoes(){
        MedicoesMensais = new ArrayList<Medicao>();
    }

    public void fazerMedicao(Medicao medicaoMensal){
        MedicoesMensais.add(medicaoMensal);
    }

    public Double calcularConsumoMedio(String nomeDaEmpresa){
        Double somaConsumo = (double) 0;
        for (Medicao medicao : MedicoesMensais){
            somaConsumo += medicao.getMedicaoMes();
        }
        somaConsumo = somaConsumo/MedicoesMensais.size();

        System.out.printf("\n O consumo médio da empresa %s é %2.2f KW \n",nomeDaEmpresa,somaConsumo);
        return somaConsumo;
    }
}
