import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pencil+pen +eraser;
        System.out.println(bill);
        
        System.out.println("with tax your bill is:"+(bill*1.18));
    }
}
