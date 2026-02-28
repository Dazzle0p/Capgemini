package capgemini;

// We can implement Threading in java in Two ways
// 01. By extending Thread class

class childTread extends Thread{
    childTread(ThreadGroup group){
        super(group, "DUMMY");
    }

    @Override
    public void  run(){
        for(int i=0; i<=100; i++) {
            System.out.println("Thread");
        }
    }
}

// 02. By implementing Runnable interface

class childThreadTwo implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("Thread Two");
        }
    }
}

public class TreadingBasic {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println(thread);

        ThreadGroup group = new ThreadGroup("DB Threads");
        childTread t1 = new childTread(group);
        t1.setName("Child Thread One");
        t1.setPriority(1);
        t1.start();

        for(int i=0; i<=100; i++){
            System.out.println("Main");
        }

        childThreadTwo t2 = new childThreadTwo();
        Thread T = new Thread(t2);
        T.start();

        Object ob = "HEllO";
        System.out.println(ob);
    }
}
