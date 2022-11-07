package org.example;

public abstract class Conta {

    private static int SEQUENCIAL = 1;

    protected int numero;
    protected double saldo;

    public Conta() {
        numero = SEQUENCIAL++;
    }
    
    public void sacar(double valor)
    {
        this.saldo -= valor;
    }
    public void depositar(double valor)
    {
        this.saldo += valor;
    }
    public void transferir(double valor, Conta destino)
    {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public int getNumero() {
        return numero;
    }
}
