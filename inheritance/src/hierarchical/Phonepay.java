package hierarchical;

public class Phonepay extends Sbi
{
	String username="ejaz";
	int balance=10000;
	
	void display()
	{
		System.out.println("user details");
	}
	void delete()
	{
		System.out.println("delete the account");
	}
	public static void main(String[] args) 
	{
		Phonepay p=new Phonepay();
		System.out.println(p.money);
		System.out.println(p.mob);
		p.bankdetails();
		p.accept();
		
		System.out.println();
		
		System.out.println(p.bname);
		System.out.println(p.cash);
		p.bankdetails1();
		p.accept1();
		
		System.out.println();
		
		System.out.println(p.balance);
		System.out.println(p.username);
		p.display();
		p.delete();
		
	}
}
