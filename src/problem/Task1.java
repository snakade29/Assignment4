package problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
	//Create a list of String and print the values in reverse order
		//Input – Java, Selenium, TestNG, Git, Github
			//Output- Github, Git, TestNG, Selenium, Java
		
		
		List <String> list = new ArrayList<String>();
       
       list.add("Java");
       list.add("Selenium");
       list.add("TestNG");
       list.add("Git");
       list.add("Github");
       
       System.out.println(list);
     
 
       
       System.out.println(""+ list.size() );
       System.out.println(""+ list.get(4) );
       
       
       Collections.reverse(list);
      
      System.out.println(list);
       
	}

}
