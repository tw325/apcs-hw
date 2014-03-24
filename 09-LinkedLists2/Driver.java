public class Driver {
    public static void main(String[] args){
	Node n1 = new Node("Sully");
	Node n2 = new Node("Mike");
	System.out.println(n1);
	System.out.println(n2);

	n1.setNext(n2);
	System.out.println(n1.getNext());
	n1.getNext().setNext( new Node("Randall") );
	// same as n2.setNext( new Node("Randall"));
	System.out.println();
	System.out.println(n2.getNext());
	System.out.println(n1.getNext().getNext());
	
	/*
	n1.setNext( n1.getNext().getNext()   );
	System.out.println("Got rid of a node");
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	*/

	n1.getNext().getNext().setNext(n1);
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());;


	
    }
}
