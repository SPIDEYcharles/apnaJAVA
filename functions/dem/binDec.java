public class binDec {

    public static int covert(int x){
        int c=0;
        int i=0;
        while (x>0) {
            c+=Math.pow(2, i)*(x%10);
            i++;
            x/=10;
        }
        return c;
    }
    public static void main(String fuck[]){
        int a = 1010;
        System.out.println(a);
        System.out.println(covert(a));
    }
}
