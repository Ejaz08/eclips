package collection;

import java.util.ArrayList;

public class A 
{
public static void main(String[] args) 
{
	ArrayList l=new ArrayList();
	
	l.add("ejaz");
	l.add("chiku");
	l.add(1);
	l.add(null);
	l.add('A');
	l.remove(1);
	l.remove(0);
	
	System.out.println(l);
	
}
}
