import java.util.Scanner;
public class SomaDeKinhasEColunas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

       for (int linha = 0; linha < 3; linha++) {
           for (int coluna = 0; coluna < 3; coluna++) {
               System.out.print("Digite o valor da posição [" + linha + "][" + coluna + "]: ");
               matriz[linha][coluna] = sc.nextInt();
                    }
                }


       System.out.println("\nSoma de cada linha:");
       for (int linha = 0; linha < 3; linha++) {

           int somaLinha = 0;
           for (int coluna = 0; coluna < 3; coluna++) {
               somaLinha += matriz[linha][coluna];
           }

           System.out.println("Linha " + linha + ": " + somaLinha);

       }

       System.out.println("\nSoma de cada coluna:");
       for (int coluna = 0; coluna < 3; coluna++) {

           int somaColuna = 0;
           for (int linha = 0; linha < 3; linha++) {
               somaColuna += matriz[linha][coluna];
           }

           System.out.println("Coluna " + coluna + ": " + somaColuna);

       }
    }
}
