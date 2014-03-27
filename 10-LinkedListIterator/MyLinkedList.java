import java.io.*;
import java.util.*;

public class MyLinkedList<E> implements Iterable<E> {
    
    private Node<E> head;
    private Node<E> tail;

    public Iterator<E> iterator(){
	MyLinkedListIterator<E> mlli = new MyLinkedListIterator<E>(head);
	return mlli;
    }

    public MyLinkedList() {
	head = new Node<E>(null);
	tail = head;
    }
    
    
    public void add(E d) { //Add to end
	Node<E> n = new Node<E>(d);
	tail.setNext(n);
	tail = n;
    }


    //toString() still does not work properly.
    public String toString() {
	Node<E> n = head;
	String s= n.toString();
	while (n.getNext() !=  null) {
	    s += n.getNext().toString()+" ";
	    n = n.getNext();
	}
	return s;
    }

    public void add (int i, E s){
	Node<E> temp = new Node<E>(s);
	Node<E> index = head;
	while (i>0){
	    index = index.getNext();
	    i--;
	}
	temp.setNext(index.getNext());
	index.setNext(temp);

	if (temp.getNext() == null)
	    tail = temp;
    }

    public E get(int i){
	Node<E> temp = head;
	while (i>0){
	    temp = temp.getNext();
	    i--;
	}
	return temp.getNext().getData();
    }

    public E set(int i,E s){
	Node<E> temp = new Node<E>(s);
	Node<E> index = head;

	while (i>0){
	    index = index.getNext();
	    i--;
	}
	temp.setNext(index.getNext().getNext());
        E ans = index.getNext().getData();
	index.setNext(temp);
	return ans;
    }

    public E remove(int i){
	Node<E> index = head;
	while (i>0){
	    index = index.getNext();
	    i--;
	}
        E s = index.getNext().getData();
	index.setNext(index.getNext().getNext());
	return s;
    }

    public int find(E s){
	Node<E> index = head;
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
	Node<E> index = head;
	int i = 0;
	while (index.getNext() != null){
	    i++;
	    index = index.getNext();
	}
	return i;
    }
	    

    private class MyLinkedListIterator<E> implements Iterator<E> {

	private Node<E> current;
	
	private MyLinkedListIterator(Node<E> n){
	    current = n;
	}
	
	public boolean hasNext(){
	    return (current.getNext() != null);
	}

	public E next() {
	    E next = current.getData();
	    current = current.getNext();
	    return next;
	}
	
	public void remove() {}
    }

    public static void main(String[] args) {
	MyLinkedList<String> l = new MyLinkedList<String>();
	l.add("john");
	l.add("sam");
	l.add("three");
	l.add("han");
	l.add("jim");
	System.out.println(l.length());
	System.out.println(l);//does not work, not sure why
	for (int i = 0; i<l.length();i++){
	    System.out.print(l.get(i) + " ");
	}
    }
    
}
