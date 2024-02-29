public class Square extends Figure{
    private double side;

    public Square(double side){
        if(side<0)
            throw new IllegalArgumentException("Invalid parameter");
        this.side = side;
    }
    @Override
    double calculateArea() {
        return side*side;
    }
    @Override
    double calculatePerimeter() {
        return side*4;
    }
    @Override
    public void print() {
        System.out.println("Bok kwadratu ma dlugosc:");
        System.out.println("a = " + side);
        System.out.println("Pole wynosi: " + calculateArea());
        System.out.println("Obwod wynosi: " + calculatePerimeter());
    }
}
