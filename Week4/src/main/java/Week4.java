import java.text.DecimalFormat;

public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {

        if(a>b || a==b) return a;
        return b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min = arr[i];
        }
        return min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight  /( height*height);
        double a = (double)Math.round(BMI * 10d) / 10d;
        if(a<18.5) return "Thiếu cân";
        else if(a>=18.5 && a <= 22.99 ) return "Bình thường";
        else if(a>23 && a<=24.99) return "Thừa cân";
        else if(a>25) return "Béo phì";
        else return null;
    }
}