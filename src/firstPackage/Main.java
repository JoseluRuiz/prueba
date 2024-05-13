package firstPackage;

public class Main 
{
	public static void main (String [] args) 
	{
		int num = 0;
		
		for (int i = 0; i < 50; i++) 
		{
			num += 3*i;
			num -= 3;
		}
		
		System.out.println("Number: "+num);
	}
}
