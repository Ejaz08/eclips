package array_list;

import java.util.ArrayList;

public class Players 
{
	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		
		l.add("virat");
		l.add("rohit");
		l.add("jadeja");
		l.add("dhoni");
		l.add("kl rahul");
		l.add("siraj");
		l.add("suman gill");
		l.add("surya");
		l.add("yubraj");
		l.add("sami");
		l.add("aswini");
				
		for(int a=0;a<=l.size()-1;a++)
		{
			System.out.println(l.get(a));
		}
		
		System.out.println("-------");
		
		for(int a=l.size()-1;a>=0;a--)
		{
			System.out.println(l.get(a));
		}
}
}
