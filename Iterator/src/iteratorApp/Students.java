
package iteratorApp;


public class Students {
    String firstName, lastName;
    int studentID;
    double GPA;

    public Students(String firstName, String lastName, int studentID, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGPA() {
        return GPA;
    }

   
}


