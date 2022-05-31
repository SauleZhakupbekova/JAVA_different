package L19_MultiFlow;

public class Singer1_wait extends Thread{
    private boolean needStop = false;

    @Override
    //redefine method run which is in class Thread
    public void run() {
        int count = 0;
        while(!needStop){ // for proving unlimitted time of work of method run we should use method while.
            count++;
            if(count > 2){
                needStop = true;
            }
            for(int i = 0; i < 3; i++){
                System.out.println("---------la");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            //transfer to Singer2
            synchronized (Monitors.MICROPHONE){
                Monitors.MICROPHONE.notify();//infom all flows which sleep
            }
            synchronized (Monitors.MICROPHONE){
                try {
                    Monitors.MICROPHONE.wait(); // we informed and now we go to sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
