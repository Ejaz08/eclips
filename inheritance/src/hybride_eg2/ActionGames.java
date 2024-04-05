package hybride_eg2;

public class ActionGames extends Games
{
	String gname="Action games";
	double rating=4.2;
	
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
		ActionGames a=new ActionGames();
		System.out.println("types:"+a.name);
		System.out.println(a.types);
		a.type();
		a.type(3);
		
		System.out.println();
		
		System.out.println(a.gname);
		System.out.println("rating:"+a.rating);
		a.details();
		a.details(2);
		
	}
}
