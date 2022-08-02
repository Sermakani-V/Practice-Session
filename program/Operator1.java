class Operator1
{
  public static void main(String[]sname)
  {
         int X=10;
         int Y=0;
	 int value1=10;
	 int value2=20;
	 int value3=30;
	 
	System.out.println("Value of X is " + X);
	 
	Y+=20;
	
	System.out.println("Value of Y is " + Y);
	
	boolean Result = (true) && (false) && (false) || (true);
	
	System.out.println(Result);
        
        boolean Result1 = (value1 < value2) || (value3 != value1) && (value2 > value3) && (value2 < 50) || (value1==value3) || (1000>500);
	
        System.out.println(Result1);
	
   }
   
}