package ExCinco;//        Escreva um programa Java que receba um número do usuário
//        e gere um inteiro entre 1 e 7. Ele exibe o nome do dia da
//        semana. Nota: usem switch case.


import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro de 1 a 7: ");
        int num = teclado.nextInt();

        switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

                case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Voce escreveu errado, digite um numero de 1 a 7");
        }
    }
}
