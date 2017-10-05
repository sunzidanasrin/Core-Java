
package array;


public class Array {

    
    
    public static void main(String[] args) {
        //here 2 indicates
       int[][] array2D = new int [2][3];
       //Row 1 data
       array2D[0][0] = 1;
       array2D[0][1] = 3;
       array2D[0][2] = 5;
       //Row 2 data
       array2D[1][0] = 2;
       array2D[1][1] = 6;
       array2D[1][2] = 9;
       
       for (int [] array1D : array2D ){
         for (int item : array1D){
             System.out.print(""+item);
       }
           System.out.println("");
       }
    }
    
}
