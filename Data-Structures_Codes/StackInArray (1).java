public class StackInArray<AnyType>
{
	AnyType [] stack;
	public StackInArray(int size){
		stack = (AnyType[]) new Object[size];
	}
	int peek = -1;
	
	public void push(AnyType data){
		if(peek == stack.length-1){
			System.out.println("Stack is already full");
		}
		else{
			peek++;
			stack[peek] = data;
		}
	}
	
	public AnyType pop(){
		if(peek == -1){
			System.out.println("Stack is already empty");
			return null;
		}
		AnyType data = stack[peek];
		stack[peek] = null;
		peek--;
		return data;
	}
	
	public void display(){
		if(peek == -1){
			System.out.println("Stack is empty");
		}
		else{
			for(int i = peek ; i>= 0 ; i--){
				System.out.print(stack[i] + " , ");
			}
			System.out.println();
		}
	}
	
	public int getSize(){ //returns total size of stack array
		return stack.length;
	}
	
	public int getLastIndex(){ // returns last index of stack array
		return peek;
	}
	
	public AnyType peek(){ // returns peek data of stack array
		return stack[peek];
	}
	
	
	public boolean isEmpty(){ //returns true whether stack array is empty , false otherwise
		return peek==-1;
	}
	
	public void clear(){ // clear all the data of stack array
	stack = (AnyType[]) new Object[stack.length];
		peek = -1;
	}
	
	public int remainingSize(){ //returns remaining size of stack array
		return stack.length - (peek+1);
	}
	
	public int occupiedSize(){ // returns occupied size from total size of stack array
		return peek+1;
	}
	
	public static void main(String[] args){
		StackInArray<Integer> stack = new StackInArray<>(10);
		
		for(int i = 0 ; i < stack.getSize() ; i++){
			stack.push(i);
		}
		stack.push(11); //will not be pushed due to full size
		stack.display();
		
		System.out.println("Poped Data: " + stack.pop());
		stack.display();
		
		System.out.println("#################");
		
		
		StackInArray<String> stack2 = new StackInArray<>(2);
		
		stack2.push("Abhishek");
		stack2.push("Jaguu");
		stack2.push("Full size");
		stack2.display();
		
	}
	
}
