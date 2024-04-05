package hybride_eg2;

public class RunningGame extends Games
{
	String gname="Running games";
	double rating=4;
	
	void details()
	{
		System.out.println(gname+": Rating:"+rating);
	}
	void details(int type)
	{
		System.out.println("types:"+type);
	}
	public static void main(String[] args) 
	{
		RunningGame  r=new RunningGame();
		System.out.println("types:"+r.name);
		System.out.println(r.types);
		r.type();
		r.type(3);
		
		System.out.println();
		
		System.out.println(r.gname);
		System.out.println("rating:"+r.rating);
		r.details();
		r.details(2);

}
}