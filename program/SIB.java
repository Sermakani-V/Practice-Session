class A1{	
	
	static {
		System.out.println("From A1 SIB");        //Static initialized block
	}
	
	A1(){
		System.out.println("From A1 no-arg");
	}
	A1(int i){
		System.out.println("From A1 1-arg "+i);
	}
	static {
		System.out.println("From A1 SIB-1");
	}	
}

class A2{
	static {
		System.out.println("From A2 SIB");
	}
	A2(){
		System.out.println("From A2 no-arg");
	}
	A2(int i)
	{
		System.out.println("From A2 arg"+i);
	}
	static {
	System.out.println("From A2 SIB-1");
	}
	
}

class SIB {
	
	static {
		System.out.println("From main SIB 1");
	}
	public static void main(String[] args) {		
		A2 obj2 = new A2();
		A2 obj3 = new A2(100);
	}
	static {
		A1 obj1=new A1();
		System.out.println("From main SIB 2");
	}

}