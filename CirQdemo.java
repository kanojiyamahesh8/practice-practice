import java.util.*;
class CirQueue {
	char q[]; int head,tail; char ch; boolean wrapAround;
	
	CirQueue(int size) {   //constructor 
	q=new char[size];	
	head=tail=7;
	}
	
	void enqueue(char ch) { 
	if( (tail+1==head) || (tail-head==(q.length-1)) ){
		System.out.println(" Queue is full");
		return;
	} 
	if (tail==q.length) {
		tail=0; 
	}
	q[tail++]=ch;
	}
	
	char dequeue() {
		if(head==tail) {
		System.out.println(" Queue is Empty"); return (char)0; 
		}
		if(head==q.length)
			head=0;
		return q[head++];
	}
}



	class CirQdemo {
		public static void main(String args[]) {
		CirQueue upperCase =new CirQueue(26);
        for(int i=0;i<=25;i++)  {
			System.out.print("  put  "+(char)('A'+i));
			upperCase.enqueue((char)('A'+i));
		}
		upperCase.enqueue('x');
		for(int i=0;i<=25;i++)  {
		System.out.print("get ");
		System.out.print(upperCase.dequeue()+" ");
		}
		System.out.println(upperCase.dequeue());
		}
	}
	
