import java.io.*;
import java.util.*;

public class QuickSort{
    

    //new partition code. wasn't exactly sure of the routine
    //found an example of in-place quicksort on wikipedia and used it as model.

    public int partition(Integer[] A, int L, int R){
	Random r = new Random();
	int pivotIndex = L+r.nextInt(R-L);
	int temp = A[R];
	A[R] = A[pivotIndex];
	A[pivotIndex] = temp;
	int storeIndex = L;
	for (int i=L;i<R;i++){
	    if (A[i] < A[pivotIndex]){
	        temp = A[storeIndex];
		A[storeIndex] = A[i];
		A[i] = temp;
		storeIndex++;
	    }
	}
        A[R] = A[storeIndex];
	A[storeIndex] = A[pivotIndex];
	return storeIndex;
    }

    //////////////////////////////////////////


    public Integer[] QuickSort(Integer[] L, int left, int right){
	
	if (right-left<=1)
	    return L;
	else{
	    int pivot = partition(L, left, right);
	    if (pivot>left+1)
		QuickSort(L,left,pivot-1);
	    if (pivot<right-1)
		QuickSort(L,pivot+1,right);
	}
	return L;
    }

    public Integer[] QuickSort(Integer[] L){
	return QuickSort(L,0,L.length-1);
    }

    public static void main (String[] args){
        Integer[] list = new Integer[20];
	for (int i = 0; i<20;i++){
	    list[i]=(int)(Math.random()*100);
	}
       	System.out.println(Arrays.toString(list));
	QuickSort qs = new QuickSort();
        qs.QuickSort(list);

	System.out.println(Arrays.toString(list));
    }
}
