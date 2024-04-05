package hybride_eg2;

public class TempleRun extends RunningGame
{
	String name="Temple Run";
	String gtype="Game type is Running Game";
	
	void display()
	{
		System.out.println("most popular game:"+name);
	}
	void display(int run)
	{
		System.out.println("Can run upto "+run+"km");
	}
	public static void main(String[] args) 
	{
		TempleRun t=new TempleRun();
		System.out.println("types:"+t.name);
		System.out.println(t.types);
		t.type();
		t.type(3);
		
		System.out.println();
		
		System.out.println(t.gname);
		System.out.println("rating:"+t.rating);
		t.details();
		t.details(2);
		
		System.out.println();
		
		System.out.println(t.name);
		System.out.println(t.gtype);
		t.display();
		t.display(900000);
	}
}
