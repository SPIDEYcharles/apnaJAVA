

public class q4 {
    public static void main(String[] args) {
        
        String st1 = "comodes";
        String st2 = "domesco";
        int count =0;

        
        
        for (int i = 0; i < st1.length(); i++) {
            for (int j = 0; j < st2.length(); j++) {
                
                if (st1.charAt(i) == st2.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
