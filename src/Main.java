import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nivelDificuldade = 0;


        System.out.println("-------------------------------------");
        System.out.println("Olá, bem vindo ao Jogo do Adivinha!");
        System.out.println("-------------------------------------");

        System.out.println("Digite um número para selecionar a dificuldade:");

        do {
            System.out.println("1 - Fácil");
            System.out.println("2 - Médio");
            System.out.println("3 - Difícil");
            try {
                nivelDificuldade = scanner.nextInt();
                numeroAleatorio(nivelDificuldade);

            } catch (Exception e) {
                System.out.println("Digite um número válido de 1 a 3!");
            }
        } while(nivelDificuldade >=4 || nivelDificuldade <=0);






    }

    public static int numeroAleatorio (int nivelDificuldade) {
        int min = 1;
        int numeroAleatorio = 0;
        switch (nivelDificuldade) {

            case 1 :
                numeroAleatorio = min + (int)(Math.random() * ((10 - min) + 1));

            case 2 :
                numeroAleatorio = min + (int)(Math.random() * ((50 - min) + 1));

            case 3 :
                numeroAleatorio = min + (int)(Math.random() * ((100 - min) + 1));
        }

        System.out.println(numeroAleatorio);
        return numeroAleatorio;
    }

}