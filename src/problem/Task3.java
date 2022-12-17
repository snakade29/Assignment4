package problem;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * Write a program that will remove duplicate values from List
           Input – Java, TestNG, Maven, Java, 
           Output – Java, TestNG, Maven
        */
      List <String> list = new ArrayList <String> (); 
		
		list.add("Java");
		list.add("TestNG");
		list.add("Maven");
		list.add("Java");
		System.out.println(list);
		
	      Set<String> list1 = new LinkedHashSet<String>(list); 
	       System.out.println(list1);
	     
		
		
	}

}
