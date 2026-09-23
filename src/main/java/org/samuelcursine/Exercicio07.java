package org.samuelcursine;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade de alunos inválida.");
        } else {
            double somaNotas = 0;
            int aprovados = 0;
            int reprovados = 0;

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite a nota do aluno " + i + ": ");
                double nota = sc.nextDouble();

                somaNotas += nota;

                if (nota >= 6.0) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

            double media = somaNotas / quantidade;

            System.out.printf("Média da turma: %.2f%n", media);
            System.out.println("Alunos com nota >= 6: " + aprovados);
            System.out.println("Alunos com nota < 6: " + reprovados);
        }

        sc.close();
    }
}