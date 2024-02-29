public class Circle extends Figure{
    private double diameter;

    public Circle(double diameter){
        if(diameter<0)
            throw new IllegalArgumentException("Invalid parameter");
        this.diameter = diameter;
    }
    @Override
    double calculateArea() {
        return Math.PI*(diameter*diameter/4);
    }
    @Override
    double calculatePerimeter() {
        return Math.PI*diameter;
    }
    @Override
    public void print() {
        System.out.println("Srednica wynosi");
        System.out.println("diameter = " + diameter);
        System.out.println("Pole wynosi: " + calculateArea());
        System.out.println("Obwod wynosi: " + calculatePerimeter());
    }
}
