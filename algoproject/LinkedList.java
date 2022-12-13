package algoproject;

public class LinkedList {
        Node head;
	public LinkedList(){
            head =null;
	}
	public boolean isEmpty(){
            return this.head==(null);
	}
	public void addOnTop(double characterToAdd){
            Node n = new Node(characterToAdd);
            n.next=head;
            head=n;
	}
	public double removeFromTop(){
            Node temp = head;
            head = head.next;
            return temp.data;
	}
	public void print(){
            if(this.isEmpty())
		System.out.println("EMPTY!!");
            else{
		Node temp= head;
		while(temp !=null){
                    System.out.println(temp.data);
                    temp = temp.next;
                }	
            }
	}
	public Double peek(){
            if(this.isEmpty())
		return null;
            return head.data;
	}
	
}
