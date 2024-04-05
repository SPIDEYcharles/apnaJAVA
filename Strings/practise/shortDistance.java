
public class shortDistance {

    public static float shortDist(String str){
        int x,y;
        x=y=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='W') {
                x--;
            }
            else if (str.charAt(i)=='E') {
                x++;
            }
            else if (str.charAt(i)=='N') {
                y++;
            }
            else if(str.charAt(i)=='S')
                y--;
        }
        return (float) Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        System.out.println(shortDist(str));
    }
}
