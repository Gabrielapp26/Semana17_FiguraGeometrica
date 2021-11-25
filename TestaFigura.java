public class TestaFigura {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        triangulo.setLadoA(5);
        triangulo.setLadoB(6);
        triangulo.setLadoC(7);
        triangulo.setBase(5);
        triangulo.setAltura(8);

        System.out.println(triangulo.getNomeFigura());
        System.out.println("Perímetro do triangulo: "+triangulo.getPerimetro());
        System.out.println("Area do triangulo: "+triangulo.getArea());


        quadrado.setLado(5);

        System.out.println(quadrado.getNomeFigura());
        System.out.println("Area do quadrado: "+quadrado.getArea());
        System.out.println("Perímetro do quadrado: "+quadrado.getPerimetro());
    }  
}
