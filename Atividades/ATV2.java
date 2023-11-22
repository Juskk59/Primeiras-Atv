package Atividades;

import java.util.Scanner;

public class ATV2 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        Scanner sobrenome = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nomes = nome.nextLine();
        
        System.out.println("Agora seu sobrenome: ");
        String sobres = sobrenome.nextLine();
        
        System.out.println("Olá " + nomes +" " +sobres);

        nome.close();
        sobrenome.close();
    }
}
