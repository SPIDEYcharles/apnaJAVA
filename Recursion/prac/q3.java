public class q3 {
    public static int findLength(String str,int k){
        if (str.charAt(k)== ) {
            return k;
            
        }
        findLength(str, k+1);
        return 0;
    }
    public static void main(String[] args) {
        String str = "animal";
        System.out.println(findLength(str,0));
        
    }
}
