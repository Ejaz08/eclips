package hybrid_eg_5;

public class Boys_S2_S1 extends Sec1_S2
{

	int boy=19;
	
	void show()
	{
		System.out.println("total no. of boys in std-2,sec-1");
	}
	public static void main(String[] args) {
		
		Boys_S2_S1 s= new Boys_S2_S1();
		
		System.out.println(s.std);
		s.school();
		
		System.out.println(s.sec);
		s.student2();
		
		System.out.println(s.no);
		s.display();
		
		System.out.println(s.boy);
		s.show();
	}
}
