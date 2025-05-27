package day2VariablesAndDataTypes;

public class DatatypesDemo {

	public static void main(String[] args) {
		
	  //Numeric data Types
      int a = 100, b = 200;
      System.out.println("Tha value of a is:" + a);
	  System.out.println("Tha value of a is:" + b);
	  System.out.println("Tha sum of a and b is:" + (a+b));
	  
	  byte by = 120;
	  System.out.println(by);
	  
	  short sh = 3000;
	  System.out.println(sh);
	  
	  long l = 36567780920783782L;   //literal is needed L/l
	  System.out.println(l);  
	  
	  //Decimal numbers -----float, double
	  float itemPrice = 15.5F;    //literal is needed F/f
	  System.out.println(itemPrice);
	  
	  double dbl = 2537.7892557821;
	  System.out.println(dbl);
	  
	  char grad = 'A';
	  System.out.println(grad);
	  
	  String name = "Siri";
	  System.out.println(name);
	  
	  boolean bl = true; //Allows only true/false
	  System.out.println(bl);
	}

}
