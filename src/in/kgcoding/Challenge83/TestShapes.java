package in.kgcoding.Challenge83;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of circle is %5.2f\n", circle.calculateArea());
        System.out.printf("Area of square is %5.2f\n", square.calculateArea());
//%f ke bich me 5.2 ka means total 5 digit print karna hai
// aur point ke baad 2 digit honi chahiye
    }
}
