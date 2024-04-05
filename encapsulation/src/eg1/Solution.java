
package eg1;

public class Solution extends Gmail
{
	public static void main(String[] args) 
	{
		Solution s=new Solution();
		System.out.println(s.get());
		System.out.println(s.get1());
		
		s.set("grgrh",122);
		System.out.println(s.get());
		System.out.println(s.get1());
	}
}
//create a classname empdetails and have four variables empid,empname,mobno,empacct