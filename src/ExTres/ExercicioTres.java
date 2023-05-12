package ExTres;
//        Escreva um método para verificar se uma string é uma senha
//        válida.
//
//        Regras de senha:
//        - Uma senha deve ter pelo menos dez caracteres.
//        - Uma senha consiste apenas em letras e dígitos.
//        - Uma senha deve conter pelo menos dois dígitos.

// precisa terminar

import java.util.Scanner;

public class ExercicioTres {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(validarSenha()); // chamando metodo para main
    }

    public static boolean validarSenha(){

        System.out.println("Digite sua senha: ");
        String senha = teclado.next();

        if (senha.length() > 10){ // verificando o tamanho
           if (senha.replaceAll("[A-Za-z]" ,"").length() >= 2){ // criar uma senha com no minimo 2 digitos
               if (senha.replaceAll("[0-9]", "").length() >0){ // criar a senha com no minino uma letra
                   return true;
               }
            }
        }
        System.err.println("Senha invalida");
        return validarSenha();
    }

}
