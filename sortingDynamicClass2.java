//SORTING DYNAMIC CLASS ARRAY. BASED OF NAME (with condition).

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rollno;
    @Override
    public int compareTo(Student s){
        if((this.name.compareTo(s.name))==0)
            return Integer.compare(this.rollno,s.rollno); 
        else
            return this.name.compareTo(s.name);
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
		Collections.sort(arr);
		System.out.println(arr);
	}
}
