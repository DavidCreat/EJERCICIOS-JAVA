public class Main {
    public static void main(String[] args) {
        String nombrePersona = "Persona1";
        double x = 12.34;
        final double VALOR_DOLAR = 3.75;
        float pi = 3.1415926f;
        double euler = 2.718281828459045;
        
        System.out.println("Nombre de la persona: " + nombrePersona);
        System.out.printf("Número x con 2 decimales: %.2f%n", x);
        System.out.printf("Valor del dólar: %.2f%n", VALOR_DOLAR);
        System.out.println("Los primeros 7 decimales de pi: " + pi);
        System.out.println("Los primeros 15 decimales de Euler: " + euler);
    }
}
