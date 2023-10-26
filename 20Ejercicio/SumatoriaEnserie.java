public class SumatoriaEnserie {
    public static void main(String[] args) {
        int primerTermino = 11;
        int limite = 25;
        int diferencia = 11;

        imprimirSerieSumatoria(primerTermino, limite, diferencia);
    }

    public static void imprimirSerieSumatoria(int primerTermino, int limite, int diferencia) {
        for (int i = 0; i < limite; i++) {
            System.out.print(primerTermino + " ");
            primerTermino += diferencia;
        }
    }
}
