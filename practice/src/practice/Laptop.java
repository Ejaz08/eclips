package practice;

public class Laptop implements Comparable<Laptop>
{
	String name;  double cost;  	int ram;
	
	Laptop(String name,double cost, int ram)
	{
		this.name=name;
		this.cost=cost;
		this.ram=ram;
	}
	
	public String toString()
	{
return "name is :"+name+" cost is :"+cost+" RAM is :"+ram;	
	}
	
/*	public int compareTo(Laptop l)
	{
		return this.name.compareTo(l.name);
	}*/
	public int compareTo(Laptop l)
	{
		return (int)(this.cost - l.cost);
	}
}
