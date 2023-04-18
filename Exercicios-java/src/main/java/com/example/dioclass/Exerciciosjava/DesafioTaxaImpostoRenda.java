package com.example.dioclass.Exerciciosjava;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class DesafioTaxaImpostoRenda {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double renda = leitor.nextDouble();

        double dif=0.0;

        double imposto=0.0;

        if (renda >= 2000.01 && renda <= 3000.00) {

            imposto = (renda - 2000) * 0.08 ; }

        else if (renda >= 3000.01 && renda <= 4500.00) {

            dif = renda - 3000.00;

            imposto = 1000.00 * 0.08 + dif * 0.18; }

        else if (renda > 4500.00) {

            dif = renda - 4500.00;

            imposto = 1000.00 * 0.08 + 1500 * 0.18 + dif * 0.28; }

        if(imposto == 0 )

        { System.out.println("Isento"); }

        else

        { System.out.printf("R$ %.2f " , imposto); }

    }

}
