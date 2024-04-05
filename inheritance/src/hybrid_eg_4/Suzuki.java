package hybrid_eg_4;

public class Suzuki extends bike
{
	int cost=200000;
	
	void display2()
	{
		System.out.println("cost of suzuki");
	}
	public static void main(String[] args) {
		
		Suzuki s=new Suzuki();
		
		System.out.println(s.item1);
		System.out.println(s.item2);
		s.details();
		
		System.out.println(s.brand1);
		System.out.println(s.brand2);
		s.display();
		
		System.out.println(s.cost);
		s.display2();
	}
}
