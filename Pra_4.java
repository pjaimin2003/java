
import java.util.Scanner;   
public class Pra_4
{ 
    
    public static void main(String args[]) 
    {   
       
        int n,total=0;
        float percentage; 
        Scanner sc = new Scanner(System.in); 
          System.out.print("Enter the total subjects: ");
         n=sc.nextInt();
        
         int arr[] = new int[n]; 
      
        for(int i=0;i<n;i++)   
        {
            System.out.print("Enter the marks of each subject "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
       
        System.out.println("The total marks obtained is: "+total);
        
        percentage = (total /n); 
        System.out.println( "Total Percentage : " + percentage + "%");                         
    }   
}