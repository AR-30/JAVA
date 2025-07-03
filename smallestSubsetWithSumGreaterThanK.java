//Smallest Subarray with sum greater than a given valued 

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 7, 10, 19};
        int x = 51;
        
        int res = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];
                
                if(sum > x){
                    res = Math.min(res, j-i+1);
                    break;
                }
            }
        }
        if(res == Integer.MAX_VALUE){
            System.out.print(0);
        }else{
            System.out.print(res);    
        }
    }
}
