import java.util.Random;
public class DiagonalPrincipal {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[linha][coluna] = aleatorio.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz:");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(matriz[linha][coluna] );
            }
            System.out.println();
        }

        System.out.println("Diagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");

        }
    }
}
