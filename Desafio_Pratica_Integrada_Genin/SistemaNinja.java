package Desafio_Pratica_Integrada_Genin ;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// ==================== EXCEÇÃO PERSONALIZADA ====================
class ChakraInsuficienteException extends Exception {
    public ChakraInsuficienteException(String message) {
        super(message);
    }
}

// ==================== CLASSE NINJA ====================
class Ninja {

    public static final String[] VALID_RANKS = {"Genin", "Chunin", "Jounin", "Kage"};
    public static final String[] VALID_CLANS = {"Uchiha", "Uzumaki", "Hyuga", "Nara", "Sem clã"};

    private static int totalNinjas = 0;

    private String name;
    private String clan;
    private String rank;
    private int chakra;

    public Ninja(String name, String clan, String rank, int chakra) {
        this.name = name;
        this.clan = clan;
        this.rank = rank;
        this.chakra = chakra;
        totalNinjas++;
    }

    public static int getTotalNinjas() {
        return totalNinjas;
    }

    public String getName() {
        return name;
    }

    public String getClan() {
        return clan;
    }

    public String getRank() {
        return rank;
    }

    public int getChakra() {
        return chakra;
    }

    public void consumeChakra(int amount) throws ChakraInsuficienteException {
        if (amount > chakra) {
            throw new ChakraInsuficienteException(
                name + " não tem chakra suficiente! (Necessário: " + amount + ", Disponível: " + chakra + ")"
            );
        }
        chakra -= amount;
    }

    @Override
    public String toString() {
        return name + " | Clã: " + clan + " | Rank: " + rank + " | Chakra: " + chakra;
    }
}

// ==================== CLASSE MISSAO ====================
class Missao {

    public static final String STATUS_PENDING = "Pendente";
    public static final String STATUS_IN_PROGRESS = "Em andamento";
    public static final String STATUS_COMPLETED = "Concluída";

    private static int totalMissions = 0;

    private String name;
    private String rank;
    private int minChakra;
    private String status;
    private Ninja assignedNinja;

    public Missao(String name, String rank, int minChakra) {
        this.name = name;
        this.rank = rank;
        this.minChakra = minChakra;
        this.status = STATUS_PENDING;
        this.assignedNinja = null;
        totalMissions++;
    }

    public static int getTotalMissions() {
        return totalMissions;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getMinChakra() {
        return minChakra;
    }

    public String getStatus() {
        return status;
    }

    public Ninja getAssignedNinja() {
        return assignedNinja;
    }

    public void assign(Ninja ninja) {
        this.assignedNinja = ninja;
        this.status = STATUS_IN_PROGRESS;
    }

    public void complete() {
        this.status = STATUS_COMPLETED;
    }

    @Override
    public String toString() {
        String responsible = (assignedNinja == null) ? "Ninguém" : assignedNinja.getName();
        return name + " | Rank: " + rank + " | Chakra mín: " + minChakra +
               " | Status: " + status + " | Responsável: " + responsible;
    }
}

// ==================== SISTEMA PRINCIPAL ====================
public class SistemaNinja {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Ninja> ninjas = new ArrayList<>();
    static ArrayList<Missao> missions = new ArrayList<>();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("=== SISTEMA DE MISSÕES NINJA ===");

        while (running) {
            System.out.println();
            System.out.println("--- SISTEMA DE MISSÕES NINJA ---");
            System.out.println("1 - Cadastrar ninja");
            System.out.println("2 - Cadastrar missão");
            System.out.println("3 - Atribuir missão a ninja");
            System.out.println("4 - Listar ninjas");
            System.out.println("5 - Listar missões");
            System.out.println("6 - Relatório de missões concluídas/pendentes");
            System.out.println("7 - Concluir missão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int option = readIntSafely();

            if (option == Integer.MIN_VALUE) {
                System.out.println("Opção inválida! Digite um número.");
                continue;
            }

            switch (option) {
                case 1:
                    registerNinja();
                    break;
                case 2:
                    registerMission();
                    break;
                case 3:
                    assignMission();
                    break;
                case 4:
                    listNinjas();
                    break;
                case 5:
                    listMissions();
                    break;
                case 6:
                    missionReport();
                    break;
                case 7:
                    completeMission();
                    break;
                case 0:
                    System.out.println("Encerrando sistema... Até a próxima missão!");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }

    // ---------- LEITURA SEGURA DE INTEIROS ----------
    static int readIntSafely() {
        try {
            int value = scanner.nextInt();
            scanner.nextLine();
            return value;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            return Integer.MIN_VALUE;
        }
    }

    // ---------- CADASTRO DE NINJA ----------
    static void registerNinja() {
        System.out.println();
        System.out.println("=== CADASTRAR NINJA ===");

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        if (name.isBlank()) {
            System.out.println("Erro: o nome não pode ser vazio.");
            return;
        }

        System.out.println("Clãs disponíveis: " + arrayToString(Ninja.VALID_CLANS));
        System.out.print("Clã: ");
        String clan = scanner.nextLine();

        System.out.println("Ranks disponíveis: " + arrayToString(Ninja.VALID_RANKS));
        System.out.print("Rank: ");
        String rank = scanner.nextLine();

        if (!isValidOption(rank, Ninja.VALID_RANKS)) {
            System.out.println("Erro: rank inválido!");
            return;
        }

        System.out.print("Chakra: ");
        int chakra = readIntSafely();

        if (chakra == Integer.MIN_VALUE || chakra < 0) {
            System.out.println("Erro: chakra inválido!");
            return;
        }

        Ninja ninja = new Ninja(name, clan, rank, chakra);
        ninjas.add(ninja);

        System.out.println("Ninja cadastrado com sucesso: " + ninja);
    }

    // ---------- CADASTRO DE MISSÃO ----------
    static void registerMission() {
        System.out.println();
        System.out.println("=== CADASTRAR MISSÃO ===");

        System.out.print("Nome da missão: ");
        String name = scanner.nextLine();

        if (name.isBlank()) {
            System.out.println("Erro: o nome da missão não pode ser vazio.");
            return;
        }

        System.out.println("Ranks disponíveis: " + arrayToString(Ninja.VALID_RANKS));
        System.out.print("Rank exigido: ");
        String rank = scanner.nextLine();

        System.out.print("Chakra mínimo necessário: ");
        int minChakra = readIntSafely();

        if (minChakra == Integer.MIN_VALUE || minChakra < 0) {
            System.out.println("Erro: chakra mínimo inválido!");
            return;
        }

        Missao mission = new Missao(name, rank, minChakra);
        missions.add(mission);

        System.out.println("Missão cadastrada com sucesso: " + mission);
    }

    // ---------- ATRIBUIÇÃO DE MISSÃO ----------
    static void assignMission() {
        System.out.println();
        System.out.println("=== ATRIBUIR MISSÃO A NINJA ===");

        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado ainda.");
            return;
        }
        if (missions.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada ainda.");
            return;
        }

        System.out.print("Nome do ninja: ");
        String ninjaName = scanner.nextLine();

        System.out.print("Nome da missão: ");
        String missionName = scanner.nextLine();

        try {
            Ninja ninja = findNinja(ninjaName);
            Missao mission = findMission(missionName);

            ninja.consumeChakra(mission.getMinChakra());
            mission.assign(ninja);

            System.out.println("Missão \"" + mission.getName() + "\" atribuída a " + ninja.getName() + " com sucesso!");
            System.out.println("Chakra restante de " + ninja.getName() + ": " + ninja.getChakra());

        } catch (ChakraInsuficienteException e) {
            System.out.println("Erro ao atribuir missão: " + e.getMessage());
        } catch (NoSuchElementCustomException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // ---------- CONCLUIR MISSÃO ----------
    static void completeMission() {
        System.out.println();
        System.out.println("=== CONCLUIR MISSÃO ===");

        if (missions.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        System.out.print("Nome da missão a concluir: ");
        String missionName = scanner.nextLine();

        try {
            Missao mission = findMission(missionName);

            if (mission.getAssignedNinja() == null) {
                System.out.println("Essa missão ainda não foi atribuída a nenhum ninja.");
                return;
            }

            mission.complete();
            System.out.println("Missão \"" + mission.getName() + "\" marcada como concluída!");

        } catch (NoSuchElementCustomException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // ---------- LISTAGENS ----------
    static void listNinjas() {
        System.out.println();
        System.out.println("=== LISTA DE NINJAS ===");

        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado.");
            return;
        }

        for (int i = 0; i < ninjas.size(); i++) {
            System.out.println((i + 1) + ". " + ninjas.get(i));
        }
        System.out.println("Total de ninjas: " + Ninja.getTotalNinjas());
    }

    static void listMissions() {
        System.out.println();
        System.out.println("=== LISTA DE MISSÕES ===");

        if (missions.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        for (int i = 0; i < missions.size(); i++) {
            System.out.println((i + 1) + ". " + missions.get(i));
        }
        System.out.println("Total de missões: " + Missao.getTotalMissions());
    }

    // ---------- RELATÓRIO ----------
    static void missionReport() {
        System.out.println();
        System.out.println("=== RELATÓRIO DE MISSÕES ===");

        if (missions.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        ArrayList<Missao> pending = new ArrayList<>();
        ArrayList<Missao> inProgress = new ArrayList<>();
        ArrayList<Missao> completed = new ArrayList<>();

        for (Missao mission : missions) {
            switch (mission.getStatus()) {
                case Missao.STATUS_PENDING:
                    pending.add(mission);
                    break;
                case Missao.STATUS_IN_PROGRESS:
                    inProgress.add(mission);
                    break;
                case Missao.STATUS_COMPLETED:
                    completed.add(mission);
                    break;
            }
        }

        System.out.println("Pendentes (" + pending.size() + "):");
        for (Missao m : pending) {
            System.out.println("  - " + m);
        }

        System.out.println("Em andamento (" + inProgress.size() + "):");
        for (Missao m : inProgress) {
            System.out.println("  - " + m);
        }

        System.out.println("Concluídas (" + completed.size() + "):");
        for (Missao m : completed) {
            System.out.println("  - " + m);
        }
    }

    // ---------- MÉTODOS AUXILIARES ----------
    static Ninja findNinja(String name) throws NoSuchElementCustomException {
        for (Ninja ninja : ninjas) {
            if (ninja.getName().equalsIgnoreCase(name)) {
                return ninja;
            }
        }
        throw new NoSuchElementCustomException("Ninja \"" + name + "\" não encontrado.");
    }

    static Missao findMission(String name) throws NoSuchElementCustomException {
        for (Missao mission : missions) {
            if (mission.getName().equalsIgnoreCase(name)) {
                return mission;
            }
        }
        throw new NoSuchElementCustomException("Missão \"" + name + "\" não encontrada.");
    }

    static boolean isValidOption(String value, String[] validOptions) {
        for (String option : validOptions) {
            if (option.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    static String arrayToString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

// ==================== SEGUNDA EXCEÇÃO PERSONALIZADA ====================
class NoSuchElementCustomException extends Exception {
    public NoSuchElementCustomException(String message) {
        super(message);
    }
}