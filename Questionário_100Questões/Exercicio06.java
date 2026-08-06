package Questionário_100Questões;

public class Exercicio06 {
    public static void main(String[] args) {

        String name = "Naruto Uzumaki";
        int age = 17;
        float height = 1.66f;
        boolean status = true;

        System.out.println("=== DADOS DO NINJA ===");
        System.out.printf("Nome: %s\n" , name);
        System.out.printf("Idade: %d anos\n" , age);
        System.out.printf("Altura: %.2fm\n" , height);
        System.out.printf("Status: %s" , (status ? "Ativo" : "Inativo"));
    }
}
