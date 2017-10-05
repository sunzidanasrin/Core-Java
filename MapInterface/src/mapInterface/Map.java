
package mapInterface;

import java.util.*;


public class Map {
    
    public static void main(String[] args) {
         HashMap map = new HashMap();
         map.put("one", "1st");
         map.put("second", new Integer(2));
         map.put("third", "3rd");
         
         map.put("third", "III");
         
         Set set1 = map.keySet();
         
         Collection collection = map.values();
         
         Set set2 = map.entrySet();
         
         System.out.println(set1 + " \n " + collection + " \n " + set2);
    }
}
