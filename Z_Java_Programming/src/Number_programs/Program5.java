package Number_programs;

public class Program5 {
   //	wjp to get sum of digits in the given program
	public static void main(String[] args) {
		
		int sum =0;
		
		int n=123;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}

}
