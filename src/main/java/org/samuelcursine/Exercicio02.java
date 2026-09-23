package org.samuelcursine;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if (num < 1){
            System.out.println("Não há valores a serem exibidos");
        }
        else{
            for (int i = 1; i <= num; i++){
                System.out.println("" + num + " X " + i + " = " + (num * i));
            }
        }

    }
}
