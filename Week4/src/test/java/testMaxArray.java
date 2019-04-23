import junit.framework.Assert;
import org.junit.Test;

public class testMaxArray {

    @Test
    public void Test1(){
        int mang[] = {1,2,3,4};
        int maxarray = 4;
        int a =arrayMax.Max(mang);
        Assert.assertEquals(maxarray,a);

    }
}
