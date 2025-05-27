package day11Methods;

public class GreetingsMain {

	public static void main(String[] args) 
	{
		Greetings gr= new Greetings();
		gr.m1(); //1
		
		String s=gr.m2();
		System.out.println(s); //2
		
		gr.m3("Siri"); //3
		
		String var=gr.m4("Nithya");
		System.out.println(var); //4

	}

}
