package practice;
import java.util.TreeSet;
public class Lsolution 
{
public static void main(String[] args) 
{
	Laptop l1=new Laptop("hp",80000,4);
	Laptop l2=new Laptop("hp",80000,4);
	Laptop l3=new Laptop("hp",80000,4);
	
	TreeSet<Laptop>t1= new TreeSet();
	t1.add(l1);
	t1.add(l2);
	t1.add(l3);
	for(Laptop o:t1)
	{
		System.out.println(o);
	}
	
}
}
