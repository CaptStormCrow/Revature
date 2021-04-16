package usingThreadclass;

public class MyThread extends  Thread{

    @Override
    public void run(){
       // System.out.println("Hello from : "+Thread.currentThread()+" id : "+Thread.currentThread().getId());
        for (int i=0;i<5;i++){
            System.out.println("Printing from thread : "+Thread.currentThread().getName()+" value of i = "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
