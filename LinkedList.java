
public class LinkedList
{
	Node head;
	class Node{
	int data;
	Node next;
	Node(int d)
	{
	    data = d;
	    next = null;
	}
	
	}
	
	public  void push(int new_data){
	    Node NewNode = new Node(new_data);
	    NewNode.next = head;
	    head = NewNode;
	}
	public  void insertAft(Node Prev_node, int new_data){
	    if(Prev_node == null){
	    System.out.println("The given previous node cannot be null");  
        return;
	    }
	    Node NewNode = new Node(new_data);
	    NewNode.next = Prev_node.next;
	    Prev_node.next = NewNode;
	}
	
	public  void append(int new_data){
	    Node NewNode = new Node(new_data);
	    if(head == null){
	        head = new Node(new_data);
	        return;
	    }
	    NewNode.next = null;
	    Node last = head;
	    while(last.next!= null){
	        last = last.next;
	        
	    }
	    last.next = NewNode;
	    return;
	}
	
	 public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
	
	public static void main (String[] args) {
	    LinkedList list = new LinkedList();
	   list.append(8);
	   list.push(1);
	   list.append(9);
	   list.printList();
	    
	}
}
