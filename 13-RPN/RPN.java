import java.io.*;
import java.util.*;

public class RPN{
    
    private MyStack ms = new MyStack();

    public String RPN (String s){
	
	int index = 0;
	int a = 0;
	int b = 0;

	while (index < s.length()){
	    String frag = s.substring(index, index+1);
	    if (frag.equals("+")){
		a = Integer.parseInt(ms.pop());
		b = Integer.parseInt(ms.pop());
		ms.push(""+(a+b));
	    }
	    else if (frag.equals("-")){
		b = Integer.parseInt(ms.pop());
		a = Integer.parseInt(ms.pop());
		ms.push(""+(a-b));
	    }
	    else if (frag.equals("*")){
		a = Integer.parseInt(ms.pop());
		b = Integer.parseInt(ms.pop());
		ms.push(""+(a*b));
	    }
	    else if (frag.equals("/")){
		a = Integer.parseInt(ms.pop());
		b = Integer.parseInt(ms.pop());
		ms.push(""+(b/a));
	    }
	    else if (frag.equals(" ")){}
	    else{
		while (!s.substring(index+1,index+2).equals(" ")){
		    index++;
		    frag+=s.substring(index, index+1);
		}
		ms.push(frag);
	    }
	    index++;
	}
	
	return ms.pop();
    }
    
    public void clearStack(){
	ms = new MyStack();
    }

    public static void main (String[] args){
	RPN rpn = new RPN();
	System.out.println(rpn.RPN("3 5 +"));
	System.out.println(rpn.RPN("10 5 /"));
	System.out.println(rpn.RPN("4 3 5 + /"));
	System.out.println(rpn.RPN("23 6 -"));
	System.out.println(rpn.RPN("4 2 9 1 - + /"));
	System.out.println(rpn.RPN("100 89 5 / *"));
	System.out.println(rpn.RPN("1 1 + "));
	System.out.println(rpn.RPN("6 9 8 10 231234 5 0 1 - * + / - *"));

    }

}
