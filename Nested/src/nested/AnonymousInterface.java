
package nested;


public class AnonymousInterface {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void bite() {
                System.out.println("Animal can bite");
            }

            @Override
            public void run() {
                System.out.println("Animal can run");

            }
        };
        
        a.bite();
        a.run();
        
        
    }
    
}
