package DeleteFile;

import java.io.File;
import java.io.IOException;

public class NewClass {

    public static void main(String[] args) throws IOException {
        /*
       File newFile = new File(" my _new_ file.txt ");
        printFileDetails(newFile);
        
        // create a new file
        
        boolean fileCreated = newFile.createNewFile();
        if (! fileCreated){
            System.out.println(newFile + " could not be created .");
        }
        printFileDetails(newFile);
        
        // Delete the new file
        newFile.delete();
        System.out.println(" After deleting the new file ");
        printFileDetails(newFile);
        
        // recreate the file
        newFile.createNewFile();
        printFileDetails(newFile);
         */
 /* Let's tell the JVM to delete this file on exist
        newFile.*/

        // Create a new file and rename
        File firstFile = new File(" my_first_file.txt");
        File secondFile = new File(" my_second_file.txt");
        boolean fileCreated = firstFile.createNewFile();
        if (fileCreated || firstFile.exists()) {
            printFileDetails(firstFile);
            printFileDetails(secondFile);
            boolean renameFlag = firstFile.renameTo(secondFile);
            if (!renameFlag) {
                System.out.println("Could not rename " + firstFile);
            }
            printFileDetails(firstFile);
            printFileDetails(secondFile);
        }
    }

    public static void printFileDetails(File f) {
        System.out.println("Absolute path: " + f.getAbsoluteFile());
        System.out.println("File exists: " + f.exists());

    }
}
