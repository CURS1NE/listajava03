package org.samuelcursine;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Dobro");
            System.out.println("2 - Metade");
            System.out.println("3 - Quadrado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();


            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite um número: ");
                double numero = sc.nextDouble();

                switch (opcao) {
                    case 1 -> System.out.println("Dobro: " + (numero * 2));
                    case 2 -> System.out.println("Metade: " + (numero / 2));
                    case 3 -> System.out.println("Quadrado: " + (numero * numero));
                }
            } else if (opcao == 0) {
                System.out.println("Encerrando o programa");
            } else {
                System.out.println("Opção inválida! Tente novamente");
            }

        } while (opcao != 0);


    }
}