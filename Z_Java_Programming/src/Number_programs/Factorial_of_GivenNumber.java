package Number_programs;

public class Factorial_of_GivenNumber {
	//wjp to find the factorial of a given number
	public static void main(String[] args) {
		
		int n=5,fact=1;
		
		for(int a=1;a<=n;a++) {
			fact=fact*a;
			System.out.print(a);
			
		}
		System.out.println();
		System.out.println(fact);
	}
	
}
