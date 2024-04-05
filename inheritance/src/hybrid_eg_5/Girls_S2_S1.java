package hybrid_eg_5;

public class Girls_S2_S1 extends Sec1_S2
{
int girls=11;
	
	void show()
	{
		System.out.println("total no. of girls in std-2,sec-1");
	}
	public static void main(String[] args) {
		
		Girls_S2_S1 g= new Girls_S2_S1();
		
		System.out.println(g.std);
		g.school();
		
		System.out.println(g.sec);
		g.student2();
		
		System.out.println(g.no);
		g.display();
		
		System.out.println(g.girls);
		g.show();
}
}