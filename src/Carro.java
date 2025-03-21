public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String modelo, String marca, int ano, int quantidadePortas) {
        super(modelo, marca, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de portas : " + quantidadePortas);
    }
}
