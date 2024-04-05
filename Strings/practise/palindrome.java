

public class palindrome {
    public static boolean pal(String name){
        boolean flag = true;
        for (int i = 0; i < name.length()/2; i++) {
            if (name.charAt(i) != name.charAt(name.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "racecar";

        
        System.out.println(pal(name));
    }
}
