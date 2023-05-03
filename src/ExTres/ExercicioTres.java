package ExTres;//        Escreva um método para verificar se uma string é uma senha
//        válida.
//
//        Regras de senha:
//        - Uma senha deve ter pelo menos dez caracteres.
//        - Uma senha consiste apenas em letras e dígitos.
//        - Uma senha deve conter pelo menos dois dígitos.

// precisa terminar

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

    }

    public static boolean validarSenha(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = teclado.next();

        if (senha.length() > 10){
            for (char caracter:senha.toCharArray()) {
                
            }
        }
        return true;
    }
}
