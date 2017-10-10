
package nested;

//Outer class
public class Outer {

    public int x = 0;
    
    //nested or inner class
    class Inner{
    
        public int x = 1;
        
        void methodInInnerClass(int x){
            System.out.println("x = "+ x);
            System.out.println("this.x = " + this.x);
            System.out.println("Outer.this.x = " + Outer.this.x);
        }
    }
   
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.methodInInnerClass(23);
        
    }
}
 