package ExUm;
//        Escreva um método para verificar se cada dígito de um
//        determinado número inteiro é par. Retorna verdadeiro se todos
//        os dígitos forem pares, caso contrário, falso.


import java.util.Scanner;

public class ExercicioUm { // é uma class
    public static void main(String[] args) { // é um metodo principal

        System.out.println(conferir()); // ele está printando o return desse metodo
        }


        public static boolean conferir(){ // é um metodo da classe
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        String num = teclado.next(); // receber e guardar um valor na variavel num


        for (int i = 0; i < num.length(); i++) {
            char digito = num.charAt(i); // serve para guardar caracter - um caracter do valor inserido
            int teste = Integer.parseInt(String.valueOf(digito)); // estou transformando esse caracter em um tipo inteiro

            if (teste % 2 !=0){ // aqui está dividindo para saber se o resto é diferente de zero
                return false;

            }
        }
            return true;
        }
}






