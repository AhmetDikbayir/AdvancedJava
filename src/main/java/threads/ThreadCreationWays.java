package threads;

public class ThreadCreationWays {
    public static void main(String[] args) {
        //her java programında default olarak bir tane thread başlatılır: main thread

        System.out.println("Mevcut thread : " + Thread.currentThread().getName());

        //1. YOL
        Thread thread1 = new MyThread();
        //thread1.run();
        thread1.start();//Threadi başlatır, run metodunu çağırarak
        thread1.setName("threadcik");

        //2. YOL : Runnable Interface ile thread başlatabiliriz.
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        //2. YOL: anonymous class
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Çalışan thread : " + Thread.currentThread().getName());
                System.out.println("Anonymous class ile tanımlanan thread basladi");
            }
        });
        thread3.start();
        System.out.println("------------------------");

        //2. YOL: lambda exp ile
        Thread thread4 =new Thread(()->{
            //run metodunun body
            System.out.println("Lambda exp ile oluşturuldu");
        });
        thread4.start();

        //main threadi bir süre bekletelim
        try {
            Thread.sleep(5000);//hangi thread çağırırsa bu threadi parametredeki süre kadar bekletir
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main metodu burda tamamlandı.");

    }
}
//thread oluşturmanın SADECE 2 tane yolu var
//1. YOL: Thread classını extend ederek
class MyThread extends Thread{
    @Override
    public void run() {
        //threade yaptırmak istediğimiz işlemleri (kodları)
        System.out.println("Çalışan thread : " + Thread.currentThread().getName());
        System.out.println("My thread çalışıyor. HARİKA :)");
    }
}

//2. YOL: Runnable Interfaceini implement ederek
class MyRunnable implements Runnable{

    @Override
    public void run() {
        //threade yaptırmak istediğimiz işlemleri(kodları)
        System.out.println("Çalışan thread: "+Thread.currentThread().getName());
        System.out.println("Runnable ile hazırlanan thread başladı.");
    }
}