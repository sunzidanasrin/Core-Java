package AlternativewayToCreateThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("thread started running..");
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
