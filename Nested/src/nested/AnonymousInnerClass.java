
package nested;


public class AnonymousInnerClass {
    
    public static void main(String[] args) {
        B b = new B(){
            @Override
            public void displayMsg() {
                System.out.println("Hi Im a method from class a, but modified ");
            }
        
        };
        
        b.displayMsg();
        
    }
}
