//Tianshi Wang and Omar Hegazy


public class DoubleLL<E>{
    
    private class Node<E>{
	E data;
	Node<E> next, prev;
	public Node(E d){
	    this.data = d;
	}
	public String toString(){
	    return ""+ data;
	}
	public void setData(E d){ data = d;};
	public E getData() {  return data;};
	
	public void setNext(Node<E> n){ next = n;}
	public Node<E> getNext(){
	    Node<E> answer = null;
	    if (this.next == null)
		while (this.prev != null)
		    answer = this.prev;
	    else
		answer = this.next;
	    return answer;
	}

	public void setPrev(Node<E> p) {prev = p;}
	public Node<E> getPrev() {
	    Node<E> answer = null;
	    if (this.prev == null)
		while (this.next != null)
		    answer = this.next;
	    else
		answer = this.prev;
	    return answer;
       }
	
	
    }
    
    private Node<E> current;
    
    public void insert (E d){
	Node<E> n = new Node<E>(d);
	if (current == null){
	    current = n;
	}
	else {
	    if (current.prev != null) current.prev.setNext(n);
	    n.next= current;
	    n.prev = current.getPrev();
	    current.prev = n;
	    current = n;
	}
    }
    public void delete () {
	current.prev.setNext(current.getNext());
	current.next.setPrev(current.getPrev());
    }
    
    public E getCurrent(){
	return current.getData();
    }

    public void forward(){
	    current = current.getNext();
    }

    public void back(){
	    current = current.getPrev();
	}
	
    
    public String toString(){
	if (current == null){
	    return "";
	}
	String s = "[";
	Node<E> tmp = current;
	Node<E> stopCircle = tmp;
	while (this.next() != stopCircle) {
	    this.forward();
	    s +=  this.next().toString() + " ";
	}
	s = s.substring(0,s.length() - 1);
	s += "]";
	return s;
    }

    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	System.out.println(L.getCurrent());
	L.forward();
	L.insert("inserted");
	System.out.println(L);
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.back();
	System.out.println(L.getCurrent());
    }
}
