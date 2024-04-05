package array_list;

import java.util.ArrayList;

public class A 
{
	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add("ejaz");
		l.add('E');
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(1);
		l.add(null);
		l.add('A');
		l.add(false);
		
		System.out.println(l);
		System.out.println(l.indexOf(30));
		System.out.println(l.lastIndexOf(30));
		System.out.println(l.get(5));
		System.out.println(l.size());
		System.out.println(l.remove(null));
		System.out.println("-----------------");
		
		//to get the all data we use for loop
		for(int a=0;a<=l.size()-1;a++)
		{
			System.out.println(l.get(a));
		}
		
	}
}
