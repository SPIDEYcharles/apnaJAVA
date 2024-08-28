public class pairingProb {
    public static int pairingProb(int n){

        if (n==1||n==2) {
            return n;
        }
        //choice 
        //single
        int f1 = pairingProb(n-1);
        //pair
        int f2 = pairingProb(n-2);
        int pairWays = (n-1)*f2;

        return f1+pairWays;

    }
    public static void main(String[] args) {
        int n= 4;
        System.out.println(pairingProb(n));
    }
}
