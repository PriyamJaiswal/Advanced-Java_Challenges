package in.kgcoding.Functional_Problem106;

import java.util.function.BinaryOperator;

public class LambdaMultipllication {

    public static void main(String[] args) {
         BinaryOperator<Integer> multi = (a, b) -> a * b;
         int result = multi.apply(45,34);
        System.out.println(result);
    }
}
