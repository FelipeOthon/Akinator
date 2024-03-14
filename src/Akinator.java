import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Akinator {

    public static void main(String[] args) {
        // Inicializar a lista de animais
        List<Animal> animais = inicializarAnimais();

        // Contador de perguntas
        int contadorPerguntas = 0;

        // Loop do jogo
        Scanner scanner = new Scanner(System.in);
        do {
            contadorPerguntas++;
            System.out.println("Pergunta " + contadorPerguntas + ":");

            switch (contadorPerguntas) {
                case 1:
                    System.out.println("O animal tem pelo? (1 - sim / 2 - não)");
                    break;
                case 2:
                    System.out.println("O animal é carnívoro? (1 - sim / 2 - não)");
                    break;
                case 3:
                    System.out.println("O animal é grande? (1 - sim / 2 - não)");
                    break;
                case 4:
                    System.out.println("O animal vive em florestas? (1 - sim / 2 - não)");
                    break;
                case 5:
                    System.out.println("O animal tem uma pelagem manchada? (1 - sim / 2 - não)");
                    break;
                case 6:
                    System.out.println("O animal é capaz de nadar? (1 - sim / 2 - não)");
                    break;
                case 7:
                    System.out.println("O animal é territorial? (1 - sim / 2 - não)");
                    break;
                case 8:
                    System.out.println("O animal é noturno? (1 - sim / 2 - não)");
                    break;
                case 9:
                    System.out.println("O animal é solitário? (1 - sim / 2 - não)");
                    break;
                case 10:
                    System.out.println("O animal tem garras afiadas? (1 - sim / 2 - não)");
                    break;
                case 11:
                    System.out.println("O animal é rápido? (1 - sim / 2 - não)");
                    break;
                case 12:
                    System.out.println("O animal tem hábitos migratórios? (1 - sim / 2 - não)");
                    break;
                case 13:
                    System.out.println("O animal é um predador? (1 - sim / 2 - não)");
                    break;
                case 14:
                    System.out.println("O animal é social? (1 - sim / 2 - não)");
                    break;
                case 15:
                    System.out.println("O animal é herbívoro? (1 - sim / 2 - não)");
                    break;
            }

            int resposta;
            do {
                System.out.print("Resposta: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Resposta inválida. Digite 1 para sim ou 2 para não:");
                    scanner.next();
                }
                resposta = scanner.nextInt();
            } while (resposta != 1 && resposta != 2);

            // Converte a resposta para "sim" ou "não"
            String respostaConvertida = resposta == 1 ? "sim" : "não";

            // Eliminar animais da lista com base na resposta
            for (int i = animais.size() - 1; i >= 0; i--) {
                Animal animal = animais.get(i);
                boolean capazDeNadar = resposta == 1 ? animal.isCapazDeNadar() : !animal.isCapazDeNadar();
                switch (contadorPerguntas) {
                    case 1:
                        if ((resposta == 1 && !animal.temPelo()) || (resposta == 2 && animal.temPelo())) {
                            animais.remove(i);
                        }
                        break;
                    case 2:
                        if ((resposta == 1 && !animal.isCarnivoro()) || (resposta == 2 && animal.isCarnivoro())) {
                            animais.remove(i);
                        }
                        break;
                    case 3:
                        if ((resposta == 1 && !animal.isGrande()) || (resposta == 2 && animal.isGrande())) {
                            animais.remove(i);
                        }
                        break;
                    case 4:
                        if ((resposta == 1 && !animal.viveEmFloresta()) || (resposta == 2 && animal.viveEmFloresta())) {
                            animais.remove(i);
                        }
                        break;
                    case 5:
                        if ((resposta == 1 && !animal.temPelagemManchada()) || (resposta == 2 && animal.temPelagemManchada())) {
                            animais.remove(i);
                        }
                        break;
                    case 6:
                        if ((resposta == 1 && !capazDeNadar) || (resposta == 2 && capazDeNadar)) {
                            animais.remove(i);
                        }
                        break;
                    case 7:
                        // Lógica para pergunta 7
                        break;
                    case 8:
                        // Lógica para pergunta 8
                        break;
                    case 9:
                        // Lógica para pergunta 9
                        break;
                    case 10:
                        // Lógica para pergunta
                        // Lógica para pergunta 10
                        if ((resposta == 1 && !animal.temGarrasAfiadas()) || (resposta == 2 && animal.temGarrasAfiadas())) {
                            animais.remove(i);
                        }
                        break;
                    case 11:
                        // Lógica para pergunta 11
                        if ((resposta == 1 && !animal.eRapido()) || (resposta == 2 && animal.eRapido())) {
                            animais.remove(i);
                        }
                        break;
                    case 12:
                        // Lógica para pergunta 12
                        if ((resposta == 1 && !animal.temHabitosMigratorios()) || (resposta == 2 && animal.temHabitosMigratorios())) {
                            animais.remove(i);
                        }
                        break;
                    case 13:
                        // Lógica para pergunta 13
                        if ((resposta == 1 && !animal.ePredador()) || (resposta == 2 && animal.ePredador())) {
                            animais.remove(i);
                        }
                        break;
                    case 14:
                        // Lógica para pergunta 14
                        if ((resposta == 1 && animal.eSocial()) || (resposta == 2 && !animal.eSocial())) {
                            animais.remove(i);
                        }
                        break;
                    case 15:
                        // Lógica para pergunta 15
                        if ((resposta == 1 && animal.eHerbivoro()) || (resposta == 2 && !animal.eHerbivoro())) {
                            animais.remove(i);
                        }
                        break;
                }
            }

            // Verificar se só resta um animal na lista
            if (animais.size() == 1) {
                System.out.println("O animal é: " + animais.get(0).getNome());
                System.exit(0); // Encerrar o programa
            }
        } while (contadorPerguntas < 15 && contadorPerguntas >= 5 && animais.size() > 1); // Encerrar após 15 perguntas ou quando houver somente um animal restante
    }

    // Método para inicializar os animais
    private static List<Animal> inicializarAnimais() {
        List<Animal> animais = new ArrayList<>();
        // Adicione os animais à lista aqui
        animais.add(new Animal("Leopardo", true, true, true, false, true, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Jaguar", true, true, true, false, true, true, true, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Guepardo", true, true, true, false, false, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Puma", true, true, true, false, false, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Gato-do-mato", true, true, false, true, false, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Lince", true, true, false, true, false, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Tigre", true, true, true, false, true, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Leão", true, true, true, false, false, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Lobo", true, true, true, true, false, false, false, false, false, false, false, false, false, false, false));
        animais.add(new Animal("Hiena", true, true, true, true, false, false, false, false, false, false, false, false, false, false, false));
        return animais;
    }
}
