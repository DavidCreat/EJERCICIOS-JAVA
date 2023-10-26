public class OperacionesMatematicas {
    public static void main(String[] args) {
        int numeroUno = 9, numeroDos = 7;
        int suma = numeroUno + numeroDos, resta = numeroUno - numeroDos;
        int multiplicacion = numeroUno * numeroDos, division = 0;

        if (numeroDos != 0) division = numeroUno / numeroDos;

        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + multiplicacion);

        if (numeroDos != 0) System.out.println("División: " + division);
        else System.out.println("No se puede dividir por cero.");
    }
}
