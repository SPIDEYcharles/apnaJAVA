
public class q2 {
    public static int locate(int k,int [] num){

        int mid = (num[0]+num[num.length-1])/2;
        if (k<=mid) {
            
        }
        for (int i = 0; i < num.length; i++) {
            
            if (k == num[i]) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int num[] = {4,5,6,7,0,1,2};
        int k = 8;
        System.out.println(locate(k,num));
    }
}
