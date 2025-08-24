

public class Threads {
    public static void main(String[] args) {
        //by default thread-main
        System.out.println(Thread.currentThread().getName());
        //checking active threads
        System.out.println(Thread.activeCount());

        //creating of thread
        Thread t1 = new Thread();
        // start woking thread
        t1.start();
        System.out.println(Thread.activeCount());

    }
}

// start will start the excution but when we need to run specific Thread will use run() method is used like
// thread is a class crate a class override run method and create thread with extend class then start.
// even the run () wreite the logic start only exuctes the code internally run will goes to start method to excute the code
// the execution works at anyorder-> mnages by cpu and jvm  to excute which one first
// we can work with extends, implements and userways-> anyonumus class, lambda expressions

class student extends Thread{
    // pass the thread names
    public student(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
class Animal  extends Thread{
    public Animal(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() );
    }
}
public class Threads{
    public static void main(String[] args) {
        // multiple threads
        student s1 = new student("thread1");
        s1.start();
        Animal a = new Animal("thread2");
        a.start();


        System.out.println(Thread.activeCount());
    }
}


