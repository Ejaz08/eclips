package hierarchical;

public class Noodles extends Shop2
{
	String nname="chicken noodles";
	int a=150;
	void cost()
	{
		System.out.println("cost"+":"+a);
	}
	public static void main(String[] args) 
	{
		Noodles n=new Noodles();
		System.out.println(n.user);
		System.out.println(n.mob);
		n.login();
		n.userdetails();
		
		System.out.println();
		
		System.out.println(n.s2name);
		System.out.println(n.distance);
		n.details();
		n.location();
		
		System.out.println();
		
		System.out.println(n.nname);
		n.cost();
}
}