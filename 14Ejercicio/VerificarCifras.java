import java.util.Scanner;

public class VerificarCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número (máximo 4 cifras): ");
        int numero = scanner.nextInt();

        int cantidadCifras = contarCifras(numero);

        if (cantidadCifras == -1) {
            System.out.println("El número supera las 4 cifras.");
        } else {
            System.out.println("El número tiene " + cantidadCifras + " cifras.");
        }

        scanner.close();
    }

    public static int contarCifras(int numero) {
        if (numero < 10000 && numero > -1000) {
            return String.valueOf(numero).length();
        }
        return -1;
    }
}
