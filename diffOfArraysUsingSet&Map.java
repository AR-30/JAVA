//DIFFERENCE OF ARRAYS USING SET AND MAP

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Array A size : ");
		int s1 = sc.nextInt();
		int[] arr1 = new int[s1];
		System.out.print("Input A : ");
		for(int i=0; i<s1; i++){
		    arr1[i]= sc.nextInt();
		}
		System.out.print("Input Array B size : ");
		int s2 = sc.nextInt();
		
		int[] arr2 = new int[s2];
		System.out.print("Input B : ");
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
        Set<Integer> setA = new HashSet<>();
        for(int i : arr1){
            setA.add(i);
        }        
       	System.out.print("Difference of A-B: ");
        for(Integer element : setA){
            int count=map1.get(element);
            if(map2.containsKey(element)){
                count = map1.get(element) - map2.get(element);
                if(count>0){
                    System.out.print(element + " ");
                    count--;
                }
            }
            else{
                while(count!=0){
                    System.out.print(element + " ");
                    count--;
                }
            }
        }
        Set<Integer> setB = new HashSet<>();
        for(int i : arr2){
            setB.add(i);
        } 
        System.out.print("\nDifference of B-A: ");
        for(Integer element : setB){
            int count=map2.get(element);
            if(map1.containsKey(element)){
                count = map2.get(element) - map1.get(element);
                if(count>0){
                    System.out.print(element + " ");
                    count--;
                }
            }
            else{
                while(count!=0){
                    System.out.print(element + " ");
                    count--;
                }
            }
        }
	}
}
