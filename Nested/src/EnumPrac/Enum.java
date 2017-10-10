
package EnumPrac;


public class Enum {
    
    public static void main(String[] args) {
        
        Person person = new Person("Ria", 22, Gender.FEMALE);
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
        System.out.println("Gender :" + person.getGender());
    }
    
}
