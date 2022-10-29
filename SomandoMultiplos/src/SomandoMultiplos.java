/*
 * Dado um número A e o seu limite N, enontre a soma de todos os múltiplos A até o seu limite N. 
 * Entrada - a entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.
 * A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N. 
 * */

import java.util.Scanner;

public class SomandoMultiplos {
	
	public static void main(String[] args) {
        int A, N, i;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int soma = 0;
        
        for (i = A; i <= N; i++){
          if ((i%A)==0){
            soma = soma+i;
          }
        }
        
        System.out.print(soma);
    }

}
