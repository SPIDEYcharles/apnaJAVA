public class Subset {

    public static void printSubset(String str,String ans,int i){
        //base
        if (i==str.length()) {
            if (ans=="") {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //rescursipon
        //yes case
        printSubset(str, ans+str.charAt(i), i+1);
        //no case
        printSubset(str, ans, i+1);
    }
    public static void main(String arg[]){
        String str = "abc";
        printSubset(str,"",0);
    }
}
