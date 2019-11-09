package day8;

import java.util.Arrays;

class binarysearch
{ 	  
    static int binarySearch(String[] arr, String x) 
    { 
    	Arrays.sort(arr);
        int l = 0, r = arr.length - 1; 
        while (l <= r)
        { 
            int m = (l+ r) / 2; 
            int res = x.compareTo(arr[m]); 
            if (res == 0) 
            {
                return m; 
            }
            else if (res > 0) 
            {	
                l = m + 1; 
            }
            else
            {
                r = m - 1; 
            }
        } 
  
        return -1; 
    } 
  
    public static void main(String []args) 
    { 
        String[] arr = {"geeks", "contribute", "practice","ide"}; 
        String x = "practice"; 
        int result = binarySearch(arr, x); 
  
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found in a list  " +x); 
    } 
} 