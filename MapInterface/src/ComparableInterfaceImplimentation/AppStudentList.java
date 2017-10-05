
package ComparableInterfaceImplimentation;


public class AppStudentList {
    public static void main(String[] args) {
        Student s = new Student("Ruhul", "Amin", 123654, 5.0);
        Student s1 = new Student("Shahriar", "Islam", 789652, 4.8);
        
        System.out.println(s.compareTo(s1));
        
    }
}
