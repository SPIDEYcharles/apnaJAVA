package functions.dem;

import java.util.*;

public class prod {

    public static int product(int a,int b){
        int prod = a*b;
        return prod;
    } 
    public static void main(String ar[]){
        Scanner scan = new Scanner(System.in);
        int prod = product(scan.nextInt(),scan.nextInt());
        System.out.println(prod);
    }
}
