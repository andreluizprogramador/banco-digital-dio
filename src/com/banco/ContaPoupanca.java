package com.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirEstrato() {
        System.out.println("=== Extrato Conta Poupança === ");
        super.imprimeInforsComuns();
    }



}
