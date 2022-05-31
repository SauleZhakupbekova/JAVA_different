package L19_MultiFlow;

public class Singer2_wait extends Thread {

    @Override

    public void run() {
        while (true) {
            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait(); // singer 2 is sleeping at the beginning when singer1 is singing song
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("fa---------");
                try {
                    Thread.sleep(1000); //stop to sing song
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();//notify signer1 that microphone is free
            }

        }
    }
}

