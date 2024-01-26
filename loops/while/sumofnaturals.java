import java.util.Scanner;

public class sumofnaturals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count<=num){
            sum += count++;
        }
        System.out.println(sum);
    }
}
