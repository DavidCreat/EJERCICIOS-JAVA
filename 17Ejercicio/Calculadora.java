import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Ingresa el operador (+, -, *, /): ");
        char operador = entrada.next().charAt(0);

        double resultado = calcularOperacion(numero1, numero2, operador);

        if (Double.isNaN(resultado)) {
            System.out.println("Operación no válida.");
        } else {
            System.out.println("Resultado: " + resultado);
        }

        entrada.close();
    }

    public static double calcularOperacion(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                }
                break;
        }
        return Double.NaN;
    }
}
