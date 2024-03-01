

public class factorial {

    public static int fact(int a){
        int fact= 1;
        int i = a;
        while (i >=1) {
            fact*=a--;
            i--;
        }
        
        return fact;
        
    }
    public static void main(String fuck[]){
        int a = 5;
        
        int fact = fact(a);

        System.out.println(fact);
    }
}
