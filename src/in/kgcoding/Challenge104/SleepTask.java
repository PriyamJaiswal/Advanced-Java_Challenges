package in.kgcoding.Challenge104;

public class SleepTask implements Runnable{

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread: %s\n", current.getName());
        try {
            Thread.sleep(getRandum() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended Thread: %s\n", current.getName());
    }

    private int getRandum() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}
