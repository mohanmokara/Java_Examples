package PraticePrograms;

import java.util.Scanner;

public class LoopingExamples 
{
	Scanner sc=new Scanner(System.in);
void meth1()
{
	System.out.println("enter ");
	for(int i=0;i<=10;i++)
	{
		System.out.print(i+ " ");
	}
	System.out.println();
	
	System.out.println("=======================");
	for(int i=10;i>=0;i--)
	{
		System.out.print(i+ " ");
	}
}
void meth2()
{
	for(int i=0;;i++)
	{
		System.out.println(i);
	}
	
	
}
void meth3()
{
	for(int i=20;i<=40;i++)
	{
		System.out.println(i);
	}
}
void meth4()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter multiplication table number");
	int n=sc.nextInt();
	for(int i=0;i<=10;i++)
	{
		System.out.println(n+"*"+i+"="+n*i);
	}
}
void meth5()
{
	System.out.println("even numbers between 20 to 40");
	int count=0;
	for(int i=20;i<=40;i++)
	{
		System.out.println(i);
		i++;
		count++;
	}
	System.out.println("count:"+count);

}
void meth6()
{
	int count=0;
	for( int i=5;i<=15;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
			count=count+i;
		}
	}
	System.out.println(count);
}
void meth7()
{
System.out.println("enter the nth number");
int num=sc.nextInt();
int count=0;
for(int i=0;i<=num;i++)
{
	System.out.println(i);
	count=count+i;
}
System.out.println("sum is:"+count);
}
void meth8()
{
	System.out.println("program to print the odd numbers");
	for(int i=40;i<=60;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
}
void meth9()
{
	System.out.println("to print the a to z alphabets");
	for(int i=65;i<91;i++)
	{
		System.out.print((char)i);
	}
	System.out.println();
	for(int i=97;i<123;i++)
	{
		System.out.print((char)i);
	}
	System.out.println();
	
}
void meth10()
{
	System.out.println("ASCII values");
	for(int i=0;i<=255;i++)
	{
		System.out.println((char)i);
	}
}

void meth11()
{
System.out.println("print even and odd numbers sum by n numbers");
int n=sc.nextInt();
int even=0;
 int odd=0;
for(int i=0;i<=n;i++)
{
	 if(i%2==0)
	 {
		  
		 even=even+i;
	 }
	 else
	 {
		  
		 odd=odd+i;
	 }
}
System.out.println("even numbers sum is:"+even);
System.out.println("odd numbers sum is:"+odd);
}
void meth12()
{
	System.out.println("find the sum of factorial to n number");
	System.out.println("enter the factorial number");
	int n=sc.nextInt();
	int factorial=1;
	for(int i=1;i<=n;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("factorial is :"+factorial);
}
void meth13()
{
	System.out.println("find factores of given number");
	System.out.println("enter the factor number");
	int num=sc.nextInt();
	 int count =0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			
			System.out.println(i + " " );
			count++;
		}
		 
	}
	System.out.println();
	System.out.println("count :"+count);
}
void meth14()
{
	System.out.println("find the prime number");
	int num=sc.nextInt();
	int count =0;
	for(int i=1;i<=num;i++)
	{
		 
		if(num%i==0)
		{
			count++;
			 
			System.out.println(i);
		}
	}
	 if(count==2)
	 {
		 System.out.println("yes it is a prime number");
	 }
	 else
	 {
		 System.out.println("no it not a prime number");
	 }
}
void meth15()
{
	System.out.println("sum of factores ");
	int num=sc.nextInt();
	 int count=0;
	for(int i=1;i<=num;i++)
	{
	 if(num%i==0)
	 {
		 System.out.println(i);
		 count =count+i;
	 }
	}
	System.out.println("sum is:"+count);
}
void meth16()
{;
		int num=sc.nextInt();
		 int count=0;
		for(int i=1;i<num;i++)
		{
		 if(num%i==0)
		 {
	
		System.out.println("sum of factores ");
			 System.out.println(i);
			 count =count+i;
		 }
		}
		System.out.println("sum is:"+count);
		if(count==num)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
}
void meth17()
{
	System.out.println("1 to 100 to find the numbers which are divisible by both 3 and 5");
	for(int i=1;i<=100;i++)
	{
		if(i%3==0 && i%5==0) 
		{
			System.out.println(i);
		}
	}
}
void meth18()
{
	System.out.println("to find the no of digits in a number");
	System.out.println("enter the number");
	int num=sc.nextInt();
	int digit=0;
	while(num!=0)
	{
		num=num/10;
		digit++;
	}
	System.out.println(digit);
}
void meth19()  
{
	System.out.println("program to count no of digits in the number");
	System.out.println("enter the number");
	int num=sc.nextInt();
	 int count=0;
	 while(num!=0)
	 {
		 num=num/10;
		 count++;
	 }
	 System.out.println(count);
}
void meth20()
{
	System.out.println("program to print digits last to fast");
	System.out.println("enter the number");
	int num=sc.nextInt();
	int remainder;
	int reverse=0;
	while(num!=0)
	{
		remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
	}
	System.out.println(reverse);
}
void meth21()
{
	System.out.println("program to print the double value of lastto frisst");
	System.out.println("enter number for double reverseing");
	int num=sc.nextInt();
	int reverse=0;
	int remainder;
	while(num!=0)
	{
		remainder=(num%10)+(num%10);
         System.out.print(remainder);
         num=num/10;

		
	}
	 System.out.println();
}
void meth22()
{
	System.out.println("program to print the squaring value of lastto frisst");
	System.out.println("enter number for squaring reverseing");
	int num=sc.nextInt();
	int reverse=0;
	int remainder;
	while(num!=0)
	{
		remainder=num%10;
		remainder=remainder *remainder;
         System.out.print(remainder);
         num=num/10;

		
	}
	 System.out.println();
	
}
void meth23()
{
	System.out.println("program to print sum of each digits");
	System.out.println("enter the number");
	int num=sc.nextInt();
	 int result=0;
	 int rem;
	 while(num!=0)
	 {
		 rem=num%10;
		 result=result+rem;
		 num=num/10;
	 }
	 System.out.println(result);
}
void meth24()
{
	System.out.println("program to print the  sum even digits ");
	int num=sc.nextInt();
	int result=0;
	 int lastdigit;
	while(num!=0)
	{
		lastdigit=num%10;
		
		if(lastdigit%2==0)
		{
			result=result+lastdigit;
		}
		num=num/10;
	}
	System.out.println(result);
}
void meth25()
{
	System.out.println("program to print the  sum odd digits ");
	int num=sc.nextInt();
	int result=0;
	 int lastdigit;
	while(num!=0)
	{
		lastdigit=num%10;
		
		if(lastdigit%2!=0)
		{
			result=result+lastdigit;
		}
		num=num/10;
	}
	System.out.println(result);
}
void meth26()
{
	System.out.println("to print given number is palendrom or not");
	System.out.println("enter the number");
	int num=sc.nextInt();
	int remainder;
	int num1=num;
	int reverse=0;
	while(num!=0)
	{
		remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
	}
	System.out.println(reverse);
	
	if(num1==reverse)
	{
		System.out.println("yes it is a palendrom");
	}
	else
	{
		System.out.println("no it is not a palendrom");
	}
}
void meth27()
{
	System.out.println("check the given number is armstrong or not");
	System.out.println("enter the number");
	int num=sc.nextInt();
	int rem;
	int arm=0;
	int num1=num;
	while(num!=0)
	{
		rem=num%10;
		
		arm=arm+rem*rem*rem;
		num=num/10;
		
	}
	System.out.println(arm);
	if(num1==arm)
	{
		System.out.println("it is a armstrong ");
	}
	else
	{
		System.out.println("it is not a armstrong");
	}
}
  void meth28()
{
	System.out.println("check the given number is strong or not ");
	System.out.println("enter the number");
	int num=sc.nextInt();
	int rem;
   
	int tot=0;
	int num1=num;
	while(num!=0)
	{ 
		int fac=1;
		rem=num%10;
		 
		for(int i=1;i<=rem;i++)
		{
		 fac=fac*i;
		}
		 
		tot=tot+fac;
		
		num=num/10;
	}
	System.out.println(tot);
	if(num1==tot)
	{
		System.out.println("it is a strong ");
	}
	else
	{
		System.out.println("it is not a strong");
	}
}
  void meth29() 
  {
	  System.out.println("to find the smallest digit in the given number");
	  System.out.println("enter the number");
	  int num=sc.nextInt();
	  int rem;
	  int small=num%10;
	  
	  
	  while(num!=0)
	  {
		  rem=num%10;
		  if(small>rem) 
		  {
			 small=rem; 
		  }
		  
		  num=num/10;
	  }
	  System.out.println(small);	  
  }
  void meth30()
  {
	  System.out.println("to find the largest digit in the given number");
	  System.out.println("enter the number ");
	  int num=sc.nextInt();
	  int rem;
	  int big=num%10;

	  while(num!=0)
	  {
		  rem=num%10;
		  if(num<rem)
			  big=rem;
		  num=num/10;  
	  }
	  System.out.println("big digit:"+big);
  }
  void meth31()
  {
	  System.out.println("to print the sum of frist and last digit in the given number");
	  System.out.println("enter the number");
	  long num=sc.nextLong();
	  long last=num%10;
	  long rem=0;
	  while(num!=0)
	  {
		  rem=num%10;
		  num=num/10;
	  }
	  System.out.println("first digit:"+rem);
	  System.out.println("last digit:"+last);
	  System.out.println("sum of frist and last digit:"+(rem+last));
  }
  //check the given number even or not until the user asking
  void meth32()
  {
	  System.out.println("enter the number");
	 long num=sc.nextLong();
	 if(num%2==0)
	 {
		 System.out.println("yes it is a even number");
	 }
	 else
	 {
		 System.out.println("it is an odd number");
	 }
	 System.out.println("to continue enter :0");
	 long num1=sc.nextLong();
	 if(num1==0)
	 {
		 this.meth32();
	 }
	  
  }
  // to find  given number prime or not until user asking
  void meth33()
  {
	  System.out.println("enter the number");
	  long num=sc.nextLong();
	  int count=0;
	  for(int i=1;i<=num;i++)
	  {
		  if(num%i==0)
		  {
			   
			  count++;
		  }
	  }
	   if(count==2)
	   {
		   System.out.println("yes it a prime number");
	   }
	   else
	   {
		   System.out.println("no!!! it is not a prime number");
	   }
	   System.out.println("to continue enter :0");
	   long num1=sc.nextLong();
	   if(num1==0)
	   {
		   this.meth33();
	   }
	    
	   
  }
  void meth34()
  {
	  System.out.println("find the factorial between 2 to 7");
	   
	   int fac=1;
	  for(int i=2;i<=7;i++)
	  {
	  for(int j=1;j<=i;j++)
	  {
		  fac=fac*j;
		  
	  }
	  System.out.println(fac);
	  }
	  
  }
  void meth35()
  {
	  System.out.println("to print the square and cubes  between 3 and 9");
	  int square;
	  int cube;
	  for(int i=3;i<=9;i++)
	  {
		  square=i*i;
		  System.out.println("suqare of "+i+ " is : " + square);
		  cube=i*i*i;
		  System.out.println("cube of   "+i+ " is : " + cube);
		  System.out.println("====================================");
	  }
  }
  void meth36()
  {
	  System.out.println("find the factors between 10 to 20");
	  
	  
	  for(int i=10;i<=20;i++)
	  {
		  for( int j=1;j<=i;j++)
		  {
			  if(i%j==0)
			  {
				  
				  System.out.print(j+" ");
				   
			  }
			  
		  }
		  System.out.println();
	  }
  }
  void meth37()
  {
	  System.out.println("find the factors count of each number from 5 to 25");
	  int count=0;
	  for(int i=5;i<=15;i++)
	  {
		  for( int j=1;j<=i;j++)
		  {
			  if(i%j==0)
			  {
				  count++;
				  System.out.print(j+" ");
				   
			  }
			  
		  }
		  System.out.println();
		  System.out.println(count);
	  }
  }
 void meth38()
 {
	 System.out.println("read 10 integers from the user and display their sum");
int sum=0;
     for(int  i=1;i<=10;i++)
     {
    	 System.out.println("enter the number");
    	 int num=sc.nextInt();
    	 sum=sum+num;
	}
     System.out.println(sum);
 }
 void meth39()
 {
	 System.out.println("find the sum of factors of each number from 10 to 30");
	 for(int i=10;i<=30;i++)
	 {
		 int sum=0;
		 for(int j=1;j<=i;j++)
		 {
			 
			 if(i%j==0)
			 {
				  sum=sum+j;
			 }
		 }
		 System.out.println("sum of factors of :"+i+"=  "+sum);
	 }
	  
	 
 }
 void meth40()
 {
	 System.out.println("program to print prime numbers from 10 to 50");
	 for(int i=10;i<=50;i++)
	 {
		 int count=0;
		 for(int j=1;j<=i;j++)
		 {
			 
			 if(i%j==0)
			 {
				 count++;  
			 }
			  
		 }
		 if(count==2)
		 {
			 System.out.println("yes it is prime no:"+i);
		 }
		  
		 
	 }
 }
 void meth41()
 {
	 System.out.println("program to print the perfect numbers between 1 to 1000");
	 for(int i=1;i<=1000;i++)
	 {
		 int sum=0;
		 for(int j=1;j<i;j++)
		 {
			 
			 if(i%j==0)
			 {
				  sum=sum+j;
			 }
		 }
		 
		 if(sum==i) 
		 {
			 System.out.println(i);
		 }
	 }
 }
 void meth42()//to find 145
 {
	 System.out.println("print strong numbers from 1 to 50");
	 for(int i=1;i<=50;i++)
	 {
		 int fac=1;
		 for(int j=1;j<=i;j++)
          {
				 fac=fac*j;
	       }
		  if(fac==i)
		  {
			  System.out.println(i);
		  }
	 }
 }
 void meth43()
 {
	 System.out.println("read  5 numbers from the user and display average of numbers");
	 int sum=0;
	 System.out.println("enter 5 numbers");
	 for(int i=1;i<=5;i++)
	 {
		 int x=sc.nextInt();
		 sum =sum+x;
	 }
	 System.out.println(sum);
 }
 void meth44()
 {
	 System.out.println("read 5 integers from the user and find biggest and smallest number among them");
	 System.out.println("enter 5 numbers");
	 int y=sc.nextInt();
	 int small=y;
	  
	 for(int i=2;i<=5;i++)
	 {
		 int x=sc.nextInt();
		 if(small>x)
		 {
			 small=x;
		 }
		  
		  
		 
	 }
	 System.out.println(small);
	 
 }
 void meth45()
 {
	 System.out.println("read 5 integers from the user and check any negative number entered by the user or not");
	 System.out.println("enter the 5 numbers");
	 for(int i=1;i<=5;i++)
	 {
		 int x=sc.nextInt();
		 if(x<0)
		 {
			 System.out.println("it is negitive number");
		 }
	 }
 }
public static void main(String[] args) 
{
	
	 LoopingExamples dj=new LoopingExamples();
	// dj.meth1();
    // dj.meth2();
	//dj.meth3();
	//dj.meth4();
	//dj.meth5();
	//dj.meth6();
	//dj. meth7();
	//dj.meth8();
	//dj.meth9();
	// dj.meth10();
	// dj.meth11();
	// dj.meth12();
	// dj.meth13();
	//dj.meth14();
	// dj.meth15();
	//dj.meth16();
	//dj.meth17();
	// dj.meth18();
	//dj.meth19();
	//dj.meth20();
	// dj.meth21();
	//dj.meth22();
	// dj.meth23();
	//dj.meth24();
	// dj.meth25();
	// dj.meth26();
	//dj.meth27();
	 //dj.meth28();
	//dj.meth29();
	// dj.meth30();
	// dj.meth31();
	//dj.meth32();
	 //dj.meth33();
	 //dj.meth34();
	 //dj.meth35();
	 //dj.meth36();
	 //dj.meth37();
	//dj.meth38();
	 //dj.meth39();
	 //dj.meth40();
	 //dj.meth41();
	 //dj.meth42();
	 //dj.meth43();
	 //dj.meth44();
	 dj.meth45();
}
}
