import java.util.Random;

public class Sumatoria {
    public static void main(String[] args) {
        int numero = 5;
        int sumatoria = calcularSumatoria(numero);

        double raizCuadrada = calcularRaizCuadrada(sumatoria);
        int numeroAleatorio = generarNumeroAleatorio(sumatoria);
        int[] divisores = encontrarDivisores(sumatoria);
        long factorial = calcularFactorial(sumatoria);
        boolean esNumeroPerfecto = esNumeroPerfecto(sumatoria);

        System.out.println("Resultados:");
        System.out.println("Raíz cuadrada de la sumatoria: " + raizCuadrada);
        System.out.println("Número aleatorio entre 1 y la sumatoria: " + numeroAleatorio);
        System.out.print("Los divisores de la sumatoria son: ");
        for (int divisor : divisores) {
            System.out.print(divisor + " ");
        }
        System.out.println("\nFactorial de la sumatoria: " + factorial);
        if (esNumeroPerfecto) {
            System.out.println("La sumatoria es un número perfecto.");
        } else {
            System.out.println("La sumatoria no es un número perfecto.");
        }
    }

    public static int calcularSumatoria(int numero) {
        int sumatoria = 0;
        for (int i = 0; i <= numero; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }

    public static double calcularRaizCuadrada(int sumatoria) {
        return Math.sqrt(sumatoria);
    }

    public static int generarNumeroAleatorio(int maximo) {
        return new Random().nextInt(maximo) + 1;
    }

    public static int[] encontrarDivisores(int numero) {
        int[] divisores = new int[numero];
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores[contador] = i;
                contador++;
            }
        }
        int[] resultado = new int[contador];
        System.arraycopy(divisores, 0, resultado, 0, contador);
        return resultado;
    }

    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
