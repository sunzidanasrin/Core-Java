
package ComparableInterfaceImplimentation;

import java.util.TreeSet;


public class StudentListApp {
     
    public static void main(String[] args) {
        TreeSet studentSet = new TreeSet();
        studentSet.add(new Student("Mike", "Hauffmamn", 101, 4.0));
        studentSet.add(new Student("John", "Lynn", 102, 2.8));
        studentSet.add(new Student("Jim", "max", 103, 3.6));
        studentSet.add(new Student("Kelly", "Grant", 104, 2.3));
        
        Object [] studentArray = studentSet.toArray();
        Student s;
        for ( Object obj : studentArray ){
        s = ( Student ) obj;
            System.out.println(" Name : "+s.firstName()+" "+ s.lastName()
                    + "ID : "+s.studentID() 
                    +"GPA :"+s.GPA());
                     
            System.out.println("............");
        }
        
    }
}
