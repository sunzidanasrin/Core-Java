
package loop;


public class Forloop1 {
    
    private static int s=1;
    private static int e=10;
    private static int sum=0;
   
    
    public static int makeSum(int s, int e) {
       for (int i=s; i<=e; i++){
       sum+=i;
       }
       return sum;
    }
    public static void main(String[] args) {
        System.out.println(makeSum(10,20));
    }
    
}
