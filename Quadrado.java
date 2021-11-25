public class Quadrado implements FiguraGeometrica{

    private int lado;

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    public int getArea() {
        // TODO Auto-generated method stub
        int area;
        area=lado*lado;
        return area;
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Quadrado";
    }
    @Override
    public int getPerimetro() {
        // TODO Auto-generated method stub
        int perimetro;
        perimetro=lado*4;
        return perimetro;
    }
}
