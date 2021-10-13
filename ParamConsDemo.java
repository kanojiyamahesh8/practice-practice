class MyClass{
	int x;
	
	MyClass(int i) {
	x=i;
}//end MyClass constructor 	
}//end Class MyClass

class ParamConsDemo{
	public static void main(String args[])
	{
	MyClass t1=new MyClass(10);
	MyClass t2=new MyClass(20);

	System.out.println(t1.x);
	System.out.println(t2.x);
	}
}