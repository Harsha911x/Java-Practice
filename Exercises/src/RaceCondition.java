//✅ How to implement multithreading using the Runnable interface.
//
//        ✅ Creating and starting threads with custom names (Worker-1, Worker-2).
//
//        ✅ Using Thread.join() to ensure the main thread waits for others to complete.
//
//✅ Understanding concurrent execution, where thread output may appear in varying order.
//
//        ✅ Avoiding race conditions by not sharing mutable data between threads and using synchronized Keyword.
//
//        ✅ Improving readability with thread names in output logs.

// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable {

    public synchronized void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+": Running task "+i);
        }
    }
}

public class RaceCondition {
    public static void main(String[] args){
        // TODO: Create a single PrinterTask object
        PrinterTask task = new PrinterTask();

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread t1 = new Thread(task,"Worker-1");
        Thread t2 = new Thread(task,"Worker-2");

        // TODO: Start both threads
        t1.start();
        t2.start();


        // TODO: Use join() to wait for both threads to finish
        try{
            t1.join();
        }
        catch(InterruptedException ignored){

        }
        try{
            t2.join();
        }
        catch(InterruptedException ignored){

        }
    }
}
