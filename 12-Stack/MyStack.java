public class MyStack {
    
    //private Node top;
    private int numElts;
    private String[] list;
    
    public MyStack(){
	//top = null;
	list = new String[10];
	numElts = 0;
    }
    
    public void push(String s){
	//Node n = new Node(s);
	//n.setNext(top);
	//top = n;
	if (numElts>=list.length){
	    String[] tmp = new String[list.length+1];
	    for (int i = 0; i<list.length; i++){
		tmp[i]=list[i];
	    }
	    list = tmp;
	}
	list[numElts]=s;
	numElts = numElts+1;
    }
    
    public String pop() {
	if (numElts>0){
	    numElts--;
	    return list[numElts];
	}
	else
	    return "";
    }
    
    public String peek() {
	if (numElts>0){
	    return list[numElts-1];
	}
	else{
	    return null;
	}
    }
    
    public int size() {
        return numElts;
    }
    
    public boolean isEmpty() {
	return (numElts==0);
    }
    
    public String toString() {
	String s="";
	for (int i=0;i<numElts;i++){
	    s = s + list[i]+", ";
	}
	/*
	  Node tmp = top;
	  while(tmp!=null) {
	  s = s + tmp.getData()+", ";
	  tmp = tmp.getNext();
	  }
	*/
	return s.substring(0,s.length()-2);
    }
    
}
