package hybrid_eg_4;

public class Bmw extends bike
{
	int rs=4567799;
	
	void display1()
	{
		System.out.println("cost of BMW");
	}
	
	public static void main(String[] args) {
		
		Bmw b=new Bmw();
		
		System.out.println(b.item1);
		System.out.println(b.item2);
		b.details();
		
		System.out.println(b.brand1);
		System.out.println(b.brand2);
		b.display();
		
		System.out.println(b.rs);
		b.display1();
	}
}
