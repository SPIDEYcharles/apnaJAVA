import java.util.Scanner;

public class p2 {
    public static boolean isEven(int a){
        if (a%2==0) {
            return true;
        }
        return false;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
