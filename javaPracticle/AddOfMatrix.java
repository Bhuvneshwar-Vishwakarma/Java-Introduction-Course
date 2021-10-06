package javaPracticle;

import java.util.*;
class AdditionOfMatrix
{
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];

	public void get_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first matrix");
		for(int i = 0; i<=2; i++)
		{
			for(int j = 0; j<=2; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter secend matrix");
		for(int i = 0; i<=2; i++)
		{
			for(int j = 0; j<=2; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
	}
	public void add_data()
	{
		for(int i = 0; i<=2; i++)
		{
			for(int j = 0; j<=2; j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
	}
	
	public void show_data()
	{	
		System.out.println("Addition is");
		for(int i = 0; i<=2; i++)
		{
			for(int j = 0; j<=2; j++)
			{
				System.out.println(c[i][j]+" ");
			}
		}
	}
}
	
public class AddOfMatrix
	{
		public static void main(String[] args)
		{	
			AdditionOfMatrix ob =new AdditionOfMatrix();
			ob.get_data();
			ob.add_data();
			ob.show_data();
		}
	}

