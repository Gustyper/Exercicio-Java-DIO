package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        List<Cliente> listaClientes = new ArrayList<>();
        String inputString;
        int inputInt;
        boolean finalizar = false;

        while(!finalizar)
        {
            showMenu();
            Scanner scan = new Scanner(System.in);

            inputInt = scan.nextInt();

            if(inputInt == 1){
                System.out.println("Digite seu nome: ");
                inputString = scan.next();
                Cliente cliente = new Cliente(inputString);
                System.out.println("Conta poupança(P) ou corrente(C)? ");
                inputString = scan.next();

                if(inputString.equalsIgnoreCase("P")) {
                    cliente.conta = new ContaPoupanca(0.0d);
                } else if(inputString.equalsIgnoreCase("C")){
                    cliente.conta = new ContaCorrente(0.0d);
                }

                listaClientes.add(cliente);
            }
            else if(inputInt == 2) {
                for(Cliente cliente : listaClientes)
                {
                    System.out.println(cliente);
                }
            }
            else if(inputInt == 3) {
                System.out.println("Digite o nome da conta que deseja operar: ");
                String ContaOperada= scan.next();

                for(Cliente cliente: listaClientes) {
                    if(cliente.getNome().equals(ContaOperada))
                    {
                        System.out.println("Deseja sacar(S), depositar(D) ou transferir(T)? ");
                        ContaOperada = scan.next();
                        if(ContaOperada.equalsIgnoreCase("S"))
                        {
                            System.out.println("Deseja sacar qual valor? ");
                            inputInt = scan.nextInt();
                            cliente.conta.sacar(inputInt);
                        }
                        else if(ContaOperada.equalsIgnoreCase("D"))
                        {
                            System.out.println("Deseja depositar qual valor? ");
                            inputInt = scan.nextInt();
                            cliente.conta.depositar(inputInt);
                        }
                        else if(ContaOperada.equalsIgnoreCase("T")){
                            System.out.println("Deseja transferir quanto? ");
                            inputInt = scan.nextInt();
                            System.out.println("Para quem?");
                            inputString = scan.next();
                            for(Cliente possiveisDestinos: listaClientes)
                            {
                                if(possiveisDestinos.getNome().equals(inputString))
                                {
                                    cliente.conta.transferir(inputInt, possiveisDestinos.conta);
                                    break;
                                }
                            }
                        }
                    }
                }

            } else { finalizar = true;}
        }
    }

    public static void showMenu()
    {
        System.out.println("========BANCO=======");
        System.out.println("1- Nova Conta");
        System.out.println("2- Lista de Clientes");
        System.out.println("3- Operar");
        System.out.println("--------------------");
        System.out.println("Qualquer outro numero para encerrar");
    }
}
