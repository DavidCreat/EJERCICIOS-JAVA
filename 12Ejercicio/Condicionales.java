public class Condicionales {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("Número generado: " + numeroAleatorio);
        System.out.println(numeroAleatorio < 50 ? "Es menor que 50." : "Es mayor o igual a 50.");

        int numero1 = 7, numero2 = 4;
        int mayor = Math.max(numero1, numero2);
        double potencia = Math.pow(Math.min(numero1, numero2), mayor);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Potencia del número menor elevado al mayor: " + potencia);

        int numeroEntero = -3;
        System.out.println(numeroEntero < 0 ? "Es negativo." : "No es negativo.");

        int num1 = 12, num2 = 4;
        System.out.println(num1 % num2 == 0 || num2 % num1 == 0 ? "Uno de los números es múltiplo del otro." : "Ninguno es múltiplo del otro.");

        double nota = 7.5;
        System.out.println(nota >= 7.0 ? "El estudiante aprobó la clase." : "El estudiante no aprobó la clase.");
    }
}
