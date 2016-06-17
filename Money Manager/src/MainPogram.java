import java.util.*;
public class MainPogram {

	static String name;
	static String proffesion;
	static int age;
	static int MoneySum;
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
			
		System.out.println("Enter Your name: ");		
		name = 	input.nextLine();
		
		System.out.println("Enter Your age: ");
		age = Integer.parseInt(input.nextLine()); 
		
		
		System.out.println("Enter Your proffesion: ");
		proffesion = input.nextLine();
		
		
		input.close();
		
		Person Osoba1 = new Person (name, age, proffesion);
		
		System.out.println("Your name is: " + Osoba1.getPersonName());
		
	}

}
