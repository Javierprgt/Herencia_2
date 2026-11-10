import Geometria.FiguraGeometrica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        FiguraGeometrica figuraGeometrica = new FiguraGeometrica("Rojo");
        Cuadrado cuadrado = new Cuadrado(figuraGeometrica.getColor(), 5);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        cuadrado.imprimirDatos();
        */
        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        Scanner sc = new Scanner(System.in);
        int opc;

        System.out.println("====================\nFigura geometrica- Area y perimetro\n====================");
        System.out.print("Ingrese un color para la figura: ");
        String color = sc.next();
        figuraGeometrica.setColor(color);
        do{
            System.out.println("--------------------\nSeleccione la figura\n-------------------------");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Triangulo");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:{
                    System.out.println("-----\nCuadrado\n-----");
                    System.out.print("Ingrese el valor de un lado: ");
                    double lado = sc.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(figuraGeometrica.getColor(), lado);
                    cuadrado.calcularArea();
                    cuadrado.calcularPerimetro();
                    cuadrado.imprimirDatos();
                    break;
                }
                case 2:{
                    System.out.println("-----\nRectangulo\n-----");
                    System.out.print("Ingrese el valor de la base: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese el valor de la altura: ");
                    double altura = sc.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(figuraGeometrica.getColor(), base, altura);
                    rectangulo.calcularArea();
                    rectangulo.calcularPerimetro();
                    rectangulo.imprimirDatos();
                    break;
                }
                case 3:{
                    System.out.println("-----\nCirculo\n-----");
                    System.out.print("Ingrese el valor del radio: ");
                    double radio = sc.nextDouble();
                    Circulo circulo = new Circulo(figuraGeometrica.getColor(), radio);
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    circulo.imprimirDatos();
                    break;
                }
                case 4:{
                    System.out.println("-----\nTriangulo\n-----");
                    System.out.print("Ingrese el valor del lado 1: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Ingrese el valor del lado 2: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("Ingrese el valor del lado 3: ");
                    double lado3 = sc.nextDouble();
                    System.out.print("Ingrese el valor de la base: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese el valor de la altura: ");
                    double altura = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(figuraGeometrica.getColor(), base, altura, lado1, lado2, lado3);
                    triangulo.calcularArea();
                    triangulo.calcularPerimetro();
                    triangulo.imprimirDatos();
                    break;
                }
                case 5:{
                    System.out.println("Adios!");
                    break;
                }
                default:{
                    System.out.println("[ERROR]");
                    break;
                }
            }
        } while (opc != 5);


    }
}