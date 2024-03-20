public class rainTrapped{


    public static int Max(int[] l){
        int n = l.length;
        int leftMax[] = new int[n];
        leftMax[0] = l[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(l[i], leftMax[i-1]);
            
        }
        
        int rightMax[] = new int[n];
        rightMax[n-1] = l[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(l[i],rightMax[i+1]);
        }
        int trWater =0;
        
        for (int i = 0; i < n; i++) {
            int level = Math.min(rightMax[i], leftMax[i]);
            System.out.print(level-l[i]);
            trWater +=(level - l[i]);
            
        }
        return trWater;
    }

    public static void main(String[] args) {
        
        int []arr = {3,4,1,7,9,4,6};
        
        System.out.println(Max(arr));
        }
}