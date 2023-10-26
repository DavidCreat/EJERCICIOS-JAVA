import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("NUMERO DE DNI : ");
        int numeroDNI = scanner.nextInt();
        scanner.close();

        int indiceLetra = numeroDNI % 23;
        char letraNIF = letrasNIF[indiceLetra];

        String nifCompleto = numeroDNI + String.valueOf(letraNIF);
        System.out.println("El NIF completo (Número de Identificación Fiscal) es: " + nifCompleto);
    }
}
