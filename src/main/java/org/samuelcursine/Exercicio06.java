package org.samuelcursine;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Entrada invalida");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + num + " = " + fatorial);
        }


    }
}