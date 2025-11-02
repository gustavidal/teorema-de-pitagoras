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
        System.out.print("Informe o valor do cateto: ");
        cateto2 = leitor.nextDouble();
        System.out.print("Informe o valor da hipotenusa: ");
        hipotenusa = leitor.nextDouble();

        cateto1 = Math.sqrt(hipotenusaAoQuadrado - cateto2AoQuadrado);
    }

    public void descobrirHipotenusa(){
        System.out.print("Informe o valor do primeiro cateto: ");
        cateto1 = leitor.nextDouble();
        System.out.print("Informe o valor do segundo cateto: ");
        cateto2 = leitor.nextDouble();

        hipotenusa = Math.sqrt(cateto1AoQuadrado + cateto2AoQuadrado);
    }
}
