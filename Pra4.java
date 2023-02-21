import java.util.Scanner;
public class Pra4{
	
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of subject");
		n = scan.nextInt();
		int mark[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter marks of subject"+(i+1)+":");
			mark[i] = scan.nextInt();
		}
		float total = 0;
		for(int i=0;i<n;i++) {
			total+= mark[i];
		}
     float per;
     per = (total/n);
     System.out.println("Your Percentage "+per);
	}

}
