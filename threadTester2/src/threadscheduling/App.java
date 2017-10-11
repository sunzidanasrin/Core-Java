
package threadscheduling;


public class App {
    public static void main(String[] args) {
        Uncle u = new Uncle();
        Thread uThread = new Thread(u);
        uThread.setName("Mr. Rahim");
        uThread.setPriority(1);
        uThread.start();
        
        Parvez p = new Parvez();
        Thread pThread = new Thread(p);
        pThread.setName("Parvez");
        pThread.setPriority(10);
        pThread.start();
        
        System.out.println("uThread Name " + uThread.getName());
        System.out.println("pThread Name " + pThread.getName());
        System.out.println("uThread Priority " + uThread.getPriority());
        System.out.println("pThread Priority " + pThread.getPriority());
    }
}
