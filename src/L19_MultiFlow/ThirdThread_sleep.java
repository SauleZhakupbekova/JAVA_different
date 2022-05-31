package L19_MultiFlow;

public class ThirdThread_sleep implements Runnable{
    // it call in F by another way
    @Override
    public void run() {
        for(int i = 100000; i < 100200; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000); // class Thread which describes Flow
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
