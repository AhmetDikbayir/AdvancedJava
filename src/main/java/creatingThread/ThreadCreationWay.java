package creatingThread;

import org.w3c.dom.ls.LSOutput;

public class ThreadCreationWay {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread thread1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Add thread starts");
            add(2,7);

        });
        thread1.setName("Add Thread");
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                multiply(5,8);
                multipliesOfTwo(84);
            }
        });
        thread2.setName("Multiplication thread");
        thread2.start();


    }
    public static void add(int x, int y){
        System.out.println("Sayıların toplamı : " + (x+y));
    }

    public static void multiply(int x, int y){
        System.out.println("The numbers multiplication is : " + x*y);
    }

    public static void multipliesOfTwo(int x){
        for(int i = x; i>0; i--){
            System.out.print((i%2 == 0) ? i +" " : "");

        }
        System.out.println();
    }
}
