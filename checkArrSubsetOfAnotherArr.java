//Find whether an array is a subset of another array
//Brute force
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 3, 9};
        int[] subset = {2, 7};
        
        for(int num : subset){
            boolean flag = false;
            for(int ele : arr){
                if(num == ele){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.print("Not a subset");
                return;
            }
        }
        System.out.print("It is a subset");
        return;
    }
}

//Hashset approach

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 3, 9};
        int[] subset = {2, 7};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : subset) {
            if (!set.contains(num)) {
                System.out.println("Not a subset");
                return;
            }
        }

        System.out.println("It is a subset");
    }
}
