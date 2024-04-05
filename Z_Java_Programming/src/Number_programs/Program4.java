package Number_programs;

public class Program4 {
	//wjp to count digits in a given number
	public static void main(String[] args) {
		
		int count=0;
		int n=10345;
		while (n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
