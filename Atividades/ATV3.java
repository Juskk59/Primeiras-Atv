package Atividades;

import java.util.Scanner;

public class ATV3 {
    public static void main(String[] args){
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = n1.nextLine();

        System.out.println("Digite a sua idade: ");
        String idade = n2.nextLine();
        
        System.out.println("Deseja que o o seu nome e sua idade sejam mostradas ?(s/n)");
        String opcao = n3.nextLine();

        if (opcao.equals("s")) {
            System.out.println("Olá " + nome + " você tem " + idade + " anos.");
        }
        else{
            System.out.println("Olá Usuário, suas informações estão seguras");
        }
        n1.close();
        n2.close();
        n3.close();
    }
}
