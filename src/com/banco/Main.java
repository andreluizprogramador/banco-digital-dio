package com.banco;

public class Main {

    public static void main(String[] args){

        Cliente Andre = new Cliente();
        Andre.setNome("André Luiz");

        Conta cc = new ContaCorrente(Andre);
        cc.sacar(30);
        cc.depositar(100);

        Conta po = new ContaPoupanca(Andre);
        po.transferir(50, cc, po);

        cc.imprimirEstrato();
        po.imprimirEstrato();
    }

}
