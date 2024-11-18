public class Main {
    public static void main(String[] args) {

        //Criando fontes de energia
        FonteDeEnergia hidreletrica = new FonteDeEnergia(0001,"Gerada a partir do movimento da água",10000.0,10.0,1.0);
        FonteDeEnergia eolica = new FonteDeEnergia(0002,"Gerada a partir do vento",2500.0,15.0,-0.5);
        FonteDeEnergia solar = new FonteDeEnergia(0003,"Gerada a partir de paineis solares",2200.0,16.0,-0.4);
        FonteDeEnergia nuclear = new FonteDeEnergia(0004, "Gerada a partir de materiais radioativos",6000.0,12.0,0.2);
        FonteDeEnergia termeletrica = new FonteDeEnergia(0005,"Gerada a partir da combustão",1000.0,7.0,2.0);


        //Criando empresas fornecedoras e adicionando a lista
        ListaDeFornecedores fornecedores = new ListaDeFornecedores();

        fornecedores.adicionarFornecedor(new Fornecedor("WEG","XX.XXX.XXX/0001-XX","17/11/2024",new Endereco("Santa Catarina","Sertãozinho","rua vizinhos",10000,"01234-010")));
        fornecedores.adicionarFornecedor(new Fornecedor("ENEL","XX.XXX.XXX/0001-XX","17/11/2024",new Endereco("São Paulo","São Paulo","rua dos doidos",0,"01234-030")));

        fornecedores.imprimirFornecedores();

        Fornecedor WEG = fornecedores.selecionarFornecedor("WEG");
        Fornecedor ENEL = fornecedores.selecionarFornecedor("ENEL");

        WEG.produzirEnergia(eolica,20000.0);
        WEG.produzirEnergia(nuclear,30000.0);

        ENEL.produzirEnergia(hidreletrica,50000.0);
        ENEL.produzirEnergia(termeletrica,10000.0);


        //Criando empresas consumidoras e adicionando à lista
        ListaDeConsumidores consumidores = new ListaDeConsumidores();

        Endereco enderecoConsumidor = new Endereco("São Paulo","São Paulo","rua dos trapalhoes",32,"01214-020");
        consumidores.adicionarConsumidor(new Consumidor("Padaria do Seu Zé","XX.XXX.XXX/0001-XX","17/11/2024",enderecoConsumidor));

        //Calcular consumo medio de uma empresa
        ListaDeMedicoes consumoConsumidor = new ListaDeMedicoes();
        consumoConsumidor.fazerMedicao(new Medicao("05/09/2024",2000.0,380));
        consumoConsumidor.fazerMedicao(new Medicao("05/10/2024",2200.0,381));
        consumoConsumidor.fazerMedicao(new Medicao("05/11/2024",2150.0,380));

        Consumidor SeuZe = consumidores.selecionarConsumidor("Padaria do Seu Zé");

        SeuZe.calcularConsumo(consumoConsumidor);

        //Comprar energia
        Double hidreletricaProduzidaENEL = ENEL.verificarEnergiaProduzida(hidreletrica);
        System.out.printf(" A ENEL tem cerca de %2.2f KW de fonte hidreletrica disponiveis para venda",hidreletricaProduzidaENEL);

        SeuZe.comprarEnergia(10000.0,hidreletrica,ENEL,new FormaDePagamento(01,"Crédito",5,0.05));


    }
}
