import java.util.Scanner;

public class Motor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tipo de motor (0, 1, 2 o 3): ");
        int tipoMotor = entrada.nextInt();
        entrada.close();

        String resultado = obtenerTipoMotor(tipoMotor);

        System.out.println(resultado);
    }

    public static String obtenerTipoMotor(int tipoMotor) {
        String tipo = "";
        switch (tipoMotor) {
            case 0:
                tipo = "No hay valor definido";
                break;
            case 1:
                tipo = "Agua";
                break;
            case 2:
                tipo = "Gasolina";
                break;
            case 3:
                tipo = "Hormigón";
                break;
            default:
                tipo = "Valor no válido";
                break;
        }
        return tipo;
    }
}
