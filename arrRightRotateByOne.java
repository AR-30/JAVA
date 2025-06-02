//PROBLEM STATEMENT : Write a program to cyclically rotate an array by one.

class Main {
    public static void main(String[] args) {
        //eg array
        int[] arr={-1,3,6,8,4,3,1};

        //cyclically rotate array by 1
        int temp1=arr[arr.length-1];
        int i=0;
        while(i<=arr.length-1){
            int temp2=arr[i];
            arr[i]=temp1;
            temp1=temp2;
            i++;
        }
        
        //printing resultant array
        System.out.print("Rotated array -> ");
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
