public class Veiculo {
    protected String modelo;
    protected String marca;
    protected int ano;
    private static final double VALOR_POR_DIA = 50.0;

    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }

    // Método sobrecarregado para calcular aluguel apenas com a quantidade de dias
    public double aluguel(int dias) {
        return dias * VALOR_POR_DIA;
    }

    // Método sobrecarregado para calcular aluguel com dias e tipo de seguro
    public double aluguel(int dias, String tipoSeguro) {
        double adicionalSeguro = tipoSeguro.equalsIgnoreCase("completo") ? 40.0 : 20.0;
        return (dias * VALOR_POR_DIA) + adicionalSeguro;
    }
}