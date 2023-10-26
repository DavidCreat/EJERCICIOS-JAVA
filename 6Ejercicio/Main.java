import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un número:");
        int base = scanner.nextInt();

        System.out.println("Ahora ingrese otro número:");
        int base2 = scanner.nextInt();

        double potencia = Math.pow(base, base2);

        System.out.println("Número 1: " + base);
        System.out.println("Número 2: " + base2);
        System.out.println("Resultado final: " + potencia);

        scanner.close();
    }
}

