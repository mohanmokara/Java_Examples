package com.pack.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassA
{
void meth1() throws Exception
{
	FileInputStream fis=new FileInputStream("C:\\pdfsql/io1.txt");
	int x;
	while((x=fis.read())!=-1)
	{
		System.out.println((char)x);
	}
	fis.close();
}
void meth2() throws Exception
{
	FileOutputStream fos=new FileOutputStream("C:\\pdfsql/io1.txt",true);
	String data="......what about studying ";
	byte arr[]=data.getBytes();
	fos.write(arr);
	fos.close();
}
void meth3() throws Exception
{
	System.out.println("copying the data ");
	FileInputStream fis=new FileInputStream("C:\\pdfsql/io1.txt");
	 FileOutputStream fos=new FileOutputStream("C:\\\\pdfsql/io2.txt");
	int x;
	while((x=fis.read())!=-1)
	{
		fos.write(x);
	}
	
}
void meth4() throws Exception
{
	System.out.println("copying the data ");
	FileInputStream fis=new FileInputStream("C:\\pdfsql/io1.txt");
	 FileOutputStream fos=new FileOutputStream("C:\\\\pdfsql/io2.txt");
	int x;
	while((x=fis.read())!=-1)
	{
		fos.write(x);
	}
	
}
public static void main(String[] args) throws Exception
{
	//new ClassA().meth1();
	//new ClassA().meth2();
	new ClassA().meth3();
}
}
