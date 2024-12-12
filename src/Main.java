import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nivelDificuldade = 0;
        int numeroAleatorio = 0;
        int numeroDeRodadas;


        System.out.println("-------------------------------------");
        System.out.println("Olá, bem vindo ao Jogo do Adivinha!");
        System.out.println("-------------------------------------");
        System.out.println(" ");


        numeroAleatorio = jogadorSelecionaDificuldade(scanner, nivelDificuldade,numeroAleatorio);


    }

    public static int jogadorSelecionaDificuldade (Scanner scanner, int nivelDificuldade,int numeroAleatorio) {
        System.out.println("Digite um número para selecionar a dificuldade:");


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


}