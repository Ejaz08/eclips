package hybrid_eg_5;

public class Sec1 extends Std1
{
	int no=30;
	
	void display()
	{
		System.out.println("no of students in sec1");
	}
	public static void main(String[] args) {
		
		Sec1 s=new Sec1();
		
		System.out.println(s.std);
		s.school();
		
		System.out.println(s.sec);
		s.student1();
		
		System.out.println(s.no);
		s.display();
	}
}
