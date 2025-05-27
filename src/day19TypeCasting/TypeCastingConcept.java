package day19TypeCasting;

//Upcasting --- converting the values from smaller to larger
/*
int---long
float---double
*/

//Downcasting --- converting the values from larger to smaller
/*
long---int
double---float
*/

public class TypeCastingConcept {

	public static void main(String[] args)
	{
		//upcasting-automatic process
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.5f;
		double dbvalue=floatvalue;
		System.out.println(dbvalue);
		
		//downcasting--manual process
		long lvalue=10000;
		int ivalue=(int)lvalue;
		System.out.println(ivalue);
		
		double dvalue=1245.5;
		float fvalue=(float)dvalue;
		System.out.println(fvalue);
	}

}
