package org.samuelcursine;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número N (1 a 9): ");
        int n = sc.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("Entrada inválida.");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println("--- TABUADA DO " + i + " ---");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();
            }
        }

        sc.close();
    }
}