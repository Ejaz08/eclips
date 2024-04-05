package array_list;

import java.util.ArrayList;

public class Details 
{
	public static void main(String[] args)
 
	{
		ArrayList l=new ArrayList();
		
		l.add("Name-Ejaz Ahmed Khan");
		l.add("College-GITA Autonomous College");
		l.add("Roll no-19008");
		l.add("Regd no-1901287384");
		l.add("pass out-2023");
		l.add(83.3);
		
		
		for(int a=0;a<=l.size()-1;a++)
		{
			System.out.println(l.get(a));
		}
		
		System.out.println("reverse result--------------");
		
		for(int a=l.size()-1;a>=0;a--)
		{
			System.out.println(l.get(a));
		}
	}
}

