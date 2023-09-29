package DetalhesCarro;

public class Carro {
    final String marca;
    final String modelo;

    public Carro(String marca, String modelo) {
        this.modelo = modelo;
        this.marca = marca;
    }
    public void mostrarDetalhes(){
        System.out.println("marca do carro: "+marca+"\nmodelo dele: "+modelo);
    }
}
