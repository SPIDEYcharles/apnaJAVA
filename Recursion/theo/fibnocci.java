public class fibnocci{

    public static int fib(int n ){
        if(n>=2){
            return fib(n-1)+fib(n-2);
        }
        return n;
    }
    public static void main (String arg[]){
        int n = 8;
        System.out.println(fib(n));
    }
}