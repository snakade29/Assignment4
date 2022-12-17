package problem;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*
		 *  Write a program which will accept List of String and produce another
		 *  List of string of which will have only values which starts with git
		 *  Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
            Output- Git, Github, Gitlab, GitBash
             */
		List <String> list = new ArrayList <String> (); 
		
		list.add("Git");
		list.add("Github");
		list.add("GitBash");
		list.add("Selenium");
		list.add("Java");
		list.add("Maven");
		System.out.println(list);
		List <String> list1 = new ArrayList <String> (); 
		for(int i=0 ;i < list.size(); i++ )
		{
		 
			if(  list.get(i).contains("Git")) 
			{
				 
				list1.add(list.get(i));
			}
			
		}
		
		System.out.println(list1);
		
		
	}

}
