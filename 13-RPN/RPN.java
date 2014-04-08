import java.io.*;
import java.util.*;

public class RPN{
    
    public int RPN (String s){
	
	MyStack ms = new Mystack();
	int index = 0;
	int a = 0;
	int b = 0;

	while (s.length() > 0){
	    String next = s.substring(index, index+1);
	    if (next.equals("+")){
		
		