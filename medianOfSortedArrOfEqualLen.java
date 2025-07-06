//Median of 2 sorted arrays of equal size
//Time: O(n) — single merge-like pass up to n
//Space: O(1) — no extra arrays used

class Main {
    public static void main(String[] args) {
        int[] a = {1, 12};
        int[] b = {2, 13};
        int n = a.length;
        int med = 0;
        
        int j = 0, k = 0;
        for(int count=0; count<=n; count++){
            int val;
            if(j<n && (k>=n || a[j]<b[k])){
                val = a[j];
                j++;
            }else{
                val = b[k];
                k++;
            }
            if(count == n - 1 || count == n){
                med += val;
            }
        }
        System.out.print(med/2.0);
    }
}
