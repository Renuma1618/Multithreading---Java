//Imagine you have 100 products, and you want to process them in parallel — e.g., calculating prices, updating stock,
// or sending notifications. You don’t want to create 100 threads because that would be inefficient.
//We’ll use ExecutorService with a fixed thread pool to handle it efficiently.


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServices
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int orderid=1; orderid<=10;orderid++){
            int currentorderid = orderid;

            executor.submit(()->processProducts(currentorderid));
             executor.submit(()->sendemail(currentorderid));
             executor.submit(()->generateinvoice(currentorderid));
             executor.submit(()->updateOrderhistory(currentorderid));
        }
        executor.shutdown();
}
public static void processProducts(int orderid){
    System.out.println("processing for a order" + orderid + Thread.currentThread().getName());
    sleep(500);
}
public static void sendemail(int orderid){
        System.out.println("sending email" + orderid + Thread.currentThread().getName());
        sleep(500);
}
private static void generateinvoice(int orderId) {
    System.out.println("Generating invoice for order " + orderId + " by " + Thread.currentThread().getName());
    sleep(400);
}

private static void updateOrderhistory(int orderId) {
    System.out.println("Updating order history for order " + orderId + " by " + Thread.currentThread().getName());
    sleep(200);
}
private static void sleep(int ms) {
    try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
}
}