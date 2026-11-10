import Geometria.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado (){

    }

    public Cuadrado (String color, double lado){
        super(color);
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0 ) System.out.println("[ERROR]");
        else this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Lado: " + lado);
    }
}
