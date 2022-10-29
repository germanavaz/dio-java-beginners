/* Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0. 
 * Entrada: A Entrada será composta por um número inteiro, N
 * Saída: Será  impresso o somatório de N até 0, como no exemplo a baixo: 
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
       
        int somatorio = 0;

        int N = scan.nextInt();
        
        for (int i=N; i>=0; i--){
          somatorio = somatorio + i;
        
        }

        System.out.print(somatorio);
    }

   
    }