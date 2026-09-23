package org.samuelcursine;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Intervalo inválido");
        } else {
            int soma = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    soma += i;
                }
            }
            System.out.println("Soma dos números pares: " + soma);
        }


    }
}