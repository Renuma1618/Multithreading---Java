// Runnable method
class student implements Runnable{
    // pass the thread names

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
class Animal  implements Runnable{

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() );
    }
}
public class ThreadsRunnable{
    public static void main(String[] args) {
        // multiple threads


        Thread t1 = new Thread(new student(),"threads");
        t1.start();
        Thread t2 = new Thread(new Animal(),"runnable");
        t2.start();



        System.out.println(Thread.activeCount());
    }
}

//join method says only exeuctes onethread after the next thread
// sleep method we can say stop running teh thread for certain time
//threadlifecycle->6 steps
//getstate() gives which state is in the thread
/new thread creation
//Running ,
//blocked
//waiting(join)
//waiting(specifitime/ sleep)
//terminated