//INTERSECTION OF 2 ARRAYS USING SETS AND MAPS..

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Array 1 size : ");
		int s1 = sc.nextInt();
		int[] arr1 = new int[s1];
		System.out.print("Input Array 1 : ");
		for(int i=0; i<s1; i++){
		    arr1[i]= sc.nextInt();
		}
		System.out.print("Input Array 2 size : ");
		int s2 = sc.nextInt();
		
		int[] arr2 = new int[s2];
		System.out.print("Input Array 2 : ");
		for(int i=0; i<s2; i++){
		    arr2[i]= sc.nextInt();
		}
	    Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        	for(int i=0; i<arr1.length; i++){
            		int ele = arr1[i];
            		if(map1.containsKey(ele)){
                		int freq = map1.get(ele);
                		map1.put(ele, freq+1);
            		}
            		else
               	 		map1.put(ele, 1);
        }
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        	for(int i=0; i<arr2.length; i++){
            		int ele = arr2[i];
            		if(map2.containsKey(ele)){
                		int freq = map2.get(ele);
                		map2.put(ele, freq+1);
            		}
            		else
               	 		map2.put(ele, 1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }        
        for(int i : arr2){
            set.add(i);
        }
       	System.out.println("Intersection of arrays: ");
        for(Integer element : set){
            if(map1.containsKey(element)&& map2.containsKey(element)){
                int min = Math.min(map1.get(element), map2.get(element));
                while(min!=0){
                    System.out.print(element + " ");
                    min--;
                }
            }
        }
	}
}
