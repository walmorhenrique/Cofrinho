package net.whenriquelsh;

import net.whenriquelsh.cofrinho.Cofrinho;
import net.whenriquelsh.cofrinho.Moedas.Dolar;
import net.whenriquelsh.cofrinho.Moedas.Euro;
import net.whenriquelsh.cofrinho.Moedas.Real;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println(" ");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido para Real");
            System.out.println("5. Calcular total convertido para uma determinada moeda");
            System.out.println("6. Sair");
            System.out.println(" ");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar moeda
                    System.out.println(" ");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.println(" ");

                    System.out.print("Escolha o tipo de moeda: ");
                    int tipoMoeda = scanner.nextInt();

                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();

                    if (tipoMoeda == 1) {
                        cofrinho.adicionar(new Dolar(valor));
                    } else if (tipoMoeda == 2) {
                        cofrinho.adicionar(new Euro(valor));
                    } else if (tipoMoeda == 3) {
                        cofrinho.adicionar(new Real(valor));
                    } else {
                        System.out.println("Tipo de moeda inválido!");
                    }
                    break;

                case 2:
                    // Remover moeda
                    System.out.println(" ");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.println(" ");

                    System.out.print("Escolha o tipo de moeda: ");
                    tipoMoeda = scanner.nextInt();
                    String tipo = "";

                    if (tipoMoeda == 1) {
                        tipo = "Dolar";
                    } else if (tipoMoeda == 2) {
                        tipo = "Euro";
                    } else if (tipoMoeda == 3) {
                        tipo = "Real";
                    } else {
                        System.out.println("Tipo de moeda inválido!");
                        break;
                    }

                    System.out.print("Digite o valor da moeda: ");
                    valor = scanner.nextDouble();

                    // Caso houver algum problema de a moeda não existir na lista ou o valor, irá imprimir a mensagem abaixo.
                    boolean removed = cofrinho.remover(tipo, valor);
                    if (!removed) {
                        System.out.println("Não foi possível remover a moeda. Verifique se a moeda existe e se há valor suficiente para remover.");
                    }
                    break;

                case 3:
                    // Listar moedas
                    System.out.println(" ");
                    cofrinho.listagemMoedas();
                    System.out.println(" ");
                    break;

                case 4:
                    // Calcular total convertido para Real
                    System.out.println(" ");
                    System.out.println("Total convertido para Real: " + cofrinho.totalConvertido());
                    System.out.println(" ");
                    break;

                case 5:
                    // Calcular total convertido para uma determinada moeda
                    System.out.println(" ");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.println(" ");

                    System.out.print("Escolha o tipo de moeda: ");
                    tipoMoeda = scanner.nextInt();
                    tipo = "";

                    if (tipoMoeda == 1) {
                        tipo = "Dolar";
                    } else if (tipoMoeda == 2) {
                        tipo = "Euro";
                    } else if (tipoMoeda == 3) {
                        tipo = "Real";
                    } else {
                        System.out.println("Tipo de moeda inválido!");
                        break;
                    }

                    double totalConvertido = cofrinho.totalConvertidoPara(tipo);
                    System.out.println(" ");
                    System.out.println("Total convertido para " + tipo + ": " + totalConvertido);
                    System.out.println(" ");
                    break;

                case 6:
                    continuar = false;
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida!");
                    System.out.println(" ");

            }
            System.out.print("Deseja continuar? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.print(" ");
                System.out.print("Você escolheu sair...");
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}