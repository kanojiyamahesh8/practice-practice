import java.util.*;
class HelpNew{
	void helpOn(int choice) {
	switch(choice) {
	
	case 1 :
	System.out.println("\nSyntax of if:\nif(condition) statement; else statement;");
	break;

	case 2 :
	System.out.println("\nSyntax of switch:\nswitch(expression) case constant: statement;\n break;");
	break;

	case 3 :
	System.out.println("\nSysntax for do-whlie:\ndo statement while (condition);");
	break;

	case 4 :
	System.out.println("\nSyntax for break:\nbreak; OR break label;");
	break;

	case 0 :
	//break;
}//end switch
}//end helpOn

	void showMenu() {
	System.out.println("Help on");
	System.out.println("1: if");
 	System.out.println("2: switch");
	System.out.println("3: do-while");
	System.out.println("4: break");
	System.out.println("press 0 to exit");
}//end showMenu

	boolean isChoiceValid(int choice) {
	if( ( (choice>=0) && (choice<=4) ) ) 
	{	 
     System.out.println("good choice\n");
	return true;
	}
	else
	{
	 System.out.println("enter a valid choice\n");
	return false;	
	}
	}//end isChoiceValid
	
}//end class HelpNew


class HelpClassDemo {
	public static void main(String args[])
	{
		int choice;
	
	HelpNew helpnew_obj=new HelpNew();
	
	do{
	helpnew_obj.showMenu(); //dispaly menu	
	
	Scanner mk=new Scanner(System.in);//taking input
	choice=mk.nextInt();
	
	helpnew_obj.isChoiceValid(choice); //checking validity
	
	if(choice==0)  {  	//to exit
		System.out.println("bye");	break;
	}
	helpnew_obj.helpOn(choice); //swirch cases
		
	} while(true) ;
	
	

	
	}//end main
}//end class HelpClassDemo