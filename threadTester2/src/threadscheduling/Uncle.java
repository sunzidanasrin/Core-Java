
package threadscheduling;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Uncle implements Runnable{
     int i;
    
    @Override
    public void run() {
        i = 0;
        while (true){
            System.out.println("Uncle : " +i++);
            if (i == 50){
            break;
            }
            /*When want sleep
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Uncle.class.getName()).log(Level.SEVERE, null, ex);
            }*/
                
        }
    }
    
}

