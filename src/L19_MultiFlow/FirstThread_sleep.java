package L19_MultiFlow;

public class FirstThread_sleep {
    public static void main(String[] args) {//pscm - creates Flow
        //we have three methods of sleep: sleep, yield, wait

        // insert call Second Flow
        // create class of object for Second Thread

        SecondThread_sleep secondThread = new SecondThread_sleep();
        secondThread.start(); // call of second Flow can be done by word "start"

        //Thread 3 is not flow. It implements interface. That is why it is called by another way
        Thread thread3 = new Thread(new ThirdThread_sleep());
        thread3.start();

        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(500); // class Thread which describes Flow
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
