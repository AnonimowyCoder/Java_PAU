public class Prism extends Figure{
    private double height;
    private Figure base;
    @Override
    public void print() {
        System.out.println("Wysokosc = " + height);
        System.out.println("Pole wynosi: " + calculateArea());
        System.out.println("Objetosc wynosi: " + calculateVolume());
    }
    @Override
    double calculateArea(){
        double bases = base.calculateArea()*2;
        double sides = base.calculatePerimeter()*height;
        return bases+sides;
    }
    @Override
    double calculatePerimeter(){
        throw new UnsupportedOperationException("Method not supported");
    }
    double calculateVolume(){
        double baseArea = base.calculateArea();
        return baseArea*height;
    }

    public Prism(double height,Figure base){
        if(height<0)
            throw new IllegalArgumentException("Invalid parameter");
        this.height = height;
        this.base = base;
    }
}
