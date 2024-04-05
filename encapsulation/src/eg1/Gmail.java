package eg1;

public class Gmail 
{
 private String username="ejazkhn07@gmail.com";
 private int password=12345;
 
 public void set(String username,int password)
 {
	 this.username=username;
	 this.password=password;
 }
 public String get()
 {
     return username;
 }
 public int get1()
 {
	 return password;
 }
 
}
