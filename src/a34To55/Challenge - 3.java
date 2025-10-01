package a34To55;

import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute value\n");
        // x or -x = x(mode)(value always positive)
        System.out.print("Please enter your number ");
        int num = input.nextInt();

        int result =  num >= 0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}
