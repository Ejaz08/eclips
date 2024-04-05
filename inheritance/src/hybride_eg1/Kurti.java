package hybride_eg1;

public class Kurti extends Fashion
{
	String kbrand="Samah";
	int MRP=1500;
	
	void clothing()
	{
		System.out.println("Women's Clothing");
	}
	void material()
	{
		System.out.println("Material:Blend cotton");
	}
	void size()
	{
		System.out.println("Size:small size to large size");
	}
	public static void main(String[] args) 
	{
		Kurti k=new Kurti();
		System.out.println(k.pname);
		System.out.println("Catagories:"+k.catagories);
		k.display();
		k.display("daily life style");
		
		System.out.println();
		
		System.out.println(k.first);
		System.out.println(k.fname);
		System.out.println("Types of clothing:"+k.types);
		k.type();
		k.type("Women's");
		
		System.out.println();
		
		System.out.println("Brand:"+k.kbrand);
		System.out.println("Rs-"+k.MRP+" MRP");
		k.clothing();
		k.material();
		k.size();
	}

}
