package com.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirEstrato() {
        System.out.println("=== Extrato Conta Corrente === ");
        super.imprimeInforsComuns();
    }

}
