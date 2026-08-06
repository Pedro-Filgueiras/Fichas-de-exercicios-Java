package Questionário_100Questões;

public class Exercicio95 {

    public static final int LOGIN_ERROR = 1001;
    public static final int PERMISSION_ERROR = 1002;
    public static final int FILE_ERROR = 1003;
    public static final int NETWORK_ERROR = 1004;
    public static final int MEMORY_ERROR = 1005;

    public static final String LOGIN_ERROR_MESSAGE = "Usuário ou senha inválidos";
    public static final String PERMISSION_ERROR_MESSAGE = "Acesso negado";
    public static final String FILE_ERROR_MESSAGE = "Arquivo não encontrado";
    public static final String NETWORK_ERROR_MESSAGE = "Falha na conexão";
    public static final String MEMORY_ERROR_MESSAGE = "Memória insuficiente";

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CÓDIGOS DE ERRO ===");
        System.out.println();

        System.out.println("Constantes definidas:");
        System.out.println("ERRO_LOGIN = " + LOGIN_ERROR + ": \"" + LOGIN_ERROR_MESSAGE + "\"");
        System.out.println("ERRO_PERMISSAO = " + PERMISSION_ERROR + ": \"" + PERMISSION_ERROR_MESSAGE + "\"");
        System.out.println("ERRO_ARQUIVO = " + FILE_ERROR + ": \"" + FILE_ERROR_MESSAGE + "\"");
        System.out.println("ERRO_REDE = " + NETWORK_ERROR + ": \"" + NETWORK_ERROR_MESSAGE + "\"");
        System.out.println("ERRO_MEMORIA = " + MEMORY_ERROR + ": \"" + MEMORY_ERROR_MESSAGE + "\"");

        System.out.println();
        System.out.println("Simulando erros:");

        int simulatedCount = 0;

        displayError(LOGIN_ERROR, LOGIN_ERROR_MESSAGE);
        simulatedCount++;

        displayError(FILE_ERROR, FILE_ERROR_MESSAGE);
        simulatedCount++;

        displayError(NETWORK_ERROR, NETWORK_ERROR_MESSAGE);
        simulatedCount++;

        System.out.println();
        System.out.println("Total de tipos de erro: 5");
        System.out.println("Erros simulados: " + simulatedCount);
    }

    public static void displayError(int code, String message) {
        System.out.println("[ERRO " + code + "] " + message);
    }
}