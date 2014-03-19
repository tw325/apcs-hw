public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = null;
    }
    
    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head);
	head=tmp;
	
    }
    public String toString() {
	Node n = head;
	String s= n.getData();
	while (n.getNext() !=  null) {
	    s += ", " + n.getNext().getData();
	    n = n.getNext();
	}
	return s;
    }

    public void add (int i, String s){
	Node temp = new Node(s);
	if (i==0){
	    temp.setNext(head);
	    head = temp;
	}
	else{
	    Node n = head;
	    while (i>0 && n.getNext() != null){
		n = n.getNext();
	    }
	    n.setNext(temp);
	}
		
    }
	    

}
