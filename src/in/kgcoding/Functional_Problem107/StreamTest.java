package in.kgcoding.Functional_Problem107;

import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        List<String> names = List.of("Priyam", "Shivam", "Ayush", "Nitish");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
