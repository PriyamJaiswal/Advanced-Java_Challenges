package in.kgcoding.Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static void main(String[] args) {
        // ExecutorService ko try me lekhne per hme shutdown karne jarort nhi padti
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
        }

    }
}
