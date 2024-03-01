public class maxSumPrefix {
    
        public static void maxSum(int a[]){
            int max = Integer.MIN_VALUE;
            int prefix[] = new int[a.length];
            int sum = 0;
            prefix[0] = a[0];
            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i-1]+a[i]; 
            }
            
            for (int i = 0; i < a.length; i++) {
                int start = i;
                for (int j = 0; j < a.length; j++) {
                    int end = j;
                    
                    sum = start == 0 ?prefix[end] : prefix[end] - prefix[start-1];
                    
                        if(max < sum){
                            max  = sum;
                    }
                    
                }
            }
            System.out.println(max);
        }
        public static void main(String[] args) {
            int arr[] = {0,3,-2,0,4,5};
    
            maxSum(arr);
        }
    
}
