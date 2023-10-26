import java.util.Scanner;

public class ComplexCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos pares de números y cadenas desea ingresar?");
        int numPairs = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numPairs; i++) {
            System.out.println("Par #" + i);
            System.out.println("Ingrese el primer número entero:");
            int firstInt = scanner.nextInt();
            System.out.println("Ingrese el segundo número entero:");
            int secondInt = scanner.nextInt();
            System.out.println("Ingrese un número decimal (float):");
            float decimalNumber = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Ingrese la primera cadena de texto:");
            String firstString = scanner.nextLine();
            System.out.println("Ingrese la segunda cadena de texto:");
            String secondString = scanner.nextLine();

            float sum = firstInt + secondInt + decimalNumber;
            int largestInteger = Math.max(firstInt, secondInt);
            float floatDivision = (secondInt != 0) ? (decimalNumber / (firstInt % secondInt)) : 0;
            String concatenatedStrings = firstString + " " + secondString;

            System.out.println("Resultado para el Par #" + i + ":");
            System.out.println("La suma de los números es: " + sum);
            System.out.println("El entero mayor es: " + largestInteger);
            System.out.println("La división del float con el resto de la división de los enteros es: " + floatDivision);
            System.out.println("La concatenación de las cadenas de texto es: " + concatenatedStrings);
        }
        
        scanner.close();
    }
}
