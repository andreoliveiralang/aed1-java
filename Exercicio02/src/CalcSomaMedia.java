import java.util.Scanner;

import java.util.Scanner;
public class CalcSomaMedia {
    // Função: Calcula a média de 3 numeros inteiros
    // Autor: Seu nome completo
    public static void main (String[] args) {
        long n1, n2, n3, soma;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número:");
        n1 = teclado.nextLong();
        System.out.print("informe outro número:");
        n2 = teclado.nextLong();
        System.out.print("Informe mais um número:");
        n3 = teclado.nextLong();
        soma = n1 + n2 + n3;
        media = soma / 3.0;
        System.out.println("Média = " + media);
        teclado.close();

    }
}

