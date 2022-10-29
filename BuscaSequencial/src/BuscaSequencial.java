import java.util.Scanner;

public class BuscaSequencial {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int valorDesejado = leitor.nextInt();
        
        System.out.print(buscaSequencial(vetor, valorDesejado));
    }
    
    public static String buscaSequencial(int[] vetor, int valorDesejado){
      
      String saida = "";
      boolean encontrou = false;
      int posicao = 0;
      
        for (int i = 0; i < vetor.length; i++){
          if (valorDesejado == vetor[i]){ 
              encontrou = true;
              posicao = i;
          }
        }
            
        if (encontrou == true) {
          saida = "Achei " + valorDesejado + " na posicao " + posicao;
        }else {
          saida = "Numero " + valorDesejado + " nao encontrado!";
        }
        
        return saida;
    }   
    }
