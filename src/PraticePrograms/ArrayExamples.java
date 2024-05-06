package PraticePrograms;

public class ArrayExamples
{
	//addition of matrixs
	void addMatrix()
	{
		int a[][]= {{1,2,3,},{1,2,3,},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3,}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		} 	
	}
	//check the given matrix are equal or not
	void checkMatric()
	{
		int a[][]= {{1,3,5},{2,4,6},{1,2,3}};
		int b[][]= {{2,2,2},{3,3,3},{4,4,4}};
		 
		int row1=a.length;
		int col1=a[0].length;
		
		int row2=b.length;
		int col2=b[0].length;
		boolean flag=true;
		
		if(row1!=row2 || col1!=col2)
		{
			System.out.println("matrices are not equal");
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
				if(a[i][j]!=b[i][j])
				{
					flag=false;
					break;
				}
				}
			}
			if(flag)
			{
				System.out.println("matrics are equal");
			}
			else
			{
				System.out.println("matrics are not equal");
			}
		}
		
	}
	void LowerTriangle()
	{
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int rows=a.length;
		int cols=a[0].length;
		if(rows!=cols)
		{
			System.out.println("it is not a square matric");
		}
		else
		{
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					if(j>i)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print(a[i][j]);
					}
				}
				System.out.println();
			}
		}
		
	}
	
public static void main(String[] args)
{
	ArrayExamples ref=new ArrayExamples();
	//xref.addMatrix();
	//ref.checkMatric();
	ref.LowerTriangle();
}
}
