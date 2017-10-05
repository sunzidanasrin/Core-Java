
package forinforbignumber;


public class ForInForBigNumber {

    private static int nums[] = {4,8,5,7,6,20};
    
    private static int bignumber = 5;
    public static void main(String[] args) {
       
        for (int x : nums){
            if(x<bignumber){
            bignumber = x;
            }
        }
            System.out.println(bignumber);
        
    }
    
}
