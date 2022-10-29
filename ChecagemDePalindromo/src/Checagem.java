/* 
 * Nesse desafio você deverá construir uma função que recebe uma string e identifique se a mesma é um palíndromo, ou seja, se a string é igual a ela mesma invertida. 
 * Dado que temos a string "digital" uma vez invertida temos "latigid" que são diferentes. 
 * Logo, não é um palíndromo.
 * Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais. 
 * Entrada - A entrada consiste em uma palavra. 
 * Saída - Para cada string informada, terá uma saída de valor booleano: TRUE, caso a palavra seja um palíndromo, ou FALSE caso a palavra não seja um palíndromo.
 *  
 * */

/** 
 * @author Germana Maria Vaz 
 * 
 */
 
import java.util.Scanner;

public class Checagem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        
        String palindromo; 

        
        palindromo = new StringBuilder(palavra).reverse().toString();
        
        if (palavra.intern() == palindromo.intern()) {
          System.out.print("TRUE");
        } else {
          System.out.print("FALSE");
        }
        
    }
    
}