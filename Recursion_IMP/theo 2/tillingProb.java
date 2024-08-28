
// no of ways to tile up a floor size of (2 x n) 
// all possible ways including vetical and horizontal placing of tiles (2 x 1) size

public class tillingProb {

    public static int tilling(int n) {
        //base case
        if (n==0||n==1) {
            return 1;
        }

        // actual work in code

        // verticle choice
        int f1 = tilling(n-1);

        // horizontal choice
        int f2 = tilling(n-2);

        int toways = f1 + f2;
        return toways;
    }
    public static void main(String fed[]){
        System.out.println(tilling(3));
    }
}


/////revise again in dynamic programming