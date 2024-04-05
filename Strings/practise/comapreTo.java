

public class comapreTo {
    public static void main(String[] args) {
        String largest = "";
        String fruits []= {"banana","apple","papaya"};

        for (int i = 0; i <fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0) {
                
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
