package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super.depositar(saldo);
    }

   /* @Override
    public void imprimirExtrato()
    {
        System.out.println("=== Conta Poupança ===");
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }*/

    @Override
    public String toString() {
        return "ContaPoupanca numero: " + numero +
                ", saldo=" + saldo;

    }
}
