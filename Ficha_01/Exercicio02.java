public class Exercicio02 {
    public static void main (String[] args){
        System.out.println("O sinal está verde?");
        boolean sinal = true;
        if (sinal) {
            System.out.println("Próxima etapa");
        }   else    {
            System.out.println("Esperar o sinal fechar");
        }

        System.out.println("Tem algum carro passando?");
        boolean carroPassando = false;
        if (carroPassando == false) {
            System.out.println("Próxima etapa");
        }   else    {
            System.out.println("Esperar os carros pararem");
        }

        System.out.println("Pode atravessar a rua");
    }
}