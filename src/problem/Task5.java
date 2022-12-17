package problem;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /*
		 * Create a list which can accept another list as an element.
           List 1- 11,22,33
	    List 2-  9,19,29	
	    List 3-  7,17,27
  	Hint - ArrayList<ArrayList<Integer>> l1=new ArrayList<>(); 		
        */
		List <Integer> list = new ArrayList <Integer>() ;
		 
		list.add(11);
		list.add(22);
		list.add(33);
		
		List<Integer> list1 =new ArrayList <Integer>() ;
		list1.add(9);
		list1.add(19);
		list1.add(29);
		
		list.addAll(list1);
		List<Integer> list3 =new ArrayList <Integer>() ;
		
		list3.add(7);
		list3.add(22);
		list3.add(33);
		list.addAll(list3);
		
		System.out.print(list);
		
		 
 
		
	}
}


