
package array;


public class Array2D {
    
    public static void main(String[] args) {
        
        
        int[][] array2D = {{1,3,5},{2,6,9,3},{1,1},{2,2,2}};
       
       for (int [] array1D : array2D ){
         for (int item : array1D){
             System.out.print(""+item);
       }
           System.out.println("");
       }
    }
    
    
}
