package day15OverridingNnFinalNnSuper;

class test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args)
	{
		test t=new test();
		//t.x=200;  We cannot change the value because usage of final(value should be unchanged)
		System.out.println(t.x);

	}

}
