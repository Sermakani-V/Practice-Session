class Constr_para
{
  int i=0;
  
  Constr_para()
   {
	  System.out.println("From Constructor");
   }
  
  Constr_para(int i)
   {
	  System.out.println("From Arg Constructor: "+i);
   }
   
   Constr_para(int i,String name, boolean details)
   {
	   System.out.println("From Arg Constructor: "+i+", "+name+", "+details);
   }
   
   Constr_para(String s1)
   {
	   System.out.println("From Arg Constructor: "+s1);
   }
   
   public static void main(String[]args)
   {
	   Constr_para obj = new Constr_para();
	   Constr_para obj1 = new Constr_para(10);
	   Constr_para obj2 = new Constr_para(10,"Serma",true);
	   Constr_para obj3 = new Constr_para("paramaterized_constructor");
   }
   
}
	   