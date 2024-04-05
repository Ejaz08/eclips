package hierarchical;

public class Roll extends Shop4
{
	String rname="motton roll";
	int a=350;
	void cost()
	{
		System.out.println("cost"+":"+a);
	}
	public static void main(String[] args) 
	{
		Roll r=new Roll();
		System.out.println(r.user);
		System.out.println(r.mob);
		r.login();
		r.userdetails();
		
		System.out.println();
		
		System.out.println(r.s4name);
		System.out.println(r.distance);
		r.details();
		r.location();
		
		System.out.println();
		
		System.out.println(r.rname);
		r.cost();
}
}