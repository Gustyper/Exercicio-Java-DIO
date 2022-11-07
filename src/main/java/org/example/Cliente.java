package org.example;

import lombok.Getter;

public class Cliente {
    @Getter
    public String nome;

    public Conta conta;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", conta=" + conta +
                '}';
    }
}
