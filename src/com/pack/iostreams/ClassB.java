package com.pack.iostreams;

import java.io.FileReader;
import java.io.FileWriter;

public class ClassB  
{
	void meth1()throws Exception
	{
		FileReader fr=new FileReader("C:\\pdfsql/io3.txt");
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x+ " ");
		}
		fr.close();
		System.out.println();
	}
	 
	void meth2()throws Exception
	{
		FileWriter fw=new FileWriter("C:\\pdfsql/io3.txt" ,true);
		String data=".but need more pratice  ";
		 
          fw.write(data);
          fw.close();
	}
	void meth3() throws Exception
	{
		System.out.println("copying the data io3 into io4");
		FileReader fr=new FileReader("C:\\pdfsql/io3.txt");
		FileWriter fw=new FileWriter("C:\\pdfsql/io4.txt" );
		int x;
		while((x=fr.read())!=-1)
		{
			 fw.write(x);
		}
		
		fr.close();
		fw.close();
	}
public static void main(String[] args) throws Exception
{
	System.out.println("implementing the file reader and file writer");
	//new ClassB().meth1();
	//new ClassB().meth2();
	new ClassB().meth3();
}
}
