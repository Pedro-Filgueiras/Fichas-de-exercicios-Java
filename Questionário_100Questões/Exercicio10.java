package Questionário_100Questões;

public class Exercicio10 {
    public static void main(String[] args) {
        
        String name = "Kakashi Hatake";
        int age = 29;
        long chakra = 95000L;
        short quests = 1141;
        boolean vitality = true;
        char rank = 'S';

        System.out.println("========= FICHA NINJA =========");
        System.out.println("Nome: " + name);
        System.out.printf("Idade: %d anos\n", age);
        System.out.printf("Chakra: %d pontos\n", chakra);
        System.out.println("Missões Completadas: " + quests);
        System.out.printf("Status: %s\n", vitality ? "Vivo" : "Morto");
        System.out.println("Rank: " + rank);
        System.out.println("==============================");

        

    }
}