package com.pack.iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class ClassC
{
	void meth1() throws Exception
	{
		System.out.println("read the data from buffered byte streams");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\pdfsql/io5.txt"));
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.println((char)x);
		}
		bis.close();
	}
	void meth2()throws Exception
	{
		System.out.println("write the data  by using bufferedbyte streams");
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\\\pdfsql/io5.txt",true));
		String data=".dinner is chicken";
		byte arr[]=data.getBytes();
		bos.write(arr);
		bos.close();
	}
	void meth3()throws Exception
	{
		System.out.println("copy the data using bufferedcharacterstream");
		BufferedReader br=new BufferedReader(new FileReader("C:\\\\pdfsql/io5.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\\\pdfsql/io6.txt"));
		int x;
		while((x=br.read())!=-1)
		{
			bw.write(x);
		}
		br.close();
		bw.close();
	}
public static void main(String[] args) throws Exception
{
	//new ClassC().meth1();
	//new ClassC().meth2();
	new ClassC().meth3();
}
}
