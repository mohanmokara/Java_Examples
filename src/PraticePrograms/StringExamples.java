package PraticePrograms;

public class StringExamples 
{
void meth1()
{
System.out.println("implementation of stringclass and stringbuffer and stringbuilder");
	
String s1=new String("java");
StringBuffer buffer1=new StringBuffer("java");
StringBuilder builder1=new StringBuilder("java");

s1.concat("is awesome");
buffer1.append(" is awesome");
builder1.append(" is awesome");

System.out.println(s1);
System.out.println(buffer1);
System.out.println(builder1);

}
void meth2()
{
	String s1=new String("java");
	String s2=new String("java");
	StringBuffer buffer1=new StringBuffer("java");
	StringBuffer buffer2=new StringBuffer("java");
	StringBuilder builder1=new StringBuilder("java");
	StringBuilder builder2=new StringBuilder("java");
	System.out.println(s1.equals(builder1));
	System.out.println(builder1.equals(buffer1));
	System.out.println(buffer1.equals(s1));
	System.out.println(s1.equals(s2));
	
	System.out.println("using equals (==)");
	System.out.println(s1==s2);
	System.out.println(buffer1==buffer2);
	System.out.println(builder1==builder2);
	
	System.out.println("if we compare contents by using the to string ");
	System.out.println(s1.toString().equals(builder2.toString()));
	System.out.println(buffer1.toString().equals(builder2.toString()));
	System.out.println(buffer1.toString().equals(buffer2.toString()));
	
}
void meth3()
{
	System.out.println("implementing the methods ");
	String s1=new String("java");
	StringBuffer buffer1=new StringBuffer("madam");
	StringBuffer buffer2=new StringBuffer();
	StringBuilder builder1=new StringBuilder("java");
	StringBuilder builder2=new StringBuilder();
	System.out.println(s1.concat("is awesome"));
	System.out.println(buffer1.append(" awesome"));
	System.out.println(builder1.append("awesome"));
	System.out.println(buffer2.capacity());
	System.out.println(builder2.capacity());
	
	buffer2.append("abcdefghijklmnop");
	System.out.println(buffer2);
	System.out.println(buffer2.capacity());
	buffer2.append("q");
	System.out.println(buffer2.capacity());
	System.out.println("-------reverse method--------------");
	System.out.println(buffer1.reverse());
	
}

public static void main(String[] args) 
{
	//new ClassC().meth1();
	//new ClassC().meth2();
	new StringExamples().meth3();
}
}
