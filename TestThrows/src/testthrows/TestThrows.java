
package testthrows;


public class TestThrows {

    
    public static void main(String[] args) {
       TestThrows mytc = new TestThrows();
       try{
           for (int i = 0; i < 10; i++) {
             mytc.getSomething();
               System.out.println(i);
           }
       
       
       }catch (InterruptedException iex){
           iex.printStackTrace();
       
       }
    }

    private void getSomething() throws InterruptedException{
    
     Thread.sleep(1000);
    }
    
}
