public class q1 {
    public static boolean nums(int [] given){
        for (int i = 0; i < given.length-1; i++) {
            for (int j = i+1; j < given.length; j++) {
                if (given[i]==given[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int given[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(nums(given));
    }
}
