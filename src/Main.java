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
        while (contadorPerguntas < 15) {
            contadorPerguntas++;
            System.out.println("Pergunta " + contadorPerguntas + ":");
            switch (contadorPerguntas) {
                case 1:
                    System.out.println("O animal tem pelo? (sim/não)");
                    break;
                case 2:
                    System.out.println("O animal é carnivoro? (sim/não)");
                    break;
                case 3:
                    System.out.println("O animal vive na água? (sim/não)");
                    break;
                case 4:
                    System.out.println("O animal é um felino? (sim/não)");
                    break;
                case 5:
                    System.out.println("O animal possui listras? (sim/não)");
                    break;
                // Adicione mais perguntas aqui conforme necessário
                default:
                    System.out.println("Digite uma característica do animal:");
                    break;
            }
            String resposta = scanner.nextLine().toLowerCase();

            // Eliminar animais da lista com base na resposta
            for (int i = animais.size() - 1; i >= 0; i--) {
                Animal animal = animais.get(i);
                switch (contadorPerguntas) {
                    case 1:
                        if ((resposta.equals("sim") && !animal.temPelo()) || (resposta.equals("não") && animal.temPelo())) {
                            animais.remove(i);
                        }
                        break;
                    case 2:
                        if ((resposta.equals("sim") && !animal.isCarnivoro()) || (resposta.equals("não") && animal.isCarnivoro())) {
                            animais.remove(i);
                        }
                        break;
                    case 3:
                        // Adicione lógica para perguntas adicionais conforme necessário
                        break;
                    case 4:
                        // Adicione lógica para perguntas adicionais conforme necessário
                        break;
                    case 5:
                        // Adicione lógica para perguntas adicionais conforme necessário
                        break;
                    default:
                        // Adicione lógica para perguntas adicionais conforme necessário
                        break;
                }
            }

            // Verificar se só resta um animal na lista
            if (animais.size() == 1) {
                System.out.println("O animal é: " + animais.get(0).getNome());
                System.exit(0); // Encerrar o programa
            } else if (animais.isEmpty()) {
                System.out.println("Não há animais que correspondam às suas respostas.");
                System.exit(0); // Encerrar o programa
            }
        }

        // Exibir os animais restantes
        if (animais.size() > 1) {
            System.out.println("Os possíveis animais são:");
            for (Animal animal : animais) {
                System.out.println(animal.getNome());
            }
        }
    }

    // Método para inicializar os animais
    private static List<Animal> inicializarAnimais() {
        List<Animal> animais = new ArrayList<>();
        // Adicione os animais à lista aqui
        animais.add(new Animal("Leopardo", true, true));
        animais.add(new Animal("Jaguar", true, true));
        animais.add(new Animal("Guepardo", true, true));
        animais.add(new Animal("Puma", true, true));
        animais.add(new Animal("Gato-do-mato", true, true));
        animais.add(new Animal("Lince", true, true));
        animais.add(new Animal("Tigre", true, true));
        animais.add(new Animal("Leão", true, true));
        animais.add(new Animal("Lobo", true, true));
        animais.add(new Animal("Hiena", true, true));
        return animais;
    }
}
