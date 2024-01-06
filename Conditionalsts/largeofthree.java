import java.util.*;
public class largeofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();int B =sc.nextInt(); int C =sc.nextInt();
        if(A>B){
            if(A>C){
                System.out.println("A is big");
            }
            else{
                System.out.println("C is big");
            }
        }
        else{
            if(B>C){
                System.out.println("B is big");
            }
            else{
                System.out.println("C is big");
            }
        }
    }
}
