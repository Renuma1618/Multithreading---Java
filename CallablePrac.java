import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//  Callable
class SumTask implements Callable<Integer> {
    private int a, b;

    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}

public class CallabalPrac {
    public static void main(String[] args) {

      // Callable object
        SumTask task = new SumTask(10, 20);

        //  Wrap it in a FutureTask  (implements Runnable)
        FutureTask<Integer> futureTask = new FutureTask<>(task);

        // ceate a Thread with FutureTask
        Thread t = new Thread(futureTask);
        t.start();  // starts the thread

        try {

            int result = futureTask.get();
            System.out.println("Sum is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
