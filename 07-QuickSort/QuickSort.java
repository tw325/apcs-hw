import java.io.*;
import java.util.*;

public class QuickSort{
    
    public Integer[] QuickSort(Integer[] L){
	
	if (L.length <=1)
	    return L;

	else{
	    int pivot = L.length/2;
	    ArrayList<Integer> low = new ArrayList<Integer>();
	    ArrayList<Integer> up = new ArrayList<Integer>();
	    	    
	    for(int i=0; i<L.length;i++){
		if (L[i]<L[pivot])
		    low.add(L[i]);
		else if (L[i]>=L[pivot])
		    up.add(L[i]);
	    }
	

	    Integer[] lower= low.toArray(new Integer[]{});
	    Integer[] upper= up.toArray(new Integer[]{});;

	    Integer[] bot = QuickSort(lower);//out of bounds here
	    Integer[] top = QuickSort(upper);//out of bounds exception here

	    for (int x=0;x<bot.length;x++)
		L[x]=bot[x];
	    for (int y=0;y<top.length;y++)
		L[y+bot.length+1]=top[y];// and here
	}
	return L;
    }

    public static void main (String[] args){
        Integer[] list = {1,2,98,20,12,77,230,10,53,9};
	QuickSort qs = new QuickSort();
	list = qs.QuickSort(list);

	System.out.println(Arrays.toString(list));
    }
}
