import java.util.*;
public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        do{
            a = sc.nextInt();
            if (a%10==0) {
                break;
            }
            System.out.println(a);

        }while(true);
    }
}
