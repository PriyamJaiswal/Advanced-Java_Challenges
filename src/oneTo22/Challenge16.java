package oneTo22;

import java.util.Scanner;
public class Challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Least Common Multiple(LCM)");
        System.out.print("please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your number: ");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("LCM of the two numbers is: " + lcm);
    }

    public static int lcm(int first, int second) {
   //    int i = 1;
//       while (i <= second){
//           int factor = first * i;
//           if (factor % second == 0){
//               return factor;
//           }
//           i++;
//       }
//       return 0;

    //  In this condition compiler will not show missing return outside bracket.
     int i = 1;
        while (true){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }

// for statement
// In this condition the compiler will have to return 0 at the end.
//        for(int i=1; i<=second; i++){
//            int factor = first * i;
//            if (factor % second == 0){
//                return factor;
//            }
//        }
//        return 0;
    }
}
