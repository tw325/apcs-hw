public class LLDriver {
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();

	L.add("Sully");
	L.add("mike");
	L.add("randall");
	L.add(0,"boo");
	System.out.println(L);

	System.out.println(L.get(2));

	System.out.println(L.set(1,"JOHNNY"));
	System.out.println(L);

	System.out.println(L.remove(2));
	System.out.println(L);

	System.out.println("Find Sully: "+L.find("Sully"));
	System.out.println("Find Waldo: "+L.find("Waldo"));

	System.out.println("length: "+L.length());

    }

}

