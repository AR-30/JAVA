//Find frequency of characters using map.

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
        	for(int i=0; i<s.length(); i++){
            		char c=s.charAt(i);
            		if(map.containsKey(c)){
                		int freq = map.get(c);
                		map.put(c, freq+1);
            		}
            		else{
               	 		map.put(c, 1);
            		}
        	}
        	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            		System.out.println(entry.getKey() + ":" + entry.getValue());
        	}
	}
}
