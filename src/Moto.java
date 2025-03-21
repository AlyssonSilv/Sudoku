public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String modelo, String marca, int ano, int cilindrada) {
        super(modelo, marca, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas : " + cilindrada);
    }
}
