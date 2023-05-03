package ExQuatro;//        Escreva um programa que leia um número em polegadas e o
//        converta em metros. Nota: Uma polegada é 0,0254 metros.


import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero em polegada");
        int polegada = teclado.nextInt();

        converterPolegadas(polegada);

    }

    public static void converterPolegadas(int polegada){


        double metro = polegada *0.0254;
        System.out.println("Conversão de polegadas em metros é: " + metro  + "m");
    }
}
