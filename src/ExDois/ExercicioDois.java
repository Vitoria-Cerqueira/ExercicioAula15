package ExDois;
 //        Escreva um método que verifique se todos os caracteres em
//        uma determinada string são vogais ou não. Retorne true se
//        cada caractere na string for uma vogal, caso contrário, retorna
//        false.



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



        for (char caracter:palavra.toCharArray()) { // aqui estou convertendo palavras para um array de caracter
            for (int i = 0; i < vogais.length; i++) { // aqui estou percorrendo o vetor de vogais
                if (caracter != vogais[i]){             // e aqui estou verificando se o caracter digitado é diferente de vogais

                    if (i == vogais.length -1){  // estou fazendo isso para que ele percorra o vetor inteiro, não so a primeira letra
                        return false;
                    }

                }else {
                    break;
                }
            }


        }
        return true;
    }

}


