package Questionário_100Questões;

public class Exercicio79 {
    public static void main(String[] args) {

        String texto = "   O    ninja   nunca    desiste   ";

        int espacosInicio = 0;
        int espacosFim = 0;
        int espacosInternos = 0;

        // Conta espaços do início
        int inicio = 0;
        while (texto.charAt(inicio) == ' ') {
            espacosInicio++;
            inicio++;
        }

        // Conta espaços do fim
        int fim = texto.length() - 1;
        while (texto.charAt(fim) == ' ') {
            espacosFim++;
            fim--;
        }

        // Remove espaços do início e fim
        String textoSemBordas = texto.substring(inicio, fim + 1);

        // Remove espaços extras internos
        String textoLimpo = "";
        boolean ultimoFoiEspaco = false;

        for (int i = 0; i < textoSemBordas.length(); i++) {

            char c = textoSemBordas.charAt(i);

            if (c == ' ') {
                if (!ultimoFoiEspaco) {
                    textoLimpo += c;
                    ultimoFoiEspaco = true;
                } else {
                    espacosInternos++;
                }
            } else {
                textoLimpo += c;
                ultimoFoiEspaco = false;
            }
        }

        int totalRemovidos = espacosInicio + espacosFim + espacosInternos;

        System.out.println("Texto original: \"" + texto + "\"");
        System.out.println("Texto limpo: \"" + textoLimpo + "\"");

        System.out.println("\nRemoções:");
        System.out.println("- Espaços do início: " + espacosInicio);
        System.out.println("- Espaços do fim: " + espacosFim);
        System.out.println("- Espaços extras internos: " + espacosInternos);
        System.out.println("Total de espaços removidos: " + totalRemovidos);
    }
}