

public class binomialCoef {

    public static int factorial(int p){
        int fact =1;
        for (int i = 1; i <= p; i++) {
            fact*=i;
        }
        return fact;
    }

    public static int binomial(int n,int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        return a/(b*c);

    }
    public static void main(String duck[]){
        System.out.println(binomial(3,2));

    }
}
