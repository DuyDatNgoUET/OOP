import java.io.*;
import java.util.ArrayList;

public class Week8_Task2 {

    // NullPointerException
    public static int NPEx(String line) throws NullPointerException {
        return line.length();
    }

    public static String NPExTest(String line) {
        if (Week8_Task2.NPEx(line) == 0) throw new NullPointerException("Lỗi Null Pointer");
        return "Không có lỗi";
    }


    // ArrayINdexOutOfBoundsException
    public static int AIOoBEx(int[] arr) throws ArrayIndexOutOfBoundsException {
        return arr[arr.length];
    }

    public static String AIOoBExTest(int[] arr) {
        if (Week8_Task2.AIOoBEx(arr) == -1) throw new ArrayIndexOutOfBoundsException("Lỗi Array INdex Out OF Bounds");
        return "Không có lỗi";
    }

    // Arithmetic Exception
    public static int ArithEx(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static String ArithExTest(int a, int b) {
        return null;
    }

    //File Not Found Exception
    public static void FNFEx(String path) throws IOException {
        FileReader fr = new FileReader(path);
        while (fr.read() != -1) {
            System.out.println(fr.read());
        }
    }

    public static String FNFExTest(String path) {
        return null;
    }


}
