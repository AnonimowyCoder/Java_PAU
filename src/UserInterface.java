import java.util.Scanner;
public class UserInterface {
    public static Square CreateSquare(){
        System.out.println("Podaj dlugosc boku:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        double val;
        try {
            val = Integer.parseInt(userInput);
        }   catch (NumberFormatException e) {
            System.out.println("Zly format liczby");
            return null;
        }
        return new Square(val);
    }
    public static Triangle CreateTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc bokow:");
        String userInput1 = scanner.nextLine();
        String userInput2 = scanner.nextLine();
        String userInput3 = scanner.nextLine();
        double val1,val2,val3;
        try {
            val1 = Double.parseDouble(userInput1);
            val2 = Double.parseDouble(userInput2);
            val3 = Double.parseDouble(userInput3);
        }   catch (NumberFormatException e) {
            System.out.println("Zly format liczby");
            return null;
        }
        return new Triangle(val1,val2,val3);
    }
    public static Circle CreateCircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj srednice:");
        String userInput = scanner.nextLine();
        double val;
        try {
            val = Integer.parseInt(userInput);
        }   catch (NumberFormatException e) {
            System.out.println("Zly format liczby");
            return null;
        }
        return new Circle(val);
    }

    public static Prism CreatePrism(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Figure w podstawie:");
        System.out.println("1.Kwadrat");
        System.out.println("2.Trojkat");
        System.out.println("3.Kolo");
        String userInput = scanner.nextLine();
        int val;
        try {
            val = Integer.parseInt(userInput);
        }   catch (NumberFormatException e) {
            System.out.println("Zly format liczby");
            return null;
        }
        System.out.println("Podaj wysokosc graniastoslupa");
        userInput = scanner.nextLine();
        int height;
        try {
            height = Integer.parseInt(userInput);
        }   catch (NumberFormatException e) {
            System.out.println("Zly format liczby");
            return null;
        }
        return switch (val) {
            case 1 -> {
                Square square = CreateSquare();
                yield new Prism(height, square);
            }
            case 2 -> {
                Triangle triangle = CreateTriangle();
                yield new Prism(height, triangle);
            }
            case 3 -> {
                Circle circle = CreateCircle();
                yield new Prism(height, circle);
            }
            default -> {
                System.out.println("Zly format liczby");
                yield null;
            }
        };
    }

    public static void UInterface(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice!=9) {
            System.out.println("Wybierz figure do wprowadzenia: ");
            System.out.println("1.Kwadrat");
            System.out.println("2.Trojkat");
            System.out.println("3.Kolo");
            System.out.println("4.Graniastoslow prawidlowy");
            System.out.println("9.Wyjdz z programu");
            String userInput = scanner.nextLine();
            try {
                choice = Integer.parseInt(userInput);
            }   catch (NumberFormatException e) {
                System.out.println("Zly format liczby");
                break;
            }
            switch (choice){
                case 1:
                    Square square = CreateSquare();
                    square.print();
                    break;
                case 2:
                    Triangle triangle = CreateTriangle();
                    triangle.print();
                    break;
                case 3:
                    Circle circle = CreateCircle();
                    circle.print();
                    break;
                case 4:
                    Prism prism = CreatePrism();
                    prism.print();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
