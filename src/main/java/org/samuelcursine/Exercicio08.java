package org.samuelcursine;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        int quantidade = 0;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.print("Digite um valor inteiro (0 para encerrar): ");
        valor = sc.nextInt();

        if (valor == 0) {
            System.out.println("Nenhum valor foi lido.");
        } else {
            while (valor != 0) {
                quantidade++;
                soma += valor;

                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }

                System.out.print("Digite o próximo valor (0 para encerrar): ");
                valor = sc.nextInt();
            }

            System.out.println("Quantidade de valores lidos: " + quantidade);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }


    }
}
