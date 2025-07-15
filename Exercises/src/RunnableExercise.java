
//Runnable interface implementation
//class A1 implements Runnable{
//    public void run() {
//        for (int i = 0; i <= 9; i++) {
//            System.out.println("A : " + i);
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class that extends Thread class must have a run method
//class B1 implements Runnable{
//    public void run() {
//        for (int i = 9; i >= 0; i--) {
//            System.out.println("B : -------->" + i);
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}




public class RunnableExercise {
    public static void main(String[] args) {
//        Runnable a =new A1();
//        Runnable b =new B1();
//


        //using Anonymous object without lambda expression
        Runnable a =new Runnable() {
            public void run() {
                for (int i = 0; i <= 9; i++) {
                    System.out.println("A : " + i);
                    try {
                    Thread.sleep(1);
                    } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                    }
                }
            }
        };

        //Anonymous object with Lambda Expression!
        Runnable b =() -> {
                for (int i = 9; i >= 0; i--) {
                    System.out.println("B : -------->" + i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };


        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

    }
}
