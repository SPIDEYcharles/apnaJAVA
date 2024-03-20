public class subArr {
    
    public static void aubArray(int []numbers){
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                System.out.print("{");
                ts++;
                for (int k = start; k <=end; k++) {
                    if (k==end) {
                        System.out.print(""+numbers[k]+"");
                    }
                    else{
                    System.out.print(""+numbers[k]+",");
                    }
                    
                }
                System.out.print("}");
                System.out.println();
            }
            
        }
        System.out.println("number of subarrs: "+ts);
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5,8};

        aubArray(arr);

        
    }
}
