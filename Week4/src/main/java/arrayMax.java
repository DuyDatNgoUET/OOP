public class arrayMax {

    int array[] = new int[100];

    public static int Max(int ar[]){
        int result = 0;
        for(int i=0; i < ar.length ; i++){
            int max = i;
            for(int j=1; j<ar.length; j++){
                if(ar[max]<ar[j]) max = j;
            }
            result = ar[max];
        }
        return result;
    }

}
