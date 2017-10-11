
package threadscheduling;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Parvez implements Runnable{

    int i;
    
    @Override
    public void run() {
        i = 0;
        while (true){
            System.out.println("Parvez : " +i++);
            if (i == 50){
            break;
            }
            /*when need sleep
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Parvez.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
    }
    
}
