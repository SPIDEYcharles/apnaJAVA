import java.util.Scanner;

public class p3{

    public static boolean isPal(int n){
        int reverse  = 0;
        int palindrome = n;
        
        while (palindrome>0) {
            
           reverse += palindrome % 10;
           reverse *= 10;
           palindrome/=10;
        }
        reverse/=10;

        if ((reverse)==n) {
            return true;
        }
        else{
            return false;
        }  
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPal(n)) {
            System.out.println(n+ " is a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
    }
}
