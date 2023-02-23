import java.util.Scanner;

class Room{
  
    double length,width;
    Room()
    {
        length = 0;
        width = 0;
    }

      Room(double length,double width)
    {
        this.length = length;
        this.width = width;
    }

    double area()
    {
         return length * width;
    }
}

public class Pra_8 {
    public static void main(String[] args) {
        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length And Width :");
        x=sc.nextDouble();
        y=sc.nextDouble();
        
        Room r=new Room(x,y);
        System.out.println("Area Of Room : "+r.area());
       
    }
}

   
    

