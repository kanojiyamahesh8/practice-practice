import java.util.*;
class Queue {
	private char q[];
	private int putloc,getloc;   //indexes to access location in array
	
	  //construct an empty queue using integer argument as size
	Queue(int size) {          
		q=new char[size];
	    putloc=getloc=0;		
	}
	
	//construct a Queue from Queue object
	Queue(Queue obj) {
	putloc=obj.putloc;
    getloc=obj.getloc;
	q=new char[obj.q.length];
	
	for(var i=getloc;i<putloc;i++) { 	//copying elements from object to current Queue
		q[i]=obj.q[i];
	}
	}
	//construct queue with initial values 
	Queue(char a[]) {
	putloc=getloc=0;
	q=new char[a.length];
	for(int i=0;i<a.length;i++) {
	put (a[i]);
	}
	}
	//ptting character into the queue
	    void put(char ch) {
		if(putloc==q.length)
		{
			System.out.println(" Oops! Queue is Full");
			return;
		}
		q[putloc++]=ch;
		//return;
	}//put method
	
	//get character from the queue
	 char get() {
		if(getloc==putloc)
		{
		System.out.println(" Queue is Empty");	
		return (char) 0;
		}
		return q[getloc++];
		
	}//get method
	
} //class Queue



	class Qdemo2 {
		public static void main(String args[]) {
		Queue upperCase =new Queue(26); //constructing 26 element empty queue upperCase
		System.out.println("putting elements in upperCase\n");
        for(int i=0;i<=26;i++)  {//putting elements in upperCase
			System.out.print("  put  "+(char)('A'+i));
			upperCase.put((char)('A'+i));
		}
		System.out.println("\ncontents of queue upperCase:\n");
		for(int i=0;i<=26;i++)  { //printing elements from queue upperCase
		System.out.print(" ");
		System.out.print(upperCase.get()+" ");
		
		}
		
		//constructing 10 element empty queue q1
		Queue q1=new Queue(10);
		
		char name[]={'M','r','.','M','K'};
		//contructing queue q2 from character array
		Queue q2=new Queue(name);
		
		System.out.println("\nputting characters in q1\n");
		 for(int i=0;i<=11;i++)  { //putting characters in q1
			System.out.print(" put "+(char)('A'+i));
			q1.put((char)('A'+i));
		}
			System.out.print("\ncontents of queue q1:\n");
		for(int i=0;i<11;i++)  { //printing elements from queue q1
		System.out.print(" ");
		System.out.print(q1.get()+" ");
		
		}
		
		System.out.println("\ncontents of queue q2:\n");
		for(int i=0;i<=name.length;i++)  { //printing elements from queue q2
		
		System.out.print(q2.get());
		
		}
		
		
		}//end of main
	}//end of class Qdemo2
	
