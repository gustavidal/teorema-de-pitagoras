package br.senai.sp.jandira.pitagoras.model;

import java.util.Scanner;

public class Usuario {

    int numeroEscolhido;
    double cateto1;
    double cateto2;
    double hipotenusa;

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
        System.out.print("");
        System.out.print("Informe o valor do cateto: ");
        cateto1 = leitor.nextDouble();
        System.out.print("Informe o valor da hipotenusa: ");
        hipotenusa = leitor.nextDouble();

        if (hipotenusa <= cateto1){
            System.out.println("");
            System.out.println("ERRO!**");
            System.out.println("A hipotenusa deve ser maior que o cateto!");
            return;
        }

        cateto2 = Math.sqrt((hipotenusa * hipotenusa) - (cateto1 * cateto1));
        exibirResultados();
    }

    public void descobrirHipotenusa(){
        System.out.print("");
        System.out.print("Informe o valor do primeiro cateto: ");
        cateto1 = leitor.nextDouble();
        System.out.print("Informe o valor do segundo cateto: ");
        cateto2 = leitor.nextDouble();

        hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        exibirResultados();
    }

    public void exibirResultados(){
        String cateto1Dec = String.format("%.2f", cateto1);
        String cateto2Dec = String.format("%.2f", cateto2);
        String hipotenusaDec = String.format("%.2f", hipotenusa);

        System.out.println("");
        System.out.println("*******************************");
        System.out.println("Aqui estão os valores:");
        System.out.println("Hipotenusa (a): " + hipotenusaDec);
        System.out.println("Cateto (b): " + cateto1Dec);
        System.out.println("Cateto (c): " + cateto2Dec);
        System.out.println("*******************************");
    }
}
