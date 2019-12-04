/**
 Author:Subhas
 purpose:function to do Mergesort
 version:1.2
 Filename:mergesort
 Date:19/11/19
 */
package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Mergesort 
{
public static void main(String[] args) 
{
	String[] a = { "rocky","dallas","dheera","dush","xiome"};

    String[] st = utility.mergesort(a,0,a.length-1);
    utility.printarray(a);
  
}
}
