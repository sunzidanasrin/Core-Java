
package SimpleTread;


public class SimpleThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread();
        t.start();
        t.sleep(2000);
        System.out.println("Thread Name:" + t.getName());
    }
}
