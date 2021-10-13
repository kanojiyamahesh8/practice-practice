class DialPad{
	public static void main(String args[]) 
	{
	int arr[][]=new int[4][3];
	arr[3][0]=42;arr[3][1]=48;arr[3][2]=35;
	for(int i=0,k=49;i<=2;i++,k+=3) {
	   
	for(int j=0,x=i;j<=2;j++) {
	  arr[i][j]=k+j;
	  //k=k+j;
	}
	}
	   
	   for(int i=0;i<=3;i++) {
	   for(int j=0;j<=2;j++) {
	   System.out.print((char)arr[i][j]);
	}
	   System.out.println("");
	}
}
}