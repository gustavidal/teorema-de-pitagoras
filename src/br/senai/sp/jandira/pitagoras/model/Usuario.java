package br.senai.sp.jandira.pitagoras.model;

import java.util.Scanner;

public class Usuario {

    int numeroEscolhido;
    double valorCateto1;
    double valorCateto2;
    double valorHipotenusa;

    Scanner leitor = new Scanner(System.in);

    public void obterEscolha(){
        System.out.println("Olá, a calculadora está iniciando...");
        System.out.println("Veja os itens abaixo:");
        System.out.println("[1] Cateto");
        System.out.println("[2] Hipotenusa");
        System.out.print("Qual deles você quer descobrir? (digite 1 ou 2): ");
        numeroEscolhido = leitor.nextInt();

        verificarEscolha();
    }

    public void verificarEscolha(){
        if (numeroEscolhido == 1){
            descobrirCateto();
        } else if (numeroEscolhido == 2){
            descobrirHipotenusa();
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void descobrirCateto(){

    }

    public void descobrirHipotenusa(){

    }
}
