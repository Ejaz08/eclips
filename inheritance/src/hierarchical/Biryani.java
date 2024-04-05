package hierarchical;

public class Biryani extends Shop1
{
	String bname="motton biryani";
	int a=250;
	void cost()
	{
		System.out.println("cost"+":"+a);
	}
	public static void main(String[] args) 
	{
		Biryani b=new Biryani();
		System.out.println(b.user);
		System.out.println(b.mob);
		b.login();
		b.userdetails();
		
		System.out.println();
		
		System.out.println(b.s1name);
		System.out.println(b.distance);
		b.details();
		b.location();
		
		System.out.println();
		
		System.out.println(b.bname);
		b.cost();
}
}