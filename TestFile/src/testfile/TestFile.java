
package testfile;

import java.io.File;
import java.io.IOException;


public class TestFile {

   
    public static void main(String[] args) throws IOException {
       File newFile = new File(" my new file.txt ");
        printFileDetails(newFile);
        
        // create a new file
        
        boolean fileCreated = newFile.createNewFile();
        if (! fileCreated){
            System.out.println(newFile + " could not be created .");
        }
        printFileDetails(newFile);
    }
    public static void printFileDetails(File f) {
        System.out.println("Absolute path: "+ f.getAbsoluteFile());
        System.out.println("File exists: "+ f.exists());
        
    }
}
