package in.kgcoding.Challenge77.utills;

import in.kgcoding.Challenge77.geometry.Circle;
import in.kgcoding.Challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {

        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double CirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breadth * rect.length;

        System.out.println(CirArea);
        System.out.println(rectArea);

        System.out.println();
    }
}
