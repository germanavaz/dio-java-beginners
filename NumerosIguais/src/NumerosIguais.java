/*
 * Dados dois números, verifique se eles são iguais. Caso sejam, retorne "São iguais!". 
 * Caso contrário, retorne "Não são iguais!". 
 * Entrada - as entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 
 * 
 * */

import java.util.Scanner;

public class NumerosIguais {
	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int A, B;
      
        A = leitor.nextInt();
        B = leitor.nextInt();
        
        if (A == B) {
          System.out.print("Sao iguais!");
        } else {
          System.out.print("Nao sao iguais!");
        }

    }
}
