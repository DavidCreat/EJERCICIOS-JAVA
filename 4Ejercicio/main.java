import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = random.nextInt(20) + 1;
        System.out.println("Número de repeticiones: " + contador);

        int i = 0;
        while (i < contador) {
            int numeroAleatorio = random.nextInt(65 - 18 + 1) + 18;
            System.out.println("Número aleatorio: " + numeroAleatorio);
            i++;
        }
    }
}

