public class maxSumKadaganes {


    public static void kadane(int arr[]){
        
        int cuSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            cuSum+=arr[i];
            if(cuSum <0){
                cuSum = 0;
            }
            if (cuSum > maxSum) {
                maxSum = cuSum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int a[] = {1,3,-2,0,-4,-1,7,-2
            
            
            
            ,3};

        kadane(a);
    }
}
