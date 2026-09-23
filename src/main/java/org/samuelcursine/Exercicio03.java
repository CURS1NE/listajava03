package org.samuelcursine;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Digite sua nota (0 - 10): ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido!");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota aceita: " + nota);
    }
}
