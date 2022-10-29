/* 
 * Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 
 * Entrada - Uma string é considerada válida se: 
 * Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 
 * Saída - a saída corresponde a um valor booleano.
 * 
 * */


import java.util.*;

public class ValidParentheses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String caracter = scanner.nextLine();

		if (caracter.contains("[]")) {
			System.out.println("true");
		} else {
			if (caracter.contains("{}")) {
				System.out.println("true");
			} else {
				if (caracter.contains("()")) {
					System.out.println("true");
				} else {
					if (caracter.contains(" ")) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}

				}
			}
		}
	}
}