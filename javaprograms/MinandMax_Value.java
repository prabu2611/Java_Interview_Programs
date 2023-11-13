package prabu.javaprograms;

import java.util.Arrays;
import java.util.Collections;

public class MinandMax_Value{
	
	  public static void main(String[] args)
	    {
	 
	        // Initializing array of integers
	        Integer[] num = { 2, 4, 1, 88, 9 };
	 
	        // using Collections.min() to
	        // find minimum element
	        // using only 1 line.
	        int min = Collections.min(Arrays.asList(num));
	 
	        // using Collections.max()
	        // to find maximum element
	        // using only 1 line.
	        int max = Collections.max(Arrays.asList(num));
	 
	        // printing minimum and maximum numbers
	        System.out.println("Minimum number of array is : "
	                           + min);
	        System.out.println("Maximum number of array is : "
	                           + max);
	    }
	}
