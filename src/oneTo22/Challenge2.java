package oneTo22;

import java.util.*;
public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("We are doing Float Multiplication\n");
        System.out.print("Please enter first number");
        double first = input.nextDouble();
        System.out.print("Now, Please enter second number");
        double second = input.nextDouble();

//        double mul = first * second;
//        System.out.println("\n Result is: " + mul);
        System.out.println("\n Result is: " + (first * second));
      //  System.out.println("\n Result is: " + first + second); WRONG Statement
        System.out.println("\n Result is: " + (first + second));
    }

}
