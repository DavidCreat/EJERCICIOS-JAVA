public class Divisores {
    public static void main(String[] args) {
        int numero = 12;
        System.out.print("Los divisores de " + numero + " son: ");
        encontrarDivisores(numero);
    }

    public static void encontrarDivisores(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
