import Geometria.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;

    public Triangulo (String colot, double base, double altura, double lado1, double lado2, double lado3) {
        super(colot);
        setAltura(altura);
        setBase(base);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0 ) System.out.println("[ERROR]: Base incorrecta");
        else this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) System.out.println("[ERROR]");
        else this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 < 0 ) System.out.println("[ERROR]");
        else this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 < 0 ) System.out.println("[ERROR]");
        else this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (lado3 < 0 ) System.out.println("[ERROR]");
        else this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
    }
}
