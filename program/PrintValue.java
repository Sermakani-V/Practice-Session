class PrintValue
{

 public static void main(String[]ref)
  {
    int value1=10;
	int value2=20;
	
	System.out.println("First Value: " + value1);  //Concadinating the value with string
	System.out.println("Second Value: " + value2);
	System.out.println( ++value1 + value2++);     //Pre and Post increment
	System.out.println(--value1 + value2--);      //Pre and Post Decrement
	System.out.println(value2--);
	System.out.println(value1);
	System.out.println(++value1 - --value2);   //Arithmetic Operators(Subraction)
	System.out.println(value1 * value2);      //Multiplication
	System.out.println(value1+value2);        //Addition
	System.out.println(value1 / value2);     //Division
	System.out.println(value1 % value2);     //Modulo
	
	
	}
  
}
	