import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {
        String str1 = "8";
        String str2 = "0";
        int num1 = Integer.valueOf(str1).intValue();
        int num2 = Integer.valueOf(str2).intValue();
        int num3 = num1 / num2;
        System.out.println("num3 = " + num3);

    }
}
