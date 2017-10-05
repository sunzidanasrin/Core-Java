
package array;


public class Array3D {

    public static void main(String[] args) {

        //int[][] array2D = {{1,3,5},{2,6,9,3},{1,1},{2,2,2}};
        int[][][] array3D = {{{1, 3, 5}, {2, 6, 9, 3}, {2, 3, 8}},
        {{1, 1}, {2, 2, 2}, {3, 6, 5}}
        };
        
        for(int[][] array2D : array3D){
          for (int[] array1D : array2D) {
            for (int item : array1D) {

                System.out.print("" + item);
            }
            System.out.println("");
        }
    }
    }
    

    
}
