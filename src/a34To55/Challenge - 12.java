package a34To55;

class sumPositive {
     public static void main(String[] args) {
         System.out.println("Welcome to adding positive number.");
         int[] numArr = ArrayUtility.inputArray();

         int sum = 0;
         for(int num : numArr) {
             if(num < 0) {
                 continue;
             }
             sum += num;
         }
         System.out.println("The sum of positive number is: " + sum);

     }
}
