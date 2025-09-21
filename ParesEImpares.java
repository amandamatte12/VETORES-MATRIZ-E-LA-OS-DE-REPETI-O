import java.util.Random;
public class ParesEImpares {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[] numeros = new int[15];


        for (int i = 0; i < 15; i++) {
            numeros[i] = aleatorio.nextInt(100) + 1;
        }

        System.out.print("Números pares: ");
        for (int i = 0; i < 15; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.print("Números ímpares: ");
        for (int i = 0; i < 15; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}

