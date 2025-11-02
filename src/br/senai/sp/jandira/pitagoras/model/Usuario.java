package br.senai.sp.jandira.pitagoras.model;

import java.util.Scanner;

public class Usuario {

    int numeroEscolhido;
    double valorCateto1;
    double valorCateto2;
    double valorHipotenusa;

    public void obterEscolha(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, a calculadora está iniciando...");
        System.out.println("Veja os itens abaixo:");
        System.out.println("[1] Cateto");
        System.out.println("[2] Hipotenusa");
        System.out.print("Qual deles você quer descobrir? (digite 1 ou 2): ");
        numeroEscolhido = leitor.nextInt();

        System.out.println(numeroEscolhido);
    }
}
