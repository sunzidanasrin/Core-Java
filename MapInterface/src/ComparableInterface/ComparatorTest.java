package ComparableInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {

    public static void main(String[] args) {
        Comparator c = new NameComp();
        TreeSet studentSet = new TreeSet(c);
        studentSet.add(new Student("Shamim", "sarkar", 12365, 4.8));
        studentSet.add(new Student("Shohan", "Sazal", 12366, 4.7));
        studentSet.add(new Student("Ruhul", "Amin", 12364, 4.9));
        studentSet.add(new Student("Shahriar", "Islam", 12367, 4.7));
        studentSet.add(new Student("Parvez", "Mohammad", 12368, 4.5));
        studentSet.add(new Student("Sanjida", "Urmi", 12369, 4.5));

        Object[] studentArray = studentSet.toArray();
        Student s;
        for (Object obj : studentArray) {
            s = (Student) obj;

            System.out.println("Full Name: "+s.firstName + " " + s.lastName + " \n" + +s.GPA + "   " + s.studentID);
        }
    }
}
