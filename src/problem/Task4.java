package problem;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a list of values and print the second element, second last element.
            Input – 10,45, 90,45, 23, 90, 44
            Output – 45,90

		 */
		List < Integer> list = new ArrayList <Integer> ();
		list.add(10);
		list.add(45);
		list.add(90);
		list.add(45);
		list.add(23);
		list.add(90);
		list.add(44);
		System.out.println(list);
		
		int size =list.size();
		int second_element = size - size +1 ;
		int second_last_element = size -2 ;
		
		System.out.println("Second last element of the list : "+list.get(second_last_element));
		
		System.out.println("Second element of the list : "+list.get(second_element));
	}

}
