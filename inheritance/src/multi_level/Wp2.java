package multi_level;

public class Wp2 extends Wp1
{
	void call()
	{
		System.out.println("call");
	}
	public static void main(String[] args) 
	{
		Wp2 y=new Wp2 ();
		y.msg();
		y.status();
		y.call();
	}
}
