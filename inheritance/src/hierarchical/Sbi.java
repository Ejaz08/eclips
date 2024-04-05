package hierarchical;

public class Sbi extends Bank
{
	String bname="SBI";
	int cash=500000;
	
	void bankdetails1() 
	{
		System.out.println("Atleast 2 accounr per user");
	}
	void accept1()
	{
		System.out.println("both gpay and phonepay");
	}
	public static void main(String[] args) 
	{
		Sbi s=new Sbi();
		System.out.println(s.money);
		System.out.println(s.mob);
		s.bankdetails();
		s.accept();
		
		System.out.println();
		
		System.out.println(s.bname);
		System.out.println(s.cash);
		s.bankdetails1();
		s.accept1();
		
		
	}
}
