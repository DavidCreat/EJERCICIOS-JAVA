public class CalcularNumeroMayor {
    public static void main(String[] args) {
        double numero1 = 1 + (Math.random() * 49);
        double numero2 = 1 + (Math.random() * 49);

        long numeroRedondeado1 = Math.round(numero1);
        long numeroRedondeado2 = Math.round(numero2);

        long numeroMayor = Math.max(numeroRedondeado1, numeroRedondeado2);

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Número 1 redondeado: " + numeroRedondeado1);
        System.out.println("Número 2 redondeado: " + numeroRedondeado2);
        System.out.println("Número mayor: " + numeroMayor);
    }
}
