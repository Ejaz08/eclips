package hybride_eg2;

public class RacingGame extends Games
{
	String gname="Racing games";
	double rating=4.2;
	
	void car(double likes)
	{
		System.out.println("Car "+gname+":likes:"+likes);
	}
	void bike(double comments)
	{
		System.out.println("Bike "+gname+":comments:"+comments);
	}
	public static void main(String[] args) 
	{
		RacingGame r=new RacingGame();
		System.out.println("types:"+r.name);
		System.out.println(r.types);
		r.type();
		r.type(3);
		
		System.out.println();
		
		System.out.println(r.gname);
		System.out.println("rating:"+r.rating);
		r.car(3344543);
		r.bike(200000);

}
}