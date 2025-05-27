package day12PolymorphismNnEncapsulation;

public class AdderMain {

	public static void main(String[] args) 
	{
		Adder addobj=new Adder();
		
		addobj.sum();
		
		addobj.sum(10, 20);
		
		addobj.sum(10, 10.5);
		
		addobj.sum(10.5, 10);
	}

}
