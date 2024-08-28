public class q4{
    public static void printSub(String S,int x,int y){
        if (S.charAt(0)==S.charAt(S.length()-1)&&x==y-1) {
            System.out.println(S);
        }
        printSub(S.substring(x+1, y),x+1,y);
    }
    public static void main (String arg[]){
        String S = "abcab";
        printSub(S,0,S.length()-1);
    }
}

//////incompltete learn again with bwtter approach////