package Utility;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Utility {
	
	 
		// creating object of Scanner class
		static Scanner scanner = new Scanner(System.in);
		 
		/**
		 * This method is used to take integer input from user
		 * 
		 * @return integer value
		 */
		public static int getInt() {

			int integer = scanner.nextInt();
			return integer;

		}

		/**
		 * This method is used to take long input from user
		 * 
		 * @return long value
		 */
		public static long getLong() {

			long longValue = scanner.nextLong();
			return longValue;

		}

		/**
		 * This method is used to take double input from user
		 * 
		 * @return double value
		 */
		public static double getDouble() {

			double doubleValue = scanner.nextDouble();
			return doubleValue;
		}

		/**
		 * This method is used to take float input from user
		 * 
		 * @return float value
		 */
		public static float getFloat() {
			float floatValue = scanner.nextFloat();
			return floatValue;
		}

		/**
		 * This method is used to take String input from user
		 * 
		 * @return String
		 */
		public static String getString() {

			String string = scanner.nextLine();
			return string;

}





/***********************year leap **************************/
		
public static void getLeapYear() {
	
	 
		int year;
		System.out.println("Please enter positive year:  ");
		year=Utility.getInt();
			if(year >= 1582){
				if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
					System.out.println("leap");
				}else {
					System.out.println("not-leap");
					
				}
			}	else
				{
					System.out.println("invalid year");
				}

			

			}			

	
/** ___________________________intopt _______________**/

/**
 * @param a first value
 * @param b second value
 * @param c third value
 */
public static void getIntOpt(int a,int b,int c) 
{
	
	//perform operation

	int x = a+(b*c);
	int y = (a*b)+c;
	int z = c+(a/b);
	int p = (a%b)+c;
	
	// output result

	System.out.println(x+" "+y+" "+z+" "+p);
}
  




/***********************double value **************************/

/**
 * @param a is double value
 * @param b
 * @param c
 */
public static void getDoubleopt(double a,double b,double c)
{
	
	//perform operation
	
double x = a+(b*c);
double y = (a*b)+c;
double z = c+(a/b);
double p = (a%b)+c;

// output result

System.out.println(x+" "+y+" "+z+" "+p);

}


/*********************** print three name**********/



/**
 * @param str
 */
public static void getPrintThreeName(String str) {
String a[] = str.split(" ");
for(int i=0 ; i<a.length ; i++) {
	System.out.print(a[i]+" ");
}
System.out.println(""); 
System.out.print("hii ");


 // loop for reverse words
 
for(int i=a.length-1 ; i>=0 ; i--) {
	System.out.print(a[i]+" ");
}
}


/*********************** SpringSeason**************************/

 


	/**
	 * @param m input integer value from user 
	 * @param d input integer value from user 
	 */
	public static void getSpringSeason(int m, int d) {
		if(m<0 || d<0) {
			System.out.println("Please enter positive number: ");
			System.out.println("Enter Month is: ");
			m = Utility.getInt();
			System.out.println("Enter day is: ");
			d = Utility.getInt();
			Utility.getSpringSeason(m, d);
		}
		else
		{
		if((m == 3 && d >= 20 && d <= 31) || ( m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20))
		{
		System.out.println("true");
		}else {
			System.out.println("false");

		}
		}}




/***********************distance **************************/


/**
 * @param x input double value from user 
 * @param y input double value from user 
 * @return
 */

public static void getDistance(double x, double y) {
	double distance = Math.sqrt((x*x) + (y*y));
	System.out.println(distance);
	
}


/***********************sumoftwodice**************************/




/**
 * @param x taking integer from user
 * @param y taking integer from user 
 */

public static void getSumOfTwoDice() {
	
	
	  //Random is a inbuilt class in java.util package
	 
	Random dice = new Random();
	
	
	 // take 1st random number
	 
	int number1 = 1+dice.nextInt(6);
	System.out.println("First random number is: "+number1);
	
	
	 // take 2nd random number
	 
	int number2 = 1+dice.nextInt(6);
	System.out.println("Second random number is: "+number2);
	
	
	 // sum of both random number
	 
	
	int sum = number1 + number2;
	System.out.println(sum);
	
}




/*********************Carloan****************************/


/**
 * @param Y input int value from user 
 * @param P input float value from user 
 * @param R input float value from user 
 */

public static void getCarLoan(int Y, float P, float R) {
	float n = 12 * Y;
	float r = R/(12*100);
	double payment = (P*r)/Math.pow((-n),1-(1+r));
	System.out.println(payment);
	
}


/********************* trigno****************************/



/**
 * @param degrees takeing double value from user in an array
 */
public static void getTrig(double degrees) {
	
	if(degrees<0) {
		System.out.println("please enter positive number: ");
		double degrees1 = Utility.getDouble();
		Utility.getTrig(degrees1);
	}else {
	
	// convert degrees to radians 
	double radians = Math.toRadians(degrees);
	System.out.println("radians is: "+radians);
	
    // sin() method to get the sin value 
	
	double sinVal = Math.sin(radians);
	System.out.println("sin = "+sinVal);

	
    // cos() method to get the cosine value 
	
	double cosVal = Math.cos(radians);
	System.out.println("cos = "+cosVal);
	
	
	
	}

}


/********************* dayofweek****************************/

	/**
	 * @param y input integer value from user 
	 * @param m input integer value from user 
	 * @param d input integer value from user 
	 * @return 
	 */
	
	public static int getDayOfWeek(int y, int m, int d) {
      int y0 = y - (14 - m) / 12;
      
      int x = y0 + y0/4 - y0/100 + y0/400;
      
      int m0 = m + 12 * ((14 - m) / 12) - 2;
      
      int d0 = (d + x + (31*m0)/12) % 7;	
      
      switch (d0) {
		
		case 0:
      	System.out.println("Sunday");
      	break;
		case 1:
      	System.out.println("Monday");
      	break;
		case 2:
      	System.out.println("Tuesday");
      	break;
		case 3:
      	System.out.println("Wednesday");
      	break;
		case 4:
      	System.out.println("Thursday");
      	break;
		case 5:
      	System.out.println("Friday");
      	break;
		case 6:
      	System.out.println("Saturday");
      	break;
		default:
			break;
      }
		return d0;
}
	


/*********************ALGORITHMPROGRAM****************************/




/********************* FLIPCOIN****************************/

/**
 * @param f takeing integer numbers from user 
 */
public static void getFlipCoin(int f) {
	double d[]=new double[f];
	int tail = 0;
	int head = 0;
	if(f>0) {
		for(int i=0;i<f;i++) {
			d[i]= Math.random();
			if(d[i]<0.5) {
				System.out.println("tails");
				tail++;
			}else {
				System.out.println("heads");
				head++;
			}
			}
			}else {
				System.out.println("It is a negative number");
			
				

			}
			float PercentageHead  = (head*100)/f;
			System.out.println("Percentage of head= "+PercentageHead);
		
			float PercentageTail  = (tail*100)/f;
			System.out.println("Percentage of tail= "+PercentageTail);
}





/********************* HARMONIC NUMBER****************************/


/**
 * @param n take integer value from user
 */
public static void getHarmonic(int n)
{

	if(n<0) {
		System.out.println("Please enter positive number: ");
		n = Utility.getInt();
		Utility.getHarmonic(n);
		
			}
			else 
				{
				double sum =0.0;
				for(int i = 1 ; i <= n ;i++) {
					sum = sum+ (1.0)/i;
				}
				System.out.println(sum);

				}
       	System.out.println(n);
}




/********************* POWEROF2****************************/



/**
 * @param n takeing integer numbers from user in an array
 */
public static void getPowerOf2(int n) {
	
	int power=0;
	
	if(n<0) 
	{
		System.out.println("Please enter positive number: ");
		n = Utility.getInt();
		Utility.getPowerOf2(n);
	}
	else 
	{
	if(0<=n) 
	{
		if(n<31) 
		{
			System.out.println("power of 2: ");
			for(int i=1;i<=n;i++) 
			{
				power = (int) Math.pow(2, i);
				System.out.println("2 ^ "+i+" = "+power);
			}
			}
		else 
		{
		System.out.println("overflows an int");
		}
	}
	}
}




/********************* stat5****************************/


/**
 * @param r input integer value from user 
 * @param s input integer value from user 
 */

public static void getStar5(int n) {
	double average;
	double sum = 0;
	double values[]=new double[5];

	//to find random value
	
	for(int i = 0 ; i < values.length ; i++) {
		values[i] = Math.random();
	System.out.println(values[i]);
	}
	
	//to find average
	
	for(int i = 0 ; i < values.length ; i++) {
		sum = sum+values[i];
	}
	average = sum/5;
	System.out.println("average is: "+average);
	
	//to find maximum value
	
	double max = values[0];
	for(int i = 0 ; i < values.length ; i++) {
		 if(values[i]>max) {
			 max = values[i];
		 }
		 }
	System.out.println("Maximum value is: "+max);

	//to find minimum value
	
	double min = values[0];
	for(int i = 0 ; i < values.length ; i++) {
		 if(values[i]<min) {
			  min = values[i];
		 }
		 }
	System.out.println("Minimum value is: "+min);
}

 

/********************* windchill****************************/





/**
 * @param t input double value from user 
 * @param v input double value from user 
 */
public static void getWindChill(double t, double v)
{
	if(t>50 || v>120 || v<3) 
	{
		System.out.println("not valid enter again: ");
		double t1 = Utility.getDouble();
		double v1 = Utility.getDouble();
		double w = 35.74 + 0.6215*t1 + ((0.4275*t1) - 35.75) * Math.pow(v1, 0.16);
       System.out.println("wind chill: "+w);}
else 
{
	double w = 35.74 + 0.6215*t + ((0.4275*t) - 35.75) * Math.pow(v, 0.16);
	System.out.println("wind chill: "+w);
}

}



/*********************temp****************************/

/**
 * @param choice take integer value as an input 1 0r 2 from user
 */

public static void getTemperatureConversion(int choice) {
	
	double temperature = 0.0;
	double converted = 0.0;
	
	
	 // condition for choice 1 and 2
	 
	if(choice == 1) {
		
		System.out.println("Enter the temperature in celcius");
		temperature = Utility.getDouble();
		converted = (temperature*9/5)+32;
		System.out.println("Temperature in fahrenheit is: "+converted);
		
	}
	else {
		if(choice == 2) {
			
			System.out.println("Enter the temperature in fahrenheit: ");
			temperature = Utility.getDouble();
			converted = (temperature-32)*5/9;
			System.out.println("Temperature in celcius is: "+converted);
			
		}
		}
}



/*********************sqrt****************************/


/**
 * @param c takeing integer value from user in an array
 */
public static void getSqrt(double c)
{
	
	double e = 1e-15;
	double t = c;
	if(c<0)
	{
		System.out.println("Please enter positive number: ");
		int c1 = Utility.getInt();
		Utility.getSqrt(c1);

	}
	else
	{
    // repeatedly apply Newton update step until desired precision is achieved
	
    while (Math.abs(t - c/t) > e*t)
    {
        t = (c/t + t) / 2.0;
    }
   
	}
	System.out.println(t);
	
}


/*********************REAPETEDNUMBER****************************/


/**
 * @param number takeing integer numbers from user in an array
 */
public static void getRepeatedNumber(int[] array) {
	
	int store = array.length;
	for(int i = 0 ; i < store ; i++) {
		for(int j = i+1 ; j < store ; j++) {
			if(array[i] == array[j]) {
				
				System.out.print("Repeated value is: "+array[j]);
			}

		}
					
	}
	//System.out.println("print the result:"+array);
	
}


}



 
	 