import java.io.*;
import java.util.*;

public class QuickSelect{
    
    public int QuickSelect(int[] a, int k, int low, int high){

	if (low>=high)
	    return low;

	int[] temp = new int[a.length];

	int left = low;
	int right = high;
	int pivot = (high+low)/2;

        for(int i=low; i<=high;i++){
	    if (a[i]>a[pivot]){
		temp[right]=a[i];
		right--;
	    }
	    else if (a[i]<a[pivot]){
		temp[left]=a[i];
		left++;
	    }
	    else{
		temp[right]=a[i];
	        right--;
	    }
	}

	if (left==k)
	    return temp[left];
	else if (left > k)
	    return QuickSelect(temp, k, low, left);
	else
	    return QuickSelect(temp, k, left+1, high);
    }


    public static void main (String[] args){
	int[] list = {3,1,4,8,2,34,1,2,643,234,78};
	QuickSelect qs = new QuickSelect();
	System.out.println(qs.QuickSelect(list, 7, 0,10));

    }
}
