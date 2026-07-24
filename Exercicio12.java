public class Exercicio12 {
    public static void main(String[] args) {
        double valorCompra = 500;
        boolean temCupom = true;

        if (temCupom) {
            valorCompra *= 0.9;
        }

        System.out.println("Valor final a pagar: R$ " + valorCompra);
    }
}
