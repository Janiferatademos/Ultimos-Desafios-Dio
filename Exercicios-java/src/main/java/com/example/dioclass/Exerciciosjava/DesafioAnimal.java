



// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
package com.example.dioclass.Exerciciosjava;
import java.io.IOException;
import java.util.Scanner;

public class DesafioAnimal {
        public static void main(String[] args)  throws IOException {
            Scanner sc = new Scanner(System.in);

            String AN1,AN2,AN3;

            AN1 = sc.nextLine();
            AN2 = sc.nextLine();
            AN3 = sc.nextLine();

            if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("carnivoro")) {
                System.out.print("aguia\n");
            }
            if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("onivoro")) {
                System.out.print("pomba\n");
            }
            if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("onivoro")) {
                System.out.print("homem\n");
            }
            if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("herbivoro")) {
                System.out.print("vaca\n");
            }

            if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("hematofago")) {
                System.out.print("pulga\n");
            }
            if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("herbivoro")) {
                System.out.print("lagarta\n");
            }
            if (AN1.equals("invertebrado") && AN2.equals("anelideo") && AN3.equals("hematofago")) {
                System.out.print("sanguessuga\n");
            }
            if (AN1.equals("invertebrado") && AN2.equals("anelideo") && AN3.equals("onivoro")) {
                System.out.print("minhoca\n");
            }

        }

    }

