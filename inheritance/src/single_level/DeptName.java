package single_level;

public class DeptName extends College
{
String dname="EEE Department";
	
	void project()
	{
		System.out.println("Advanced footsteps electric conservation");
	}
	public static void main(String[] args) 
	{
		DeptName D=new DeptName();
		
		System.out.println(D.uname);
		D.exam();
		
		System.out.println(D.cname);
		D.fest();
		
		System.out.println(D.dname);
		D.project();
		
		
		
	}

}
