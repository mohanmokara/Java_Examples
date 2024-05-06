package com.pack.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassG
{
public static void main(String[] args) throws Exception
{
	ClassE aobj1=new ClassE();
	System.out.println(aobj1.a + " "+aobj1.b);
	
	ClassF bobj1=new ClassF();
	System.out.println(bobj1.x + " "+ bobj1.y);
	
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\\\pdfsql/io8.ser"));
	oos.writeObject(aobj1);
	oos.writeObject(bobj1);
	System.out.println("object written");
	oos.close();
	System.out.println("=========deserilization =====================");
	
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\pdfsql/io8.ser"));
	
	ClassE aobj2=(ClassE)ois.readObject();
	ClassF bobj2=(ClassF)ois.readObject();
	
	System.out.println(aobj2.b);
	System.out.println(bobj2.y);
	ois.close();
	
}
}
