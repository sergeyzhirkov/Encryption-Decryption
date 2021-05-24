import java.util.Arrays;

class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        Thread fas = Arrays.stream(threads)
                .filter(t -> t.getState() == Thread.State.NEW)
                .limit(1)
                .findFirst()
                .get();
        fas.start();
        fas.join();
    }
}