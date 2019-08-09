import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Week8_Task2 {

    // Null Pointer Exception
    void NPEx() throws NullPointerException{
        Integer a = null;
        a++;
    }

    String NPExTest(){
        try{
            NPEx();
            return "Không có lỗi";
        }catch (NullPointerException npe){
            return "Lỗi Null Pointer";
        }
    }

    // Array Index Out Of Bounds Exception
    void AIOoBEx() throws ArrayIndexOutOfBoundsException{
        int []a = {1,2,3};
        a[4] = 10;
    }

    String AIOoBExTest(){
        try{
            AIOoBEx();
            return "Không có lỗi";
        }catch (ArrayIndexOutOfBoundsException ai){
            return "Lỗi Array Index Out of Bounds";
        }
    }

    // Arithmetic Exception
    void ArithEx() throws ArithmeticException{
        int a = 5/3;
    }

    String ArithExTest(){
        try{
            ArithEx();
            return "Không có lỗi";
        }catch (ArithmeticException ae){
            return "Lỗi Arithmetic";
        }
    }

    // File Not Found Exception
    void FNFEx() throws FileNotFoundException , IOException {
        FileReader fr = new FileReader("abc.txt");
        fr.read();
    }

    String FNFExTest(){
        try{
            FNFEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        } catch (IOException e) {
            return "Lỗi File Not Found";
        }
    }

    // IO Exception
    void IOEx() throws  IOException {
        FileReader fr = new FileReader("abc.txt");
        fr.read();
    }

    String IOExTest(){
        try{
            FNFEx();
            return "Không có lỗi";

        } catch (IOException e) {
            return "Lỗi IO";
        }
    }

}
