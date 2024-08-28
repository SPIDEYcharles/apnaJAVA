public class q3 {
    public static int findLen(String str, int k){
        if (str.length() == 0) {
            return k;
        }
        return findLen(str.substring(1),k+1);
    }
    public static void main(String[] args) {
        String str = "animal";
        System.out.println(findLen(str, 0));
        // System.out.println(str.substring(2, 3));
    }
}
