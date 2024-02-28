interface Printable{
    void print();
}
abstract class Figure implements Printable{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Triangle extends Figure{
    private double side_a;
    private double side_b;
    private double side_c;

    public Triangle(double side_a,double side_b,double side_c) {
        if(!isValidTriangle(side_a,side_b,side_c))
            throw new IllegalArgumentException("Invalid parameters");
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }
    //metoda sprawdza czy trójkąt może powstać
    private boolean isValidTriangle(double a, double b, double c){
        return a + b > c && b + c > a && a + c > b;
    }
    @Override
    double calculateArea() {
        double p = (side_a + side_b+side_c)/2;
        return Math.sqrt(p*(p-side_a)*(p-side_b)*(p-side_c));
    }

    @Override
    double calculatePerimeter() {
        return side_a + side_b + side_c;
    }

    @Override
    public void print() {

    }
}