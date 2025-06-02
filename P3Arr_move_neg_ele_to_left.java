//PROBLEM STATEMENT : Move all the negative elements to one side of the array

class Main {
    public static void main(String[] args) {
        //eg arr
        int[] arr={-1,2,4,-3,4,5,0};
        int n=arr.length;
        
        //moving non negative elements to left side.
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        //printing resultant array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
    }
}
