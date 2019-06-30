import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testMaxArray {

    @Test
    public void Test1(){
        int mang[] = {1,2,3,4};
        int maxarray = 4;
        int a =arrayMax.Max(mang);
        assertEquals(maxarray,a);

    }

    @Test
    public void Test2(){
        int mang[] = {1,5,3,36,2,4};
        int maxMang = 36;
        int a = arrayMax.Max(mang);

        assertEquals(maxMang,a);
    }
}
