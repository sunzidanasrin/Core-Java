package TestFileEasyWay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileEasyWay {

    public static void main(String[] args) throws IOException {
        File f = new File("E:/test.txt");
        File f2 = new File("E:/test2.txt");

        //f.createNewFile();
        //f.delete();
        //f.createNewFile();
        //f2.createNewFile();
        //f.renameTo(f2);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("E:/test.txt"))) {
            bw.write("Hello i live in Dhaka");
            bw.newLine();
            bw.write("Dhaka is the capital city of bangladesh");
        } catch (Exception e) {

        }
        BufferedReader br = new BufferedReader(new FileReader("E:/test.txt"));
        String t = null;
        while ((t = br.readLine()) != null) {
            System.out.println(t);
        }

    }
}
