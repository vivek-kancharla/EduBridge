package average;

public class mainclass {
	
	public static double avg(double a,double b,double c)
	{
		double result=(a+b+c)/3;
		return result;
	}
	public static void main(String[] args) {
		
		double c=avg(32,76,85);
		System.out.println("Average of Three numbers is"+c);
	}

}
