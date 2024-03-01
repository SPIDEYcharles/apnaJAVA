public class maxSumKadaganes {
    public static void main(String[] args) {
        int a[] = {1,3,-2,0,-4,-1,7,3};
        int cuSum = 0;
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            cuSum+=a[i];
            if(cuSum <0){
                cuSum = 0;
            }
            if (cuSum > maxSum) {
                maxSum = cuSum;
            }
        }
    }
}
