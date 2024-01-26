import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd,n,even;
        boolean choice=true;
        odd = 0;
        even = 0;
        do{
            System.out.println("enternum:");
            n = sc.nextInt();
            if(n%2==0){
                even +=n;
            }
            else{
                odd +=n;
            }
            System.out.println("enter 1 for yes or 0 for no:");
            choice = sc.nextBoolean();
        }while(choice==true);
        
        System.out.println("sum of odd entered :" + odd);
        System.out.println("sum of even entered:" + even);
    }
}
