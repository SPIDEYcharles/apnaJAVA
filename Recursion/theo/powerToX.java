public class powerToX {
    public static int powerN(int x, int n){
        if (n>0) {
            return x*powerN(x, n-1);
        }
        return 1;
        // if (n==0) {
        //     return 1;
        // }                        .......by mam  \ maybe its effective way for reading code

        // return x*powerN(x, n-1);
    }
    public static int optimized(int x, int n) {
        if (n==1) {
            return x;
        }
       // return optimized(x, n/2)*optimized(x, n-n/2);   // self optimised with n,(n-n/2)...
                                                        // for odd values of n
                                                        // O(n)


        int halfPower = optimized(x, n/2);
        int halfPowerSq = halfPower * halfPower;         // O(logn)
        if (n%2!=0) {
            halfPowerSq =  x*halfPowerSq;
        }
        return halfPowerSq;

    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(optimized(x,n));
    }
}
