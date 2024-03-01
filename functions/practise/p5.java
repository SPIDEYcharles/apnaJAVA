

public class p5 {

    public static int sumDig(int n ){
        int sum =0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 1231;
        System.out.println(sumDig(n));
    }
}
