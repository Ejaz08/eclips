package hybrid_eg_4;

public class Jaguar extends Car
{
int cost=900000;
	
	void display2()
	{
		System.out.println("cost of honda car");
	}
	public static void main(String[] args) {
		
		Jaguar j=new Jaguar();
		
		System.out.println(j.item1);
		System.out.println(j.item2);
		j.details();
		
		System.out.println(j.brand1);
		System.out.println(j.brand2);
		j.brand();
		
		System.out.println(j.cost);
		j.display2();
}
}
