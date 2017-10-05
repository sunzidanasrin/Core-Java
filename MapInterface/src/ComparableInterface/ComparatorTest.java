
package ComparableInterface;

import java.util.Comparator;
import java.util.TreeSet;


public class ComparatorTest {
    
    public static void main(String[] args) {
        Comparator c = new NameComp();
        Student s1 = new Student("Shamim", "Sarkar");
        Student s2 = new Student("Ruhul", "Amin");
        
        NameComp nc = new NameComp();
        System.out.println("Compare :" + nc.compare(s1, s2));
    }
}
