
package testthrows;


public class TestThrowExample2 {
    
    public static void main(String a[] ) {
       try{
       TestThrowExample2 met = new TestThrowExample2();
           System.out.println("length of DHAKA is :" + met.getStringSize("DHAKA"));
           System.out.println("length of HASINA is :" + met.getStringSize("HASINA"));
           System.out.println("length of null string is :" + met.getStringSize(null));
       } catch(Exception ex){
           System.out.println("Exception message :" + ex.getMessage());
       }
    }
    public int getStringSize(String str) throws Exception{
        if(str==null){
            throw new Exception("String input is null");
        }
        return str.length();
    }
}
