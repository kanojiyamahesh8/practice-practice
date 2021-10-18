import java.util.*;
class Queue {
	char q[];
	int putloc,getloc;   //indexes to access location in array
	
	Queue(int size) {           //constructor
		q=new char[size];
	    putloc=getloc=0;		
	}
	
	void put(char ch) {
		if(putloc==q.length)
		{
			System.out.println("Oops! Queue is Full");
			return;
		}
		q[putloc++]=ch;
		//return;
	}//put method
	
	char get() {
		if(getloc==putloc)
		{
		System.out.println("Queue is Empty");	
		return (char) 0;
		}
		return q[getloc++];
		
	}//get method
	
} //class Queue



	class Qdemo {
		public static void main(String args[]) {
		Queue upperCase =new Queue(26);
        for(int i=0;i<=26;i++)  {
			System.out.print("  put  "+(char)('A'+i));
			upperCase.put((char)('A'+i));
		
		}
		for(int i=0;i<=26;i++)  {
		System.out.print("get ");
		System.out.print(upperCase.get()+" ");
		
		}
		}
	}
	
