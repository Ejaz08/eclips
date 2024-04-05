package vector;

import java.util.Vector;

public class A 
{
	public static void main(String[] args) 
	{
		Vector v= new Vector();
		
		v.add("ejaz");
		v.add("chiku");
		v.add(1);
		v.add(null);
		v.add('A');
		v.add(false);
		v.add(23.56);
		
		System.out.println(v);
	}
}
