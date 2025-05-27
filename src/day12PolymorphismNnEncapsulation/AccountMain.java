package day12PolymorphismNnEncapsulation;

public class AccountMain {

	public static void main(String[] args)
	{
		Account acc=new Account();
		
		acc.setAccno(101);
		acc.setAmount(10000);
		acc.setName("Siri");
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());

	}

}
