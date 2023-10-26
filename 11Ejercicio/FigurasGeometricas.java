public class FigurasGeometricas {
    public static void main(String[] args) {
        int ladoCuadrado = 8;
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        int baseRectangulo = 8;
        int alturaRectangulo = 6;

        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = 4 * ladoCuadrado;

        int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;

        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

        System.out.println("Cuadrado:");
        System.out.println("Área: " + areaCuadrado);
        System.out.println("Perímetro: " + perimetroCuadrado);

        System.out.println("Triángulo:");
        System.out.println("Área: " + areaTriangulo);
        System.out.println("Perímetro: " + perimetroTriangulo);

        System.out.println("Rectángulo:");
        System.out.println("Área: " + areaRectangulo);
        System.out.println("Perímetro: " + perimetroRectangulo);
    }
}
