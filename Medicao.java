public class Medicao {
    private String dataMedicao;
    private Double medicaoMes;
    private int tensao;

    public Medicao(String dataMedicao, Double medicaoMes, int tensao) {
        this.dataMedicao = dataMedicao;
        this.medicaoMes = medicaoMes;
        this.tensao = tensao;
    }

    public String getDataMedicao() {
        return dataMedicao;
    }

    public void setDataMedicao(String dataMedicao) {
        this.dataMedicao = dataMedicao;
    }

    public Double getMedicaoMes() {
        return medicaoMes;
    }

    public void setMedicaoMes(Double medicaoMes) {
        this.medicaoMes = medicaoMes;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }
}
