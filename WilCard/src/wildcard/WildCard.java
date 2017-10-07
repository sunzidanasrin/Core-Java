
package wildcard;

import java.util.List;

public class WildCard {

   
    public static void insertElements(List<? super A> list) {
        list.add(new A());
        list.add(new B());
        list.add(new C());
        //list.add(new D()); bcz D is nt super class, it is another class
        
        
    }
    
}
