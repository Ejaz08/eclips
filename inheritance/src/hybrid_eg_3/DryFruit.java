package hybrid_eg_3;

public class DryFruit extends Catagories
{
	String fruits="Dry fruits";
	
	void quality()
	{
		System.out.println("good quality");
	}
	public static void main(String[] args) {
		
	DryFruit df=new DryFruit();
	
	System.out.println(df.store);
	df.catagories();
	System.out.println(df.name);
	df.items();
	System.out.println(df.fruits);
	df.quality();
		
	}
}
