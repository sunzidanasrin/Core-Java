
package WildCardAnotherExample;

import java.util.ArrayList;
import java.util.List;


public class WildCardTest {
    
    public static void main(String[] args) {
        List <A> listA = new ArrayList<A> ();
        listA.add(new A ("Rahim"));
        ProcessElements(listA);
        
        List <B> listB = new ArrayList<B> ();
        listB.add(new B (50.0));
        listB.add(new B (20.0));
        ProcessElements(listB);
        
        List <A> listAc = new ArrayList<A> ();
        listAc.add(new A ("Karim"));
        listAc.add(new A ("Halim"));
        ProcessElementsBitDifferent(listAc);
    }
    public static void ProcessElements(List<?> elements) {
        for (Object o : elements) {
            System.out.println(o);  
        }
    }
    public static void ProcessElementsBitDifferent(List<? extends A> elements) {
        for (A a : elements) {
            System.out.println(a.getName());  
        }
    }
}
