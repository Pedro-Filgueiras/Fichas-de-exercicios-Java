package Questionário_100Questões;

public class Exercicio96 {

    public static final int MAX_LOGIN_ATTEMPTS = 3;
    public static final int SESSION_TIMEOUT = 1800; // segundos
    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int MAX_ONLINE_USERS = 100;

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CONFIGURAÇÃO ===");
        System.out.println();

        System.out.println("Configurações ativas:");
        System.out.println("MAX_TENTATIVAS_LOGIN = " + MAX_LOGIN_ATTEMPTS);
        System.out.println("TIMEOUT_SESSAO = " + SESSION_TIMEOUT + " segundos (" + (SESSION_TIMEOUT / 60) + " minutos)");
        System.out.println("TAMANHO_MIN_SENHA = " + MIN_PASSWORD_LENGTH + " caracteres");
        System.out.println("MAX_USUARIOS_ONLINE = " + MAX_ONLINE_USERS);

        System.out.println();
        System.out.println("Simulação de uso:");

        boolean systemOk = true;

        // Validação de senha
        String password = "minhasenha123";
        boolean passwordValid = validatePasswordLength(password);
        String passwordSymbol = passwordValid ? "✓" : "✗";
        System.out.println(passwordSymbol + " Senha \"" + password + "\" (" + password.length() + " chars) " +
                (passwordValid ? "atende requisito mínimo" : "não atende requisito mínimo") +
                " (" + MIN_PASSWORD_LENGTH + ")");
        if (!passwordValid) systemOk = false;

        // Validação de tentativas de login
        int loginAttempts = 4;
        boolean attemptsValid = validateLoginAttempts(loginAttempts);
        String attemptsSymbol = attemptsValid ? "✓" : "✗";
        System.out.println(attemptsSymbol + " " + loginAttempts + " tentativas de login " +
                (attemptsValid ? "dentro do limite" : "excedem limite") +
                " (" + MAX_LOGIN_ATTEMPTS + ")");
        if (!attemptsValid) systemOk = false;

        // Validação de usuários online
        int onlineUsers = 85;
        boolean usersValid = validateOnlineUsers(onlineUsers);
        String usersSymbol = usersValid ? "✓" : "✗";
        System.out.println(usersSymbol + " " + onlineUsers + " usuários online " +
                (usersValid ? "dentro do limite" : "excedem limite") +
                " (" + MAX_ONLINE_USERS + ")");
        if (!usersValid) systemOk = false;

        // Timeout de sessão (informativo)
        System.out.println("⚠ Sessão expira em " + SESSION_TIMEOUT + " segundos");

        System.out.println();
        System.out.println("Status do sistema: " + (systemOk ? "OPERACIONAL" : "ATENÇÃO NECESSÁRIA"));
    }

    public static boolean validatePasswordLength(String password) {
        return password.length() >= MIN_PASSWORD_LENGTH;
    }

    public static boolean validateLoginAttempts(int attempts) {
        return attempts <= MAX_LOGIN_ATTEMPTS;
    }

    public static boolean validateOnlineUsers(int users) {
        return users <= MAX_ONLINE_USERS;
    }
}