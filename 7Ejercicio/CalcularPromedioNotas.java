public class CalcularPromedioNotas {
    public static void main(String[] args) {
        int numNotas = 5;
        double sumaNotas = 0;

        for (int i = 0; i < numNotas; i++) {
            double nota = Math.random() * 10;
            sumaNotas += nota;
            System.out.println("Nota " + (i + 1) + ": " + nota);
        }

        double promedio = sumaNotas / numNotas;
        System.out.println("Promedio de las notas: " + promedio);
    }
}
