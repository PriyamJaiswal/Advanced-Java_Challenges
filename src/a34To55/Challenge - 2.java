package a34To55;

import java.util.Scanner;

 class oddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding odd or even\n");
        System.out.print("Please enter your number ");
        int num = input.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is: " + result);
    }
}
