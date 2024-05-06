package PraticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CharExamples 
{
 //programs on char[]arr

	char[]arr= {'a','x','3','m','x','@','p','7','m','4','$' };
	void meth1()
	{
		System.out.println("display the given length of char array");
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$','0'};
		System.out.println(arr.length);
	}
	void meth2()
	{
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$','0'};
		System.out.println(arr[0]);
	}
	void meth3()
	{
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$','0'};
		System.out.println(arr[arr.length-1]);
	}
	void meth4()
	{
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$','0'};
		System.out.println((int)arr[0]);
	}
	void meth5()
	{
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$','0'};
		System.out.println((int)arr[arr.length-1]);
	}
	void meth6()
	{
		char[]arr= {'#','x','3','m','x','@','p','7','m','4','$','0'};
		if(arr[0]>=97 && arr[0]<123  )
		{
			System.out.println("it is a alphabet");
		}
		else
			System.out.println("it is a symbol or number");
	}
	void meth7()
	{
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$' };
		switch(arr[arr.length-1])
		{
		case 'a':
			System.out.println("it is a vowel");
			break;
		case 'e':
		
			System.out.println("it is a vowel");
		break;
		case 'i':
			System.out.println("it is a vowel");
			break;
		case 'o':
			System.out.println("it is a vowel");
			break;
		case 'u':
			System.out.println("it is a vowel");
			break;
			default :
			System.out.println("it is a not a vowel");
		}
	}
	void meth8()
	{
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$' };
		 
		System.out.println(Arrays.toString(arr));
	}
	void meth9()
	{
		char[]arr= {'a','x','3','m','x','@','p','7','m','4','$' };
		char[]arr1=new char[arr.length];
		for(int i=arr.length;i>=0;i--)
		{
			arr1[i]=arr[i];
		}
	}
public static void main(String[] args)
{
	CharExamples dj=new CharExamples();
	//dj.meth1();
	//dj.meth2();
	//dj.meth3();
	//dj.meth4();
	//dj.meth5();
	dj.meth6();
	//dj.meth7();
	//dj.meth8();
}
}
