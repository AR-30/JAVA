//SORTING CLASS ARRAY OF DYNAMIC SIZE (On the bases of rollno).

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rollno;
    @Override
    public int compareTo(Student s){
        return Integer.compare(s.rollno,this.rollno); // change order & dynamic size array
        
    }
    @Override
    public String toString(){
        return this.name + " " + this.rollno;
    }
}
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
		int size = sc.nextInt();
		ArrayList<Student> arr = new ArrayList<>();
		sc.nextLine();
		for(int i=0; i<size; i++){
		    arr.add(new Student());
		    arr.get(i).name=sc.nextLine();
		    arr.get(i).rollno=sc.nextInt();
		    sc.nextLine();
		}
	//	System.out.println(arr.get(0).compareTo(arr.get(1)));
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
	}
}
