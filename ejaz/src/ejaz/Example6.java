package ejaz;

public class Example6 {

	public static void main(String[] args) 
{
		/*int a=10;
		int b=11;
		int c= ++a + ++b + ++a + ++b;     //pre-increment
		   //increse(++) the value by 1 of a     10+1=11 
		  // increse(++) the value by 1 of b     11+1=12
	   	 //  increse(++) the value by 1 of a     11+1=12
	    //   increse(++) the value by 1 of b     12+1=13
        System.out.println(c); */
        
       int d=10;      //post-increment
        int e=d++ + d++ + d++;      //10+11+12
         //the value of the result same in the next.
        System.out.println(e);
        System.out.println(d);
     //   int f=10;
   //     int g=11;
   //     int h=++f + ++g + f++ + g++;      
         //  pre increment           10+1=11
        //   pre increment           11+1=12
       // remain same as result of a i.e. 11
      //  remain same as result of a i.e. 12
   //     System.out.println(h);
      /*  int i=10;
        int j=11;
        
        int k=++i + ++j + i++ + j++ ;
       
        
        System.out.println(k);*/
}   
}
