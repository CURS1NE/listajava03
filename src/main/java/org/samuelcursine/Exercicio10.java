package org.samuelcursine;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalCompra = 0;
        int quantidadeItens = 0;

        while (true) {
            System.out.print("Digite o código do produto (0 para finalizar): ");
            int codigo = sc.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite o preço unitário: R$ ");
            double preco = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            totalCompra += preco * quantidade;
            quantidadeItens += quantidade;
            System.out.println();
        }

        System.out.println("\n--- FORMA DE PAGAMENTO ---");
        System.out.println("1 - Dinheiro (5% de desconto)");
        System.out.println("2 - Débito (sem alteração)");
        System.out.println("3 - Crédito (3% de acréscimo)");
        System.out.print("Escolha a opção: ");
        int formaPagamento = sc.nextInt();

        switch (formaPagamento) {
            case 1 -> totalCompra -= totalCompra * 0.05;
            case 2 -> {}
            case 3 -> totalCompra += totalCompra * 0.03;
            default -> System.out.println("Opção de pagamento inválida! O total permanece sem alteração.");
        }

        if (totalCompra > 300.00) {
            System.out.println("Aviso: Compra grande.");
        }

        if (quantidadeItens > 20) {
            System.out.println("Aviso: Muitos itens.");
        }

        System.out.printf("Total de itens: %d%n", quantidadeItens);
        System.out.printf("Valor total a pagar: R$ %.2f%n", totalCompra);

        sc.close();
    }
}