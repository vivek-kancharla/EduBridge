//program to implement withargument constructor
package withargument;
import java.util.*;

public class withargument {
	//Declering Member variable of string type
	String string;
	//Constructor with argument
	public withargument(String str)
	{
		System.out.println("User Entered this string :"+str);
	}
	//Constructor with no argument
	public withargument()
	{
		string="Welcome to java programming";
	}
	void display()
	{
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		//TODO Auto generated method stub
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//Creating object and passing no argument
		withargument ref = new withargument();
		//Calling display method using ref object
		ref.display();
	}
}
