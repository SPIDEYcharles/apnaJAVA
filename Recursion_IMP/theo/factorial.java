public class factorial{

    public static int func(int n ){
        
        if (n>0) {
                return n*func(n-1);
            }
        return 1;        
    }

    public static void main(String ar[]){
        int n = 0 ;
        if (n<0) {
            System.out.println("try whole numbers!!");
        }
        else{
        System.out.println(func(n));}
    }
}