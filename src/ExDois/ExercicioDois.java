package ExDois;//        Escreva um método que verifique se todos os caracteres em
//        uma determinada string são vogais ou não. Retorne true se
//        cada caractere na string for uma vogal, caso contrário, retorna
//        false.

// revisar o codigo

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        System.out.println(verificar());
    }



    public static boolean verificar(){
        char vogais[] = {'a','e','i','o','u'};

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = teclado.next();



        for (char caracter:palavra.toCharArray()) {
            for (char vogal: vogais) {
                if (caracter != vogal){

                    if (vogal == 'u'){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}


