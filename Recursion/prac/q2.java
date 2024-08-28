public class q2 {

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void convertToString(int n){
       if (n==0) {
        return;
       }
       int last = n%10;
       convertToString(n/10);
       System.out.print(digits[last]+" ");

    }
    public static void main(String[] args) { 
        convertToString(2021);
    }
}
