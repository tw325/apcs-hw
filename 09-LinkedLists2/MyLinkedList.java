public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = new Node("");
    }
    
    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head.getNext());
	head.setNext(tmp);
    }

    public String toString() {
	Node n = head;
	String s= n.getData();
	while (n.getNext() !=  null) {
	    s += n.getNext().getData()+" ";
	    n = n.getNext();
	}
	return s;
    }

    public void add (int i, String s){
	Node temp = new Node(s);
	Node index = head;
	while (i>0){
	    index = index.getNext();
	    i--;
	}
	temp.setNext(index.getNext());
	index.setNext(temp);
    }

    public String get(int i){
	Node temp = head;
	while (i>0){
	    temp = temp.getNext();
	    i--;
	}
	return temp.getNext().getData();
    }

    public String set(int i,String s){
	Node temp = new Node(s);
	Node index = head;

	while (i>0){
	    index = index.getNext();
	    i--;
	}
	temp.setNext(index.getNext().getNext());
	index.setNext(temp);
	return index.getNext().getData();
    }

    public String remove(int i){
	Node index = head;
	while (i>0){
	    index = index.getNext();
	    i--;
	}
	String s = index.getNext().getData();
	index.setNext(index.getNext().getNext());
	return s;
    }

    public int find(String s){
	Node index = head;
	int i = 0;
	while (index != null){
	    
	    if (index.getData().equals(s))
		return i;
	    else{
		i++;
		index =  index.getNext();
	    }
	}
	return -1;
    }

    public int length(){
	Node index = head;
	int i = 1;
	while (index.getNext() != null){
	    i++;
	    index = index.getNext();
	}
	return i;
    }
	    
	    
}
