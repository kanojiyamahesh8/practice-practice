class PowersOfTwo {
	public static void main(String args[]) {
	int result=1;
	for(int i=0;i<=10;i++) {
	if (i==0)
	//calculations
	System.out.println("Two raised to the power "+i+" is "+result);
        else if (i>0) {
	//calculations
	result*=2;
	System.out.println("Two raised to the power "+i+" is "+result);
	}	
}
		
}//main

}//class