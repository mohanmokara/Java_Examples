package com.pack.iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassD
{
	void meth1() throws Exception
	{
		System.out.println("implementing the datastreams");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\\\pdfsql/io7.txt"));
		dos.writeInt(100);
		dos.writeChar('a');
		dos.writeBoolean(true);
		dos.writeInt(20);
		System.out.println("data entered");
		dos.close();
		DataInputStream dis=new DataInputStream(new FileInputStream("C:\\pdfsql/io7.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		dis.close();
		
	}
public static void main(String[] args)  throws Exception


{
 new ClassD().meth1();	
}
}
