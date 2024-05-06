package PraticePrograms;

public class Reversestring 
{
void meth1(String name)
{
	String name2="";
	
	for(int i=name.length()-1;i>=0;i--)
	{
		  name2=name2+name.charAt(i);
	}
	System.out.println(name2);
	
	
	if(name.equalsIgnoreCase(name2))
	{
		System.out.println("the string is palendrom");
	}
	else
	{
		System.out.println("it is not a palendrom");
	}
}
public static void main(String[] args) 
{
	new Reversestring().meth1("mom");
}
}
