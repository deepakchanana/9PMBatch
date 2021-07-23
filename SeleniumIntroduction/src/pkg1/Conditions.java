package pkg1;



public class Conditions
{
	
public static void main(String[] args) 
{
	for(int i=1;i<=5;i++)  // i---3
	{
		for(int j=1;j<=i;j++) // j will exe from 1 to 3
		{
			System.out.print("*"); // 3 star in same row
		}
		System.out.println(); // it will move to next line
	}
  
}
}
