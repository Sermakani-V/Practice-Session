class Student1
{
   static                                             //SIB
   {
       System.out.println("From student SIB");
   } 
   
   Student1()
   {
	   System.out.println("From student no-arg");
   }
   
   Student1(int i)
   {
	   System.out.println("From student 1 1-arg");
   }
   
   {
	   System.out.println("From student IIB");
   }
}
   
class IIB
{                                                       //IIB
	static
	{
       System.out.println("From main SIB");
   } 
    
   public static void main(String[]args)
   {
	   Student1 details= new Student1();
   }
   
}

 