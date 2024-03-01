public class decBin {
    public static int getDecimal(int x){
        int c =0;
        int i=0;
        while (x>0) {
            c+=(x%2)*Math.pow(10, i );
            x/=2;
            i++;

        }
        return c;
    }
    public static void main(String[] args) {
        int a = 24;
        System.out.println(a);
        // System.out.println(Integer.toBinaryString(a));
        System.out.println(getDecimal(a));
    }
}
