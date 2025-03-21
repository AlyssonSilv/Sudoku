public class Locadora {

    public static Carro carro = new Carro("Corolla", "Toyota", 2025, 4);
     public static Moto moto = new Moto("MT-09", "Yamaha", 2022, 899);

    public static void main(String[] args) {
        carro.exibirDetalhes();
        System.out.println("");
        moto.exibirDetalhes();
        System.out.println("");

    }

}
