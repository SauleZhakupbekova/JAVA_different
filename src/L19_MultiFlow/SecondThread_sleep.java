package L19_MultiFlow;

//Only first Flow can run Second Flow
public class SecondThread_sleep extends Thread{
    // redefine method Run

    @Override // method run - method of what we want to do
    public void run(){
        for(int i = 100; i < 110; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000); // class Thread which describes Flow
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
