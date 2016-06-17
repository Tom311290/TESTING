public class Person {

	static float money;
	static String personName;
	private int Age;
	private String Proffesion;
	
	public Person (String Name, int Age, String Proffesion) 
	{
		personName = Name; /*this.personName - odnosi se na ovu gornju deklariranu varijablu "static String personName"
								*a "Name" iza znaka "=", se odnosi na varijablu definiranu u 
								*samoj funkciji (u zagradama String Name)
								*/
								
		this.Age = Age;
		this.Proffesion = Proffesion;
		
	}

	public String getPersonName ()
	{
			return personName;
	}

}
