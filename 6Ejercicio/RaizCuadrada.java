public class RaizCuadrada {
    public static void main(String[] args) {
        double[] numeros = {2, 8, 9, 27, 28, 55, 121};

        for (int i = 0; i < numeros.length; i++) {
            double numero = numeros[i];
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        }
    }
}


