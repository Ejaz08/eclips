package constructor;

public class Pen 
{
		static String bodycol="white";
		static String lidcol="blue";
				double weight=0.15;
				double ballpoint=0.6;
				   
	static void brand()
	{
		System.out.println("Elkoys");
	}
	void pack()
	{
		System.out.println("six pieces");
	}
	public static void main(String[] args) 
	{
		System.out.println(Pen.bodycol);
		System.out.println(Pen.lidcol);
		Pen.brand();
		
		Pen p=new Pen();
		System.out.println(p.weight);
		System.out.println(p.ballpoint);
		p.pack();
		
				

	}
}
