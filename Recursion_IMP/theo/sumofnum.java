public class sumofnum {
    public static int sumof(int n){
        // if (n>0) {
        //     return n+sumof(n);
        // }
        // return 0;
        if (n==0) {
            return 0;
        }
        return n+sumof(n-1);
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(sumof(n));
    }
}
