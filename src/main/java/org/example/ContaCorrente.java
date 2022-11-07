package org.example;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo) {
        super.depositar(saldo);
    }
        
    /*@Override
    public void imprimirExtrato()
    {
        System.out.println("=== Conta Corrente ===");
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }*/

    @Override
    public String toString() {
        return "ContaCorrente numero: " + numero +
                ", saldo=" + saldo;
    }
}
