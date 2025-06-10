//REVERSING A STRING

import java.util.*;

public class Main {
    public static void main(String[] args) {
       String str = "qwerty";
        String reversedStr = "";
        for (int i=str.length()-1; i>=0; i--) {
            reversedStr+=str.charAt(i);
        }
        System.out.print(reversedStr); 
    }
}
