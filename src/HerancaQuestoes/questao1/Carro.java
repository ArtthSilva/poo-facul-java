package HerancaQuestoes.questao1;

public class Carro extends Veiculo{
    final int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    public void imprimirDetalhes () {
        System.out.println( "o carro tem " +
                "número de portas: " + numPortas +
                ", marca: '" + marca + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", ano de fabricacao :" + anoFabricacao);
    }
}
