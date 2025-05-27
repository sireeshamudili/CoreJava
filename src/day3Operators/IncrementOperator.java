package day3Operators;

public class IncrementOperator {

	public static void main(String[] args) {
		
		// ++ is called increment operator
		//case1
		/*int a = 10;
		System.out.println(a); //10
		
		a++;   //a = a+1
		System.out.println(a); //11
		*/
		
		//case2 - post increment(Variable value will assign to the variable then incrementation will happen)
		/*int a= 10;
		int res= a++;
		System.out.println(res); //10
		System.out.println(a); //11
		*/
		
		//case3 - pre increment(First incrementation will happen then variable value will assign)
		int a= 10;
		int res= ++a;
		System.out.println(res); //11
		System.out.println(a); //11
	}

}
