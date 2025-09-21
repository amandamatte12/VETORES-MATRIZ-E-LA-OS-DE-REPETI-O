import java.util.Scanner;
public class PreenchimentoDeMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite o número para a posição [" + linha + "][" + coluna + "]: ");
                        matriz[linha][coluna] = sc.nextInt();
                    }
                }

        System.out.println("Resultado da matriz: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
                System.out.println();
        }
    }
}

