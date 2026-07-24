public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Qual a primeira nota do aluno? ");
        short primeiraNota = 9;
        System.out.println("Qual a segunda nota do aluno? ");
        short segundaNota = 7;
        System.out.println("Qual a terceira nota do aluno? ");
        short terceiraNota = 8;

        float media = (primeiraNota + segundaNota + terceiraNota)/3.0F;

        System.out.printf("A média é %.2f", media);
    }
}
