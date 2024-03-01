

public class linear {
    public static void main(String[] args) {
        int [] a={1,3,5,4,12,20,14};
        int key =14;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key) {
                System.out.println(i);
            }
        }
    }
}
