

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

package com.example.dioclass.Exerciciosjava;
import java.util.Scanner;

public class DesafioTriangulo {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.

        if((A < B+C) && (B < A + C) && (C < A + B)) {
            triangulo = true;
            soma = A + B + C;
            System.out.println("Perimetro = " + String.format("%.1f", soma));

        } else {
            triangulo = false;
            maior = ((A + B) * C) / 2;
            System.out.println("Area = " + String.format("%.1f", maior));
        }

    }
}
