
package generics;

import java.util.ArrayList;

public class AutoBoxingCollectionGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,5);
        list.add(1,4);
        int ip = list.get(1);
        System.out.println("IP : "+ip);
                
    }
}
