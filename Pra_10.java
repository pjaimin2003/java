
class Figure
{
   double d1;
   double d2;
   
   Figure(double a, double b)
   {
      d1=a;
      d2=b;
   }

   double area()
   { 
       return area();
   }
}

class Rectangle extends Figure
{ 
    Rectangle(double a, double b)
    { 
        super(a, b);
    }

    double area()
    { 
        return d1*d2;
    }
}

class Pra_10 
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(9,5);
        Figure f=r;
        System.out.println("Area is : "+f.area());
    }
}
