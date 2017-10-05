
package loop;


public class Whileloop {

    
    private static int s=1;
    private static int e=10;
    private static int sum=0;
    
    public static void main(String[] args) {
        System.out.println(makeSum(s, e));
    }
   
     public static int makeSum(int s, int e) {
        
         while(s<=e){
         sum+=s;
         s++;
         }
    return sum;
    
}
}