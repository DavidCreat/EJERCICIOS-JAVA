public class InvertirPalabra {
    public static void main(String[] args) {
        String palabra = "Comprender";
        String palabraInvertida = invertirPalabra(palabra);

        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + palabraInvertida);
    }

    public static String invertirPalabra(String palabra) {
        StringBuilder palabraInvertida = new StringBuilder();

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida.append(palabra.charAt(i));
        }

        return palabraInvertida.toString();
    }
}
