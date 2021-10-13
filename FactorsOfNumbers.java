class FactorsOfNumbers {
	public static void main(String args[])
	{
	System.out.println("Program to print factors of 1st hundred natural nos.");
	for(int i=1;i<=100;i++) {
        System.out.print("Factors of "+i+": ");
	for (int j=2;j<=i/2;j++) {
	if((i%j)==0) 
	System.out.print(j+",");
}
	System.out.println();
}
	}//end of main
}//end