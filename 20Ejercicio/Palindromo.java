public class Palindromo {
    public static void main(String[] args) {
        String palabra = "somos";

        boolean esPalindromo = verificarPalindromo(palabra);

        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }

    public static boolean verificarPalindromo(String palabra) {
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
