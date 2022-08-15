/*
	NON-STATIC Variable OR INSTANCE Variable
    To create object:
		
		--> Using new keyword we can create objects for a particular class.
		
		--> ClassName identifier = new ClassName();  syntax for creating objects.
	
*/
	
class Non_Static_Variable
{
	static int value;
	int i;    //Non static variable 
	
	
	public static void main(String[]args)
	{
		int i=10;
		
		Non_Static_Variable obj = new Non_Static_Variable();  //creating object
	
		System.out.println(obj.i);
		
		obj.i=500;
		
		obj.method1();
		
		
		System.out.println(obj.i);
	}
	
	public void method1()
	{
		System.out.println("Non-static method: " +i +", "+value);
	}
	
	


}