public class MaxSubBrute {
    public static void maxSum(int a[]){
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = 0; j < a.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum+=a[k];
                }
                System.out.println(sum);
                    if(max < sum){
                        max  = sum;
                }
                
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-2,0,4,5};

        maxSum(arr);
    }
}
