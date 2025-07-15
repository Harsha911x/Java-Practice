class A extends Thread{
    public void run() {
        for (int i = 0; i <= 90; i++) {
            System.out.println("A : " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//class that extends Thread class must have a run method
class B extends Thread{
    public void run() {
        for (int i = 90; i >= 0; i--) {
            System.out.println("B : -------->" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}




public class ThreadExercise {
    public static void main(String[] args) {
        A a =new A();
        B b =new B();

        //you can set priority to the threads 1-lowest and 10 - highest
        System.out.println(a.getPriority());
        a.setPriority(10);
        b.setPriority(1);
        //a.setPriority(Thread.MAX_PRIORITY);
        //b.setPriority(Thread.MIN_PRIORITY);
        //a.setPriority(Thread.NORM_PRIORITY);

        a.start();
        b.start();
    }
}
