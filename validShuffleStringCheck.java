//Write a Program to check whether a string is a valid shuffle of two strings or not

import java.util.*;
class Main {
    
    static String sorted_string(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    
    static boolean valid_shuffle_check(String s1, String s2, String shuffle) {
        int n1 = s1.length();
        int n2 = s2.length();
        int l = shuffle.length();
        
        if((n1+n2) != l){
            return false;
        }
        
        String joint_s = s1 + s2;
        
        if (!sorted_string(joint_s).equals(sorted_string(shuffle))){
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "xy";
        String shuffle = "axbcyd";

        System.out.println(valid_shuffle_check(s1, s2, shuffle));
    }
}
