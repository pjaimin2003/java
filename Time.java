package Time;
import java.util.Scanner;
class Time 
{	
		int hour,minute,second;
		Time(int h,int m,int s)
		{
			hour=h;
			minute=m;
			second=s;
		}
	void getTime()
	    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter hour minute and second:");
		hour=scan.nextInt();
		minute=scan.nextInt();
		second=scan.nextInt();
		}
	void showTime()
	{
		System.out.println("hours:"+hour);
		System.out.println("minute:"+minute);
		System.out.println("second:"+second);
	}
	Time addTime(Time s)
	{
		Time t3 = new Time(0,0,0);
		t3.second =this.second + s.second;
		t3.minute = this.minute + s.minute;
		t3.hour = this.hour + s.hour;
	if(t3.second>=60)
	{
		t3.minute+=t3.second/60;
		t3.second=t3.second%60;

	}
	if(t3.minute>=60)
	{
		t3.hour+=t3.minute/60;
		t3.minute=t3.minute%60;
	}

		return t3;
  }

	
}
class Demo
{
	public static void main(String[] args)
	{
		Time t1 = new Time(4,15,30);
		Time t2 = new Time(0,0,0);
		t1.showTime();
		t2.getTime();
		t2.showTime();
		
	}
		
}
