package CodeClauseInternship_TimerandStopwatch;
import java.io.IOException;

class Stopwatch {
    private long startTime;
    private long endTime;
    private boolean running;

    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
        }
    }

    public void stop() {
        if (running) {
            endTime = System.currentTimeMillis();
            running = false;
        }
    }

    public long getElapsedTime() {
        if (running) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public void reset() {
        startTime = 0;
        endTime = 0;
        running = false;
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("Press Enter to start the stopwatch...");
        System.in.read();
        System.in.read();
        stopwatch.start();

        System.out.println("Stopwatch is running. Press Enter to stop...");
        System.in.read();
        System.in.read();
        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

        System.out.println("Press Enter to reset the stopwatch...");
        System.in.read();
        stopwatch.reset();

        System.out.println("Stopwatch reset.");
    }
}
