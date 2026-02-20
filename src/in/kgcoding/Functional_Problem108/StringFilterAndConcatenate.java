package in.kgcoding.Functional_Problem108;

import java.util.List;

public class StringFilterAndConcatenate {

    public static void main(String[] args) {
        List<String> strs = List.of("Priyam Jaiswal",
                "good", "excellent", "bad", "ghatiya",
                "is teaching java", "on kg Coding", "Best Youtube Channel.");
        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(result);

    }
}
