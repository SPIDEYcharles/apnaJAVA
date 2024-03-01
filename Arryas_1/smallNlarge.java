import java.util.*;
public class smallNlarge {
    public static void main(String duck[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int []mikes ={1,4,6,8,3,0,2};
        for (int i = 0; i < mikes.length; i++) {
            if (mikes[i]>max) {
                max = mikes[i];
            }
            if (mikes[i]<min) {
                min = mikes[i];
            }
        }
        System.out.println(" min: " + min+"  max: "+max);
    }
}
