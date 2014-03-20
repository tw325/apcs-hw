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
	Node index = head;
	if (i==0)
	    this.add(s);
	else{
	    i--;
	    while (i>0 && index.getNext() != null){
		index = index.getNext();
		i--;
	    }
	    temp.setNext(index.getNext());
	    index.setNext(temp);
	}
    }

    public String get(int i){
	Node temp = head;
	if (i==0)
	    return head.getData();
	else{
	    while (i>0){
		if (i>1 && temp.getNext() == null){
		    return "Exception: out of bounds";
		}
		temp = temp.getNext();
		i--;
	    }
	}
	return temp.getData();
    }

    public String set(int i,String s){
	Node temp = new Node(s);
	Node index = head;
	if (i ==0){
	    temp.setNext(head.getNext());
	    head = temp;
	}
	else{
	    while (i>1){
		index = index.getNext();
		i--;
	    }
	    temp.setNext(index.getNext().getNext());
	    index.setNext(temp);
	}
	return index.getNext().getData();
    }

    public String remove(int i){
	Node index = head;
	if (i==0){
	    head = head.getNext();
	    return index.getData();
	}
	else{
	    while (i>1){
		index = index.getNext();
		i--;
	    }
	    String s = index.getNext().getData();
	    index.setNext(index.getNext().getNext());
	    return s;
	}
    }

    public int find(String s){
	Node index = head;
	int i = 0;
	if (index.getData()==s){
	    return 0;
	}
	else{
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
