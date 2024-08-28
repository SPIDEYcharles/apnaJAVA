public class factorialbyMAm{

    public static int func(int n ){
        if(n==0){
            return 1;
        }
    //    int fnm1 = func(n-1);
    //    int fn = n*fnm1;
    //    return fn;        
        
       return n*func(n-1);
    }

    public static void main(String ar[]){
        int n = 4 ;
        if (n<0) {
            System.out.println("try whole numbers!!");
        }
        else{
        System.out.println(func(n));}
    }
}