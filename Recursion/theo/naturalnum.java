public class naturalnum{
    public static void inc(int n){
        if (n>=1) {
            System.out.print(n+" ");
            inc(n-1);
            }
    }
    public static void main(String fuss[]){
        int n = 10;
        inc(n);
    }
}