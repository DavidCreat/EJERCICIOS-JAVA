import java.util.Scanner;

public class ClasificacionPorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.close();

        String categoria;

        if (edad <= 5) {
            categoria = "Infante";
        } else if (edad <= 10) {
            categoria = "Niño";
        } else if (edad <= 15) {
            categoria = "Pre adolescente";
        } else if (edad <= 18) {
            categoria = "Adolescente";
        } else if (edad <= 25) {
            categoria = "Pre adulto";
        } else if (edad <= 40) {
            categoria = "Adulto";
        } else if (edad <= 55) {
            categoria = "Pre anciano";
        } else {
            categoria = "Anciano";
        }

        System.out.println("La categoría de la persona es: " + categoria);
    }
}
