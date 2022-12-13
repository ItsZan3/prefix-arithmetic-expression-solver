package algoproject;

public class Stack {
    LinkedList list ;
	public Stack(){
            list = new LinkedList();
	}
	public void print(){
            list.print();
	}
	public void push(double characterToAdd){
            list.addOnTop(characterToAdd);
	}
	public double pop(){
            return list.removeFromTop();
	}
	public double peek(){
            return list.peek();
	}
	public boolean isEmpty(){
            return list.isEmpty();
	}
}
