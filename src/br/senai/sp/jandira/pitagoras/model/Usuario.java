package br.senai.sp.jandira.pitagoras.model;

import java.util.Scanner;

public class Usuario {

    int numeroEscolhido;
    double cateto1;
    double cateto2;
    double hipotenusa;

    double cateto1AoQuadrado = cateto1 * cateto1;
    double cateto2AoQuadrado = cateto2 * cateto2;
    double hipotenusaAoQuadrado = hipotenusa * hipotenusa;

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
        cateto1 = Math.sqrt(hipotenusaAoQuadrado - cateto2AoQuadrado);
    }

    public void descobrirHipotenusa(){
        hipotenusa = Math.sqrt(cateto1AoQuadrado + cateto2AoQuadrado);
    }
}
