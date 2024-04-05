package eg2;

public class Solution extends Empdetails
{

	public static void main(String[] args) 
	{
		Solution s=new Solution();
		System.out.println(s.getEmpid());
		System.out.println(s.getEmpname());
		System.out.println(s.getMobno());
		System.out.println(s.getEmpaccount());
		System.out.println();
		
		s.setEmpid(78765);
		s.setEmpname("Chiku");
		s.setMobno(77889090);
		s.setEmpaccount(6683);
		
		System.out.println(s.getEmpid());
		System.out.println(s.getEmpname());
		System.out.println(s.getMobno());
		System.out.println(s.getEmpaccount());
		
		
		
	}

}
