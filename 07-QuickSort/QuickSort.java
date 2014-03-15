import java.io.*;
import java.util.*;

public class QuickSort{
    
    public Integer[] QuickSort(Integer[] L){
	
	if (L.length <=1)
	    return L;

	else{
	    Random r = new Random();
	    int pivot = r.nextInt(L.length);

	    ArrayList<Integer> low = new ArrayList<Integer>();
	    ArrayList<Integer> up = new ArrayList<Integer>();
	    ArrayList<Integer> plist = new ArrayList<Integer>();
	    	    
	    for(int i=0; i<L.length;i++){
		if (L[i]<L[pivot])
		    low.add(L[i]);
		else if (L[i]>L[pivot])
		    up.add(L[i]);
		else
		    plist.add(L[i]);
	    }
	

	    Integer[] lower= low.toArray(new Integer[]{});
	    Integer[] upper= up.toArray(new Integer[]{});
	    Integer[] pArr = plist.toArray(new Integer[]{});

	    lower = QuickSort(lower);
	    upper = QuickSort(upper);

	    for (int x=0;x<lower.length;x++)
		L[x]=lower[x];
	    for (int y=0;y<pArr.length;y++)
		L[y+lower.length]=pArr[y];
	    for (int z=0;z<upper.length;z++)
		L[z+lower.length+pArr.length]=upper[z];
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
