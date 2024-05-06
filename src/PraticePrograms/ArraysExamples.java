package PraticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples
{
	Scanner sc=new Scanner(System.in);
	int arr[]= {1,2,3,4,5};
	int arr1[]=new int[]{10,20,30,40,50};
	int arr2[]=new int [5];
void meth1()
{
	int arr[]= {1,2,3,4,5};
	System.out.println("program to find length of an array");
	System.out.println(arr.length);
}
void meth2()
{
	System.out.println("program to display the first and last elements");
	int arr[]= {1,2,3,4,5};
	System.out.println(arr[0]);
	System.out.println(arr[arr.length-1]);
}
void meth3()
{
	System.out.println("program to find sum of frist and last elements");
	int arr[]= {1,2,3,4,5};
	System.out.println(arr[0]+arr[arr.length-1]);
}
void meth4()
{
	System.out.println("program to swape the frist and last elements");
	int arr[]= {1,2,3,4,5};
	 int x=arr[0];
	  arr[0]=arr[arr.length-1];
	  arr[arr.length-1]=x;
	 
	 System.out.println(Arrays.toString(arr));
}
void meth5()
{
	System.out.println("display all elements of an arr");
	int arr[]= {1,2,3,4,5};
	System.out.println(Arrays.toString(arr));
}
void meth6()
{
	System.out.println("program to print default values of an array");
	double arr[]=new double [5];
	System.out.println(Arrays.toString(arr));
}
void meth7()
{
	System.out.println("display the elements using for loop");
	int arr[]= {11,22,33,44,55};
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
}
void meth8()
{
	System.out.println("program to display the sum of all elements in an arr using for loop");
	int sum=0;
	int arr[]= {11,22,33,44,55};
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
}
void meth9()
{
	System.out.println("program to display the array elements in reverse order");
	int arr[]= {11,22,33,44,55};
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}
void meth10()
{
	System.out.println("program to display even numbers in an array using for each loop ");
	int arr[]= {11,22,33,44,55};
	for(int x:arr)
	{
		 if(x%2==0)
		 {
			 System.out.println(x);
		 }
	}
}
void meth11()
{
	System.out.println("program to display odd numbers in an array using for each");
	int arr[]= {11,22,33,44,55};
	for(int x:arr)
	{
		if(x%2!=0)
		{
			System.out.println(x);
		}
	}
}
void meth12()
{
	System.out.println("program to calculate the average of array elements");
	int arr[]= {11,22,33,44,55};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	float average=sum/arr.length;
	System.out.println(average);
}
void meth13()
{
	System.out.println("program to find sum of even elements in arr using for each");
	int arr[]= {11,22,33,44,55};
	int sum=0;
	for(int x:arr)
	{
		if(x%2==0)
		{
			sum=sum+x;
		}
	}
	System.out.println(sum);
}
void meth14()
{
	System.out.println("program to find sum of odd elements in arr using for each");
	int arr[]= {11,22,33,44,55};
	int sum=0;
	for(int x:arr)
	{
		if(x%2!=0)
		{
			sum=sum+x;
		}
	}
	System.out.println(sum);
}
void meth15()
{
	System.out.println("program to print square value of each number in the array");
	int arr[]= {11,22,33,44,55};
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]*arr[i]);
	}
	
}
void meth16()
{
	System.out.println("program to print the multiplication table of each number in the array");
	int arr[]= {11,22,33,44,55};
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("======================");
		 for(int j=1;j<=10;j++)
		 {
			 System.out.println(arr[i]+"*"+j+"="+arr[i]*j);
		 }
	}
	 
}
void meth17()
{
	System.out.println("program to print only prime numbers in the given array");
	int arr[]= {11,22,33,47,55};
	 
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		 for(int j=1;j<=arr[i];j++)
		 {
			  
			 if(arr[i]%j==0)
			 {
				 count++;
			 }
			 
		 }
		 if(count==2)
		 {
			System.out.println(arr[i]); 
		 }
	}
}
void meth18()
{
	System.out.println("print perfect numbers int the given array");
	int arr[]= {11,6,33,28,55};
	
	
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=1;j<arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				sum=sum+j;
			}
		}
		 
		if(arr[i]==sum)
		{
			System.out.println(arr[i]);
		}
	}
}
void meth19()
{
	System.out.println("reverse the string using second array");
	int arr[]= {11,22,33,47,55};
	int arr1[]=new int [5];
	int j=0;
	for(int i=arr.length-1;i>=0;i--)
	{
		 
		arr1[j]=arr[i];
	     j++;
	}
	System.out.println(Arrays.toString(arr1));
}
void meth20() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" read the integer from the end user and store into array");
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int arr[]=new int[size ];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the value");
		arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	 	
}
void meth21()
{
	 
	System.out.println("read the size of array from the user and sonstruct array object");
	System.out.println("enter size ");
	int size=sc.nextInt();
	int arr[]=new int[size ];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}

}
void meth22()
{
	System.out.println("find the smallest and biggest number in the given array");
	int arr[]= {66,22,33,92,55};
	int big=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(big<arr[i])
		{
			big=arr[i];
		}
	}
	System.out.println(big);
	
	int small=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(small>arr[i])
		{
			small=arr[i];
		}
	}
	System.out.println(small);
	
}
void meth23()
{
	System.out.println("program to find the mean location of an arrayfind the mean if the array has even number of elements");
	
}

void meth24()
{
	System.out.println("program to check the  weather elements are duplicated or not");
	int arr[]= {66,22,33,22,55,11,6,66};
	 
	for(int i=1;i<arr.length;i++)
	{
	for(int j=0;j<i;j++)
	{
		if(arr[j]==arr[i])
		{
			System.out.println("yes it is a duplicated"+arr[i]);
		}
	}
		
	}
}

void meth25()
{
	System.out.println("program to search an element form an array");
	int arr[]= {66,22,33,22,55};
	System.out.println("enter an element");
	int num=sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==num)
		{
			System.out.println("got it element is found in array");
			
		}
		else
		{
			System.out.println("not found");
			
		}
		
	}
	
			
}
//program to pass an array  as parameter to the method
void meth26(int arr[])
{
	 System.out.println(Arrays.toString(arr));
}
 int[] meth27()
 {
	 System.out.println("hiii");
	 return arr;
 }
 void meth28()
 {
	 System.out.println("program to display the elements which are divisibule by both 3&5");
	 int arr[]= {66,22,15,22,55};
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]%3==0 && arr[i]%5==0)
		 {
			 System.out.println(arr[i]);
		 }
	 }
 }
 void meth29() 
 {
	 System.out.println("program to find the average of elements in an array which are divisible by either 4 or 7");
	 int arr[]= {16,21,33,14,55};
	 int count=0;
	 int sum=0;
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]%4==0 || arr[i]%7==0)
		 {
			 System.out.print(arr[i]+ " ");
			 sum=sum+arr[i];
			 count++;
		 }
	 }
	 
	 System.out.println();
	 System.out.println("average :"+(sum/count));
 }
 void meth30()
 {
	 System.out.println("program to find the common elements in 2 arrays");
	 int arr[]= {16,21,33,14,55};
	 int arr1[]= {66,21,15,22,55};
	  
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=0;j<arr1.length;j++)
		 {
			 if(arr[i]==arr1[j])
			 {
				 System.out.println(arr[i]);
			 }
		 }
		 
	
	 }
	 
 }
 void meth31()
 {
	 System.out.println("program to swape array elements in the specified location");
	 int arr[]= {16,21,33,14,55};
	 
	 System.out.println("array list contains:0 to "+(arr.length-1)+" position");
	 System.out.println("enter the swaping position of frist num");
	 int swape=sc.nextInt();
	 System.out.println("enter the swaping postition of second num");
	 int swape2=sc.nextInt();
	 System.out.println("before swape:"+Arrays.toString(arr));
	 int x=arr[swape];
	 arr[swape]=arr[swape2];
	 arr[swape2]=x;
	 System.out.println("after swape:"+Arrays.toString(arr));
 }
 void meth32()
 {
	 System.out.println("program to search for an element");
	 int arr[]= {16,21,33,14,55};
	 System.out.println("enter element for search");
	 int ser=sc.nextInt();
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if(ser==arr[i])
		 {
			 System.out.println("element found");
		 }
		 else
		 {
			 System.out.println("element not found");
		 }
	 }
 }
 void meth33()
 {
	 System.out.println("programto divide an array into even array and odd array");
	 int arr[]= {16,21,33,14,56};
	  int arr1[]=new int[arr.length];
	  int arr2[]=new int[arr.length];
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]%2==0)
		 {
			arr1[i]=arr[i]; 
		 }
		 else
		 {
			 arr2[i]=arr[i];
		 }
	 }
	 
	 System.out.println(Arrays.toString(arr1));
	 System.out.println(Arrays.toString(arr2));
 }
 void meth34()
 {
	 System.out.println("program to swape first even number and last odd number");
	 int arr[]= {16,21,33,14,55,44};
	 int arr1[]=new int[arr.length];
	 int arr2[]=new int [arr.length];
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 if(arr[i]%2!=0)
		 {
			 System.out.println(arr[i]);
			 arr1[i]=arr[i];
			 int x=arr1[i];
			 break;
		 }
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]%2==0)
		 {
			 System.out.println(arr[i]);
			 arr2[i]=arr[i];
			 break;
		 }
		 
	 }
	  System.out.println(Arrays.toString(arr1));
	  System.out.println(Arrays.toString(arr2));
	   
	  
 }
 void meth35()
 {
	 System.out.println("program to merge to arrays");
	 int arr[]= {16,21,33,14,55,44};
	 int arr1[]= {10,20,30,40,50,61,44};
	 int arr2[]=new int[arr.length+arr1.length];
	 for(int i=0;i<arr.length;i++)
	 {
		 arr2[i]=arr[i];
	 }
	  int j=arr.length;
	 for(int i=0;i<arr1.length;i++)
	 {
		 arr2[j]=arr1[i];
		 j++;
	 }
	 System.out.println(Arrays.toString(arr2));
 }
 void meth36()
 {
	 System.out.println("program to find the sum of first negative and last positive numbers from given array");
	 int arr[]= {16,21,33,-14,55,44};
	 int x=0;
	 int y=0;
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 if(arr[i]>0)
		 {
			 System.out.println(arr[i]); 
			 x=arr[i];
			 break;
		 }
	 }
	 for(int i=0;i<arr.length;i++ )
	 {
		 if(arr[i]<0)
		 {
			 System.out.println(arr[i]); 
			 y=arr[i];
			 break;
		 }
	 }
	 System.out.println(x+y);
	 
 }
 void meth37()
 {
	 System.out.println("program to copy negative numbers and positive numbers into two different arrays.");
	 int arr[]= {16,-21,33,-14,55,44,-2};
	 int ncount=0;
	 int pcount=0; 
	 for( int i=0;i<arr.length;i++)
	 {
		  
		 if(arr[i]<0)
		 {
			 ncount++;
		 }
		 else
		 {
			pcount++; 
		 }
	 }
	 int arr1[]=new int [ncount];
	 int arr2[]=new int [pcount];
	  int j=0;
	  int k=0;
	 for( int i=0;i<arr.length;i++)
	 {
		
		 if(arr[i]<0)
		 {
			  arr1[j]=arr[i];
			  j++;
		 }
		 else
		 {
			  arr2[k]=arr[i];
			  k++;
		 }
	 }
	 System.out.println(Arrays.toString(arr1));
	 System.out.println(Arrays.toString(arr2));
 }
 void meth38()
 {
	 System.out.println("");
 }
 void meth60()
 {
	 System.out.println("progtam to merge 2 sort arrays");
	 int arr[]= {16,-21,33,-14,55,44,-2};
	 int arr1[]= {16,21,1,14,5,44};
	 Arrays.sort(arr);
	 Arrays.sort(arr1);
	 int arr2[]=new int [arr.length+arr1.length];
	 for(int i=0;i<arr.length;i++)
	 {
		 arr2[i]=arr[i];
	 }
	 int j=arr.length;
	 for(int i=0;i<arr1.length;i++)
	 {
		 arr2[j]=arr1[i];
		 j++;
	 }
	 
	 System.out.println(Arrays.toString(arr2));
	 Arrays.sort(arr2);
	 System.out.println(Arrays.toString(arr2));
 }
 void meth61()
 {
	 System.out.println("program to print 2D array");
	 int arr[][] ={{10,20},{30,40}};
	 for(int i=0;i<2;i++)
	 {
		 for(int j=0;j<2;j++)
		 {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
 }
 void meth62()
 {
	 System.out.println("program to print 3*3 matrix");
	 int arr[][]= {{9,8,7},{6,5,4},{3,2,1}};
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
 void meth63()
 {
	 System.out.println("program to find the sum of matrix elements ");
	 int arr[][] ={{10,20},{30,40}};
	 int sum=0;
	 for(int i=0;i<2;i++)
	 {
		 for(int j=0;j<2;j++)
		 {
			 System.out.print(arr[i][j]+" ");
			 sum=sum+arr[i][j];
		 }
		 System.out.println();
		  
	 }
	 System.out.println("sum of matrix is:"+sum);
 }
 void meth64()
 {
	 System.out.println("find the sum of diagonal matrix elements");
	 int arr[][] ={{10,20},{30,40}};
	 int sum=0;
	 for(int i=0;i<2;i++)
	 {
		 for(int j=0;j<2;j++)
		 {
			 System.out.print(arr[i][j]+" ");
			 if(arr[i]==arr[j])
			 sum=sum+arr[i][j];
		 }
		 System.out.println();
	 }
	 System.out.println("sum of diagnoal matrix is:"+sum);
 }
 void meth65()
 {
	 System.out.println("program to find row sum and coloumn sum of a matrix");
	 int arr[][] ={{10,20},{30,40}};
	 
	 for(int i=0;i<2;i++)
	 {
		 int sum=0;
		 for(int j=0;j<2;j++)
		 {
			 
			 sum=sum+arr[i][j];
			  
		 }
		 System.out.println(sum);  
	 }
	 
	  
	  
 }
 void meth66()
 {
	 System.out.println("program to add 2 matrix");
	 int arr[][] ={{10,20},{30,40}};
	 int arr1[][] ={{1,2},{3,4}};
	 int x;
	 for(int i=0;i<2;i++)
	 { 
		
		 for(int j=0;j<2;j++)
		 {
			   x=arr[i][j]+arr1[i][j];
			   System.out.println(x); 
		 }
		   
	 }
	 
 }
 void meth67()
 {
	 System.out.println("substration of 2 matrixes ");
	 int arr[][] ={{10,20},{30,40}};
	 int arr1[][] ={{1,2},{3,4}};
	 int x;
	 for(int i=0;i<2;i++)
	 { 
		
		 for(int j=0;j<2;j++)
		 {
			   x=arr[i][j]-arr1[i][j];
			   System.out.println(x); 
		 }
		   
	 }
 }
 void meth68()
 {
	 System.out.println("transpose of a matrix");
	 int arr1[][] ={{1,2},{3,4}};
	  
	 for(int i=0;i<2;i++)
	 { 
		 for(int j=0;j<2;j++)
		 {
           if(arr[i]!=arr[j])
           {
        	  int x=arr1[i][j];
        	  arr1[i][j]=arr1[j][i];
        	  x=arr1[j][i] ;
        	  System.out.println(x);
           }

		 }
		   
	 }
 }
public static void main(String[] args) 
{
	ArraysExamples dj=new ArraysExamples();
	//dj.meth1();
	// dj.meth2();
	//dj.meth3();
	//dj.meth4();
	//dj.meth5();
	//dj.meth6();
	//dj.meth7();
	//dj.meth8();
	//dj.meth9();
	//dj.meth10();
	//dj.meth11();
	//dj.meth12();
	//dj.meth13();
	//dj.meth14();
	//dj.meth15();
	//dj.meth16();
	//dj.meth17();
	//dj.meth18();
	//dj.meth19();
	//dj.meth20();
	//dj.meth21();
	//dj.meth22();
	//dj.meth23();not completed
	//dj.meth24(); 
	//dj.meth25();
	//dj.meth26(new int[] {1,2,3,4,5});
	//System.out.println(Arrays.toString(dj.meth27()) );
	//dj.meth28();
	//dj.meth29();
	//dj.meth30();
	//dj.meth31();
	//dj.meth32();not completed
	//dj.meth33(); 
	//dj.meth34();//not completed
	//dj.meth35();
	//dj.meth36();
	//dj.meth37();
	//dj.meth60();
	//dj.meth61();
	//dj.meth62();
	//dj.meth63();
	//dj.meth64();
	//dj.meth65();
	//dj.meth66();
	//dj.meth67();
	dj.meth68();
}
}
