import Geometria.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo (String color, double base, double altura){
        super(color);
        setAltura(altura);
        setBase(base);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base<0) System.out.println("ERROR]");
        else this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura<0) System.out.println("[ERROR]");
        else this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}
