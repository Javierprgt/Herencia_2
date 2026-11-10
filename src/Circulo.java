import Geometria.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo (String color,double radio) {
        super(color);
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio<0) System.out.println("[ERROR]: Radio incorecto");
        else this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Radio: " + radio);
    }
}
