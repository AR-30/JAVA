//Median of 2 sorted arrays of different size
//Time: O(n1 + n2) worst case (until middle)
//Space: O(1) — no extra arrays used

class Main {
    public static void main(String[] args) {
        int[] a = {1, 12, 14};
        int[] b = {2, 13};
        
        int n1 = a.length;
        int n2 = b.length;
        int total = n1 + n2;

        int j = 0, k = 0;
        double med = 0;
        for(int count=0; count<=total/2; count++){
            int val;
            if(j<n1 && (k>=n2 || a[j]<b[k])){
                val = a[j];
                j++;
            }else{
                val = b[k];
                k++;
            }
            
            if(total%2 == 0){
                if(count == total/2 - 1) med += val;
                if(count == total/2){
                    med += val;
                    System.out.print("Median is: " + (med / 2.0));
                    return;
                }
            }else{
                if(count == total/2){
                    System.out.print("Median is: " + val);
                    return;
                }
            }
        }
    }
}
