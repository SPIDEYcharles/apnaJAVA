import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        float tax = 0f;
        if(income<500000){
            
        }
        else if (income<1000000) {
            tax = 0.2f;
            
        }
        else{
            tax = 0.3f;
            
        }
        System.out.println("your income tax is "+(int)(tax*income));
    }
}
