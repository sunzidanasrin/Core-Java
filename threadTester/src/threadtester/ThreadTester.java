
package threadtester;


public class ThreadTester {

    
    public static void main(String[] args) {
      HelloRunner r = new HelloRunner();
      Thread t = new Thread(r);
      t.start();
      Thread t2 = new Thread(r);
      
      t2.start();
    }
    
}
class HelloRunner implements Runnable{
    public void run(){
        int i = 0;
        while (true){
            System.out.println("Hello " +i++);
            if ( i==50 ){
            break;
            }
        }
    }

}