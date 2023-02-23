import java.util.Scanner;

class Temperature

{
	private double temperature;

	private char scale;


	public double getCelsius()

	{
		
		return((double)(Math.round((temperature-32)/1.8)));

	}	
	
	public double getFahrenheit()

	{

		
return((double)(Math.round((1.8*temperature)+32)));

	}

	
	public void setCelcious(double temperature)

	{
		
		this.temperature = temperature;

                scale='C';
	
	}
	

	
	public void setFarenhit(double temperature)

	{
		
		this.temperature=temperature;
	
		scale='F';

	}
	


	public String toString()

	{

		if (scale == 'C')

		{
	
		       return String.format("%.2f degrees C = %.2f degrees F", temperature, getFahrenheit());

		}
	
        	else

		{

			return String.format("%.2f degrees F = %.2f degrees C", temperature, getCelsius());

		}
	
       }

}

 class Pra_9

{
	
	// Create a main method to run the program.

	public static void main(String[] args)

	{
		
		Scanner in=new Scanner(System.in);
    
                double cel,far,ans;
	
         	System.out.println("Celsius to Fahrenheit conversion:");

		System.out.println("enter temperature in Celcious:");

		cel=in.nextDouble();
	
	
		// Create an object named c2fObj1.

		Temperature sc = new Temperature();

		sc.setCelcious(cel);

		System.out.println(sc.toString());




		System.out.println("\nFahrenheit to CelsiusConversion:");

                System.out.println("enter temperature in farenhit");

	        far=in.nextDouble();


		Temperature sc1 = new Temperature();

		sc1.setFarenhit(far);


		System.out.println(sc1.toString());

	}	

}

