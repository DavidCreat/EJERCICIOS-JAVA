import java.util.Scanner;

public class DeterminarNivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la cantidad total de preguntas: ");
        int totalPreguntas = entrada.nextInt();

        System.out.print("Ingresa la cantidad de preguntas correctas: ");
        int preguntasCorrectas = entrada.nextInt();
        entrada.close();

        double porcentajeCorrectas = (preguntasCorrectas * 100.0) / totalPreguntas;

        String nivel = determinarNivel(porcentajeCorrectas);

        System.out.println("Porcentaje de respuestas correctas: " + porcentajeCorrectas + "%");
        System.out.println("Nivel de capacitación: " + nivel);
    }

    public static String determinarNivel(double porcentajeCorrectas) {
        if (porcentajeCorrectas >= 90) {
            return "Nivel máximo";
        } else if (porcentajeCorrectas >= 75) {
            return "Nivel medio";
        } else if (porcentajeCorrectas >= 50) {
            return "Nivel regular";
        } else {
            return "Fuera de nivel";
        }
    }
}
