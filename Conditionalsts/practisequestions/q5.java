import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        int year = dc.nextInt();
        int a;

        String leap = (year%4==0)?"Leap year":"not Leap year";
        System.out.println(leap);
        System.out.println(a);
    }
}
