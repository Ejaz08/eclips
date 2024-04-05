package string_eg;

public class A 
{
	public static void main(String[] args)
	{
		String a="Let Us Play Cricket";
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println();
		System.out.println(a.startsWith("Let"));
		System.out.println(a.endsWith("t"));
		System.out.println(a.contains("Play"));
		System.out.println();
		System.out.println(a.concat(" On Wednesday"));
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf("P"));
		System.out.println(a.lastIndexOf("e"));
		System.out.println();
		System.out.println(a.substring(5));
		System.out.println(a.substring(3,12));
	}
}
