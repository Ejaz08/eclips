package hybrid_eg_4;

public class Honda extends Car
{
	int cost=600000;
	
	void display1()
	{
		System.out.println("cost of honda car");
	}
	public static void main(String[] args) {
		
		Honda h=new Honda();
		
		System.out.println(h.item1);
		System.out.println(h.item2);
		h.details();
		
		System.out.println(h.brand1);
		System.out.println(h.brand2);
		h.brand();
		
		System.out.println(h.cost);
		h.display1();
	}

}
