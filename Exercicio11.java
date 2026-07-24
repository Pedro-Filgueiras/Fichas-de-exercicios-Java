public class Exercicio11 {
    public static void main(String[] args) {
        String semaforo = "Azul";

        if (semaforo.equals("Verde")) {
            System.out.println("Pode passar");
        } else if (semaforo.equals("Amarelo")) {
            System.out.println("Atenção, reduza a velocidade");
        } else if (semaforo.equals("Vermelho")){
            System.out.println("Pare!");
        } else {
            System.out.println("Cor inválida");
        }
    }
}
