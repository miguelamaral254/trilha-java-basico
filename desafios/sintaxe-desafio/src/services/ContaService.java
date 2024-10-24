package services;

import domain.entities.Conta;

import java.util.Scanner;

public class ContaService {
    private Scanner scanner;

    public ContaService() {
        this.scanner = new Scanner(System.in);
    }

    public Conta criarConta() {
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = Double.parseDouble(scanner.next().replace(",", "."));

        return new Conta(numero, agencia, nomeCliente, saldo);
    }

    public void fecharScanner() {
        scanner.close();
    }
}
