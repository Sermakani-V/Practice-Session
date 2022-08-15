class Static_Variable1
{
	// static variable or class level variable  
	
	static int value=100; 
	static String stringValue="Raja";
	static boolean booleanValue=true;
	static char charvalue;
	static double doublevalue;
	static float floatvalue;
	
	public static void main(String[]args)
	{
		 int i=10;
			
				
		String stringValue ="anudip";  //local variable	
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(booleanValue);
		System.out.println(charvalue);
		System.out.println(doublevalue);
		System.out.println("float val: "+floatvalue);		
		method1();
		method2();
		
		Static_Variable1 obj = new Static_Variable1(); //creating object 
		
		System.out.println("Using class "+Static_Variable1.value);
		System.out.println("Using class "+Static_Variable1.stringValue);
	
	}
	
	public static void method1(){
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(booleanValue);
		System.out.println(doublevalue);
		
	}
	
	public static void method2(){
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(charvalue);
		System.out.println(doublevalue);
		
	}

}