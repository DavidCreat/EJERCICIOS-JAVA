public class IntercambioDeNumeros {
    public static void main(String[] args) {
        int numeroUno = 8, numeroDos = 2;

        numeroUno = numeroUno + numeroDos;
        numeroDos = numeroUno - numeroDos;
        numeroUno = numeroUno - numeroDos;

        System.out.println("Número Uno: " + numeroUno);
        System.out.println("Número Dos: " + numeroDos);
    }
}
