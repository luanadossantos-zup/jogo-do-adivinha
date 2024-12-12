import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nivelDificuldade = 0;
        int numeroAleatorio = 0;



        System.out.println("-------------------------------------");
        System.out.println("Olá, bem vindo ao Jogo do Adivinha!");
        System.out.println("-------------------------------------");
        System.out.println(" ");


        jogandoOJogo(scanner, numeroAleatorio);


    }

    public static int jogadorSelecionaDificuldadeRetornaRandom (Scanner scanner, int numeroAleatorio) {
        int nivelDificuldade = 0;

        System.out.println("Por favor, digite um número para selecionar a dificuldade:");


        do {
            System.out.println("1 - Fácil");
            System.out.println("2 - Médio");
            System.out.println("3 - Difícil");
            try {
                nivelDificuldade = scanner.nextInt();

                if (nivelDificuldade < 1 || nivelDificuldade > 4) {
                    System.out.println("-------------------------------------");
                    System.out.println("Por favor, apenas números de 1 a 3!");
                    System.out.println("-------------------------------------");

                }

            } catch (Exception e) {
                System.out.println("-------------------------------------");
                System.out.println("Por favor, apenas números de 1 a 3!");
                System.out.println("-------------------------------------");
                scanner.next();

            }



        } while(nivelDificuldade >3 || nivelDificuldade <1);

        return numeroAleatorio = numeroAleatorio(nivelDificuldade);
    }

    public static int numeroAleatorio (int nivelDificuldade) {
        int min = 1;
        int numeroAleatorio = 0;
        switch (nivelDificuldade) {

            case 1 :
                numeroAleatorio = min + (int)(Math.random() * ((10 - min) + 1));
                break;

            case 2 :
                numeroAleatorio = min + (int)(Math.random() * ((50 - min) + 1));
                break;

            case 3 :
                numeroAleatorio = min + (int)(Math.random() * ((100 - min) + 1));
                break;
        }


        return numeroAleatorio;
    }

    public static void jogandoOJogo(Scanner scanner, int numeroAleatorio) {
        ArrayList<Integer> acertos = new ArrayList<>();
        ArrayList<Integer> erros = new ArrayList<>();
        int pontuacao = 0;
        int numeroEscolhido;

        String continuarJogo ="";



        do {
            numeroAleatorio = jogadorSelecionaDificuldadeRetornaRandom(scanner, numeroAleatorio);

            try {
                System.out.println("Faça seu palpite. Digite um número:");
                numeroEscolhido = scanner.nextInt();

                if (numeroEscolhido == numeroAleatorio) {
                    System.out.println("Parabéns, você acertou o número");
                    pontuacao = pontuacao + 10;
                    acertos.add(numeroEscolhido);

                } else if (numeroEscolhido == numeroAleatorio +1 || numeroEscolhido == numeroAleatorio -1) {
                    System.out.println("Quase lá! Você estava a 1 de distância do número sorteado. Você ganhou 5 pontos.");
                    pontuacao = pontuacao +5;
                    erros.add(numeroAleatorio);
                } else {
                    System.out.println("Infelizmente você não acertou e não ganhou nenhum ponto!");
                    erros.add(numeroAleatorio);
                }
            } catch (Exception e) {
                System.out.println("-------------------------------------");
                System.out.println("Por favor, digite apenas números!");
                System.out.println("-------------------------------------");
                scanner.next();
            }

            System.out.println("Continuar jogo? Digite S para Sim ou qualquer tecla para não:");
            continuarJogo = scanner.next().toLowerCase();

        } while (continuarJogo.equals("s"));

        System.out.println("Pontuação final " + pontuacao + " pontos.");
        System.out.println("Números acertados: " + acertos);
        System.out.println("Números errados: " + erros);

        System.exit(0);

    }


}