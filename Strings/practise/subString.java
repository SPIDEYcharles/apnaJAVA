

public class subString {

    public static String subStrng(String name,int si,int ei){
        String firstName = "";
        for (int i = si; i <=ei; i++) {
            firstName += name.charAt(i);
        }
        return firstName;
    }
    public static void main(String ass[]){
        
        String name = "Alexander the great";

        

        System.out.println(subStrng(name, 0, 8));
    }
}
