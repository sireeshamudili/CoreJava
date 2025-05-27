package day03_Operators;

public class DecrementOperator {

	public static void main(String[] args) {
		
		//case1
		/*int a=10;
		
		a--;
		System.out.println(a); //9
		*/
		
		//case2 (post decrement)
		/*int a=100;
		int res=a--; //100
		System.out.println(a); //99
        */
		
		//case3 (pre decrement)
		int a=100;
		int res=--a; //99
		System.out.println(res); //99
		System.out.println(a); //99
	}

}
