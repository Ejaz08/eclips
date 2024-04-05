package multi_level;

public class Wp1 extends Wp
{
	void status()
	{
		System.out.println("status");
	}
	
	public static void main(String[] args) 
	{
		Wp1 x=new Wp1();
		x.msg();
		x.status();
		
	}
}
