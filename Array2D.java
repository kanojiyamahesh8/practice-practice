public class Array2D
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[][]=new int[5][5]; int counter=0;
		for(int i=0;i<=4;i++) {
		    
		    for(int j=0;j<=4;j++){
		       
		        arr[i][j]=++counter;
		       System.out.print(arr[i][j]+" ");
		       
		    }
		}
	}
}