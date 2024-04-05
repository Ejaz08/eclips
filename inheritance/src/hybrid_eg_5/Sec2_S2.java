package hybrid_eg_5;

public class Sec2_S2 extends Std2
{
int no=35;
	
	void display2()
	{
		System.out.println("no of students in std-2,sec2");
	}
	public static void main(String[] args) {
		
		Sec2_S2 s2=new Sec2_S2();
		
		System.out.println(s2.std);
		s2.school();
		
		System.out.println(s2.sec);
		s2.student2();
		
		System.out.println(s2.no);
		s2.display2();
}
}
