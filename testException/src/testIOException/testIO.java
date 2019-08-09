package testIOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class testIO {


    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("D:\\STUDY_ALL\\Study\\OOP\\testException\\test.txt");
            BufferedReader fileInput = new BufferedReader(file);
            for (int i = 0; i < 5; i++) System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
