import java.util.Scanner;

public class convertReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result=0;
        int last;
        while (num != 0) {
            
            last = num % 10 ;
            num = num / 10;

            result = (result*10) + last; 
        }
            
        
        System.out.println(result);
    }
}
