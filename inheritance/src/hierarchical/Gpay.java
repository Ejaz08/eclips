package hierarchical;

public class Gpay extends Sbi
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
		Gpay g=new Gpay();
		System.out.println(g.money);
		System.out.println(g.mob);
		g.bankdetails();
		g.accept();
		
		System.out.println();
		
		System.out.println(g.bname);
		System.out.println(g.cash);
		g.bankdetails1();
		g.accept1();
		
		System.out.println();
		
		System.out.println(g.balance);
		System.out.println(g.username);
		g.display();
		g.delete();
}
}