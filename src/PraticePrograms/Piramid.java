package PraticePrograms;

public class Piramid
{
 static void meth1()
{
	
	for(int i=0;i<=4;i++)
	{
		for( int j=4;j>0;j--)
		{
		 if(j>i)	
		 {
			 System.out.print(" ");
		 }
		 else
		 {
			 System.out.print(" *");
		 }
		}
		System.out.println();
		 
	}
	System.out.println();
}
public static void main(String[] args) 
{
	meth1();
}
}
