import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("next num:");
        float b = sc.nextFloat();
        System.out.println("operation to make");
        String op = sc.next();
        switch (op) {
            case "+":System.out.println(a+b);
                break;
            case "-":System.out.println(a-b);
                break;
            case "*":System.out.println(a*b);
                break;
            case "/":System.out.println(a/b);
                break;
            default:System.out.println(a);
                break;
        }
    }
    
}
