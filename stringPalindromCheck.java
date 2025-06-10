//CHECKING WHETHER A STRING IS PALINDROME OR NOT

import java.util.*;

public class Main {
    public static void main(String[] args) {
       String str = "123321";
        String reversedStr = "";
        for (int i=str.length()-1; i>=0; i--) {
            reversedStr+=str.charAt(i);
        }
        if(str==reversedStr){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not a palindrome");
        }
         
    }
}
