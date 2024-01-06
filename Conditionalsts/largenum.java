import java.util.*;

public class largenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number a: ");
        int a = sc.nextInt();
        System.out.println("enter b: ");
        int b= sc.nextInt();
        if(a>b){
            System.out.println("a is large number");
        }
        else{
            System.out.println("b is bigger");
        }
    }
}
