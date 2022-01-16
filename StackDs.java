package Stack;

class MyStack{

//MAXIMUM SIZE OF THE STACK	
int MAX=5;	
//TOP INITIALIZATION
int top=-1;
int data[]=new int[MAX];


//adding the element on the top of the stack

void push(int d) {
	if(top>=MAX-1) {
		System.out.println("\n\nStack is full element can't be added on the top \n delete some element from the stack");
	}
	else {
	data[++top]=d;
	System.out.println("\nELemenet added successfully");
	}
}

//deleting the element from the stack
void  pop() {
	if(isEmpty())
	{
		System.out.println("Stack is empty insert some element first");
	}
	
	else{
	int temp=data[top];
	top--;
	System.out.println("Elememt deleted is : "+temp);
	}	
}

//function for checking the element is empty or not
boolean isEmpty() {
	return(top==-1);
}



//printing the whole stack
void print() {
	for(int d:data) {
       System.out.print(d+"  , ");		
	}
}

//getting the current size of the stack

int size() {
	return top+1;
}

//peek method to get the top element of the stack
void peek() {
	if(isEmpty()) {
		System.out.println("\n\n Stack is empty");
	}
	else{
		System.out.println("\n\n top Element of the stack is : "+data[top]+"\n\n");	   
	}
}
}



public class StackDs {
	
       public static void main(String[] args) {
    	   MyStack m=new MyStack();
    	   
    	   //adding the element into the stack
    	   m.push(10);
    	   m.push(20);
    	   m.push(30);
    	   
    	   //now printing the stack
    	   System.out.println("\n\nAfter Adding the three elements into the stack stack is \n\n");    	   
    	   m.print();
    	   
    	   //again adding the element on to the stack
    	   System.out.println("\n\nFulling the stack with elements  \n\n");  
    	   m.push(5);
    	   m.push(100);
    	   System.out.println("\n\n Now  stack is full with elements  \n\n");  
    	   m.print();
    	   
    	   //trying to insert the element into the filled stack
    	   m.push(70);
    	   
    	  //getting the top element of stack
    	   m.peek();
    	   
    	   //removing the all elements from the stack
    	   
    	   m.pop();
    	   m.pop();
    	   m.pop();
    	   m.pop();
    	   m.pop();
    	   
    	   //forcefully trying to remove the elements from empty stack
    	   m.pop();
    	   
  	   
    	   
    }
}
