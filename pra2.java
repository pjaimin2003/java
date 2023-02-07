import java.util.Scanner;
public class pra2 {
	public static void main(String args[])
	{

		double a,b,c,d;
		Scanner r=new Scanner(System.in);
		System.out.println("enter three double value:");
		a=r.nextDouble();
		b=r.nextDouble();
		c=r.nextDouble();
		d=b*b-4*a*c;
		System.out.println(d);
		if(d>0)
			{	
				double r1=(-b+Math.sqrt(d))/2*a;
				double r2=(-b-Math.sqrt(d))/2*a;
				System.out.println("roots of equations :"+r1+"and"+r2);
			}
		else if(d==0)
		{
			double r1=-b/(2*a);
			double r2=-b/(2*a);
			System.out.println("roots of equations :"+r1+"and"+r2);
			
		}
		else
		{
		System.out.println("imaginery roots");
		}
	}
}
