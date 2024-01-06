import java.util.*;
public class terinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // String a = (num % 2 == 0)?"even":"odd";
        // System.out.println(a);
        String marks = (num>=33)?"pass":"fail";
        System.out.println(marks);
    }
}
