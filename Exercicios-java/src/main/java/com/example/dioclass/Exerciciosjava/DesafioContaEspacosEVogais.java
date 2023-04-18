// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.




package com.example.dioclass.Exerciciosjava;
import java.util.Scanner;

public class DesafioContaEspacosEVogais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String palavra : strSplit) {
            for (char letra : palavra.toCharArray()) {
                if (isVogal(letra)) {
                    quantVogais++;
                }
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

        sc.close();
    }

    static boolean isVogal(char letra) {
        char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
        for (char vogal : vogais) {
            if (Character.toLowerCase(letra) == vogal) {
                return true;
            }
        }
        return false;
    }
}