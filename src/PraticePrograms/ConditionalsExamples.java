
package PraticePrograms;

import java.util.Scanner;

public class ConditionalsExamples 
{
	Scanner sc=new Scanner(System.in);
	
//check whether the number is positive or not
void meth1(int a)
{
	if(a>0)
	{
		System.out.println(a+" is positive number");
	}
	else
	{
		System.out.println(a+" is negitive number");
	}
}

//check the person is eligible to vote or not
void meth2(int age)
{
	if(age>=18)
	{
		System.out.println("person is eligibule to vote");
	}
	else
	{
		System.out.println("person is not eligibule to vote");
	}
}

//check the given number is even or not
void meth3(int x)
{
	if(x%2==0)
	{
		System.out.println(x+" is even number");
	}
	else
	{
		System.out.println(x+" is a odd number");
	}
}

//check the given number is divisible 3 or not
void meth4(int a)
{
	if(a%3==0)
	{
		System.out.println(a+" is divigibule by 3");
	}
	else
	{
		System.out.println(a+"  is not divigibule by 3");
	}
}

//check the given number  is divisible by 3 and 5
void meth5(int a)
{
	if(a%3==0 && a%5==0 )
	{
		System.out.println(a+" is divigibule by 5 and 3");
	}
	else
	{
		System.out.println(a+" is not divigibule by both 3 and 5");
	}
}

//Find the grater number in these two numbers
void meth6(int a ,int b)
{
	if(a>b)
	{
		System.out.println(a+" is grater than "+b);
	}
	else
	{
		System.out.println(b+" is grater than "+a);
	}
}

//check the given letter is vowel or not
void meth7(char cha)
{
	switch(cha)
	{
		case 'a':
			System.out.println("it is an vowel");
			break;
		case 'e':
			System.out.println("it is an vowel");
			break;
		case 'i':
			System.out.println("it is an vowel");
			break;
		case 'o':
			System.out.println("it is an vowel");
			break;
		case 'u':
			System.out.println("it is an vowel");
			break;
			default :
				System.out.println("it is not an vowel");	
	}
	
}
//check the given number is in UpperCase or not
void meth8(char x)
{
	if( x>=65 &&  x<91)
	{
		System.out.println(x+" is in upper case");
	}
	else
	{
		System.out.println(x+" is in lower case");
	}
}
//check the given letter is digit or not
void meth9(int a)
{
	if(a>=0 &&  a<=9)
	{
		System.out.println(a+" is a digit  ");
	}
	else
	{
		System.out.println((char)a+" is a alphabet");
	}
}

//checks the given letter is alphabet or number
void meth10(int x)
{
	if((x>=65 &&  x<91) ||(x>=97 && x<=123) )
	{
		System.out.println((char)x+" is a alphabet");
	}
	else
	{
		System.out.println(x+ " it  is a number");
	}
}
//
void meth11()
{
	 
	int a=5000;
	System.out.println("enter the withdraw amount ");
	int x= sc.nextInt();
	if(x<=a)
	{
		System.out.println(x+" amount is sucessfully withdrawn");
		int finalamount=a-x;
		System.out.println("remaining amount is "+ finalamount  );
	}
	else
	{
		System.out.println("you have unsufficent balence");
	}
}

//checks the name and password
void meth12() 
{
	System.out.println("checking the login details");
	System.out.println("enter user name ");
	String name =sc.next();
	System.out.println("enter password");
	int pas=sc.nextInt();
	
	if(name.equals("triveni") && pas==12345 )
	{
		System.out.println("log in sucessful");
	}
	else
	{
		System.out.println("invalid username or password");
	}
	
}
void meth13(int a)
{
	if(a>30 && a<50)
	{
		System.out.println(a+" is between 30 and 50");
	}
	else
	{
		System.out.println(a+" is not between 30 and 50");
	}
}
void meth14(int b)
{
	if(b>=35 && b<=100)
	{
		System.out.println("congrates!!! you passed the exam");
	}
	else
	{
		System.out.println("you are failed the exam ");
	}
}
void meth15(int year)
{
	if(year%4==0)
	{
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("yes!! it  is leap year");
			}
			else
			{
				System.out.println("it is not a leap year");
			}
		}
		else
		{
			System.out.println("it is a leap year");
		}
		 
	}
	else
	{
		System.out.println("it is not a leap year");
	}
	 
}
void meth15Copy(int year)
{
	if((year%4==0 && year%100!=0)||(year%400==0))
	{
		System.out.println("it is a leap year");
	}
	else
	{
		System.out.println("it is not a leap year");
	}
}
void meth16(int x,int y,int z)
{
	if(x>y && x>z)
	{
		System.out.println(x+" is bigger than :"+ y+","+z);
	}
	else if(y>z && y>z)
	{
		System.out.println(y+" is bigger than :"+ x+","+z);
	}
	else
	{
		System.out.println(z+" is bigger than :"+ y+","+x);
	}
}
void meth17(int a ,int b,int c,int d)
{
if(a>b)
{
	if(a>c)
	{
		if(a>d)
		{
			System.out.println(a+"is bigger");
		}
	}
}
else
{
	if(b>c)
	{
		if(b>d)
		{
			System.out.println(b+" is bigger");
		}
	}
	else
	{
		if(c>d)
		{
			System.out.println(c+" is bigger");
		}
		else
		{
			System.out.println(d+" is bigger");
		}
	}
}

}
void meth18(int angle1 ,int angle2,int angle3)
{
	int sum=angle1+angle2+angle3;
	//if 
	if(sum==180)
	{
		System.out.println("it is a triangle");
	}
	else
	{
		System.out.println("it is not triangle");
	}
}
void meth19()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter cost price");
	int cp=sc.nextInt();//cp=selling price
	System.out.println("enter selling price");
	int sp=sc.nextInt();//sp=cost price
	int profit=sp-cp;
	
	if(profit>0)
	{
		System.out.println("you gained profit.profit amount is "+profit);
	}
	else
	{
		System.out.println("you had loss.loss amount is "+ -(profit));
	}
}
void meth20( int a)
{
	if(a>=0 &&  a<=9)
	{
		System.out.println(a+" is a digit  ");
	}
	else if((a>=65 &&  a<91) ||(a>=97 && a<=123) )
	{
		System.out.println((char)a+" is a alphabet");
	}
	else
	{
		System.out.println((char)a+" is a symbol");
	}
	 

}
void meth21()
{
	System.out.println("enter the no of sides");
	int n=sc.nextInt();
	 switch(n)
	 {
	 case 3:
		 System.out.println("it is a triangle");
		 break;
	 case 4:
		 System.out.println("it is a rectangle");
		 break;
	 case 5:
		 System.out.println("it is a pentagon");
		 break;
		 default:
			 System.out.println("invalid input");
	 
	 }
	 
	 
}
void meth22()
{
	System.out.println("enter year");
	int year=sc.nextInt();
	System.out.println("enter month what you want");
	String name=sc.next();
	 
	
	if(name=="jan" || name=="mar" || name=="may" || name=="jul" || name=="aug" || name=="oct" || name=="sep")
	{
		System.out.println(name+ " this month contains 31 days");
	}
	else if(name=="apr" || name=="jun" || name=="sep" || name=="nov")
	{
		System.out.println(name+" this month contains 30 days");
	}
	else
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("yes!! it  is leap year");
					System.out.println( name+" this month contains 29 days");
				}
				else
				{
					System.out.println("it is not a leap year");
					System.out.println(name+" this month contains 28 days");
				}
			}
			else
			{
				System.out.println("it is a leap year");
				System.out.println(name+" this month contains 29 days");
			}
			 
		}
		else
		{
			System.out.println("it is not a leap year");
			System.out.println(name+" this month contains 28 days");
		}
	}
}
void meth23()
{
	System.out.println("enter the student marks");
	int marks1=sc.nextInt();
	int marks2=sc.nextInt();
	int marks3=sc.nextInt();
	
	int  smarks=marks1+marks2+marks3;
	float percent=(float)smarks/300*100;
	System.out.println("total marks "+smarks);
	System.out.println("percent "+percent);
	int average=(marks1+marks2+marks3)/3;
	System.out.println("average "+average);
	
	if(marks1>=50 && marks2>=50 && marks3>=50)
	{
		if(average>=40 && average<50)
		{
			System.out.println("your grade is C");
		}
		else if(average>=50 && average<60)
		{
			System.out.println("your grade is B");
		}
		else 
		{
			System.out.println("your grade is A");
		}
	}
	
}
void meth24()
{
	System.out.println("enter your gender ");
	String gender=sc.next();
	System.out.println("enter your age ");
	int age=sc.nextInt();
	System.out.println("enter your weight");
	int weight=sc.nextInt();
	if(gender.equals("male") )
	{
		if(age>20 && age<50)
		{
			if(weight>50)
			{
				System.out.println("you are eligibule to donate blood");
			}
			else
			{
				System.out.println("you are not eligibule to donate blood ");
			}
		}
		else
		{
			System.out.println("you are not eligibule to donate blood ");
		}
	}
	else
	{
		System.out.println("you are not eligibule to donate blood ");
	}
}
void meth25()
{
	System.out.println("enter the number ");
	int num=sc.nextInt();
	if(num%3==0 && num%5==0)
	{
		System.out.println("it is divisible by both 3 and 5");
	}
	else if(num%3==0)
	{
		System.out.println("it is divisible by 3 but not 5");
	}
	else
	{
		System.out.println("it is divisible by 5 but not 3");
	}
	
}
public static void main(String[] args) 
{
	//new ClassA().meth1(-22);
	//new ClassA().meth2(-22);
	//new ClassA().meth3(-23);
	//new ClassA().meth4(99);
	//new ClassA().meth5(45);
	//new ClassA().meth6(2, 13);
	//new ClassA().meth7('a');
	//new ClassA().meth8('Z');
	//new ClassA().meth9('a');
	//new ClassA().meth10('A');
	//new ClassA().meth11();
	//new ClassA().meth12();
	//new ClassA().meth13(40);
	//new ClassA().meth14(20);
	new ConditionalsExamples().meth15(2016);
	new ConditionalsExamples().meth15Copy(2016);
	//new ClassA().meth16(10, 90, 300);
	//new ClassA().meth17(2, 90, 67, 1);
	//new ClassA().meth18(70, 70, 40);
	//new ClassA().meth19();
	//new ClassA().meth20(2);
	//new ClassA().meth21();
	//new ClassA().meth22();
	//new ClassA().meth23();
	//new ClassA().meth24();
	//new ClassA().meth25();
}
}

