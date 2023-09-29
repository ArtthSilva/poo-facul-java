package HerancaQuestoes.questao1;

public class Main {
    public static void main(String[] args){
        Carro carro = new Carro("Toyota", "Corolla",2023,4);
        carro.imprimirDetalhes();
        Moto moto = new Moto("nao conheço", "tbm nao", 2023,999);
        moto.imprimirDetalhes();
    }
}
