package com.example.dioclass.Exerciciosjava;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.*;

public class DesafioQuitanda {


    public static double calculaPreco(double x, String y) {
        double resultado = 0;
        if (x <= 5) {
            switch (y) {
                case "macas" -> resultado = x * 1.80d;
                case "morangos" -> resultado = x * 2.50d;
            }
        } else {
            resultado = switch (y) {
                case "macas" -> x * 1.50d;
                case "morangos" -> x * 2.20d;
                default -> resultado;
            };
        }
        return resultado;
    }

    public static double calculaPrecoTotal(int macas,int morangos){
        return calculaPreco(macas,"macas") + calculaPreco(morangos,"morangos");
    }

    public static double aplicaPorcentagem(int x, int y){
        return (double) 10.00d / 100.00d * calculaPrecoTotal(x,y);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        if((morangos + macas) > 8 || calculaPrecoTotal(macas,morangos) > 25.00){
            System.out.println(calculaPrecoTotal(macas,morangos) - aplicaPorcentagem(macas,morangos));
        }else {
            System.out.println(calculaPreco(macas, "macas") + calculaPreco(morangos, "morangos"));
        }
    }
}