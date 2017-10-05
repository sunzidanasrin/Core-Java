
package ComparableInterface;


public class Student {
    String firstName, lastName;
    int studentID;
    double GPA;

    public Student(String firstName, String lastName, int studentID, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    Student(String shamim, String sarkar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
