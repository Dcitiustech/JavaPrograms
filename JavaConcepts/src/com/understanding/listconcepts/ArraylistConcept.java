package com.understanding.listconcepts;

import java.util.ArrayList;

public class ArraylistConcept {
	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(100);
		arr1.add(56);
		arr1.add(46);
		arr1.add(32);
		arr1.add(22);
		//duplicate entry allowed 
		arr1.add(22);
		System.out.println(arr1);
		/*
		 * for(Integer a:arr1) { System.out.println(a); }
		 */
	//find the maximum number 	
		int maximum=arr1.get(0);
		//System.out.println(maximum);
		for(int i=0;i<arr1.size();i++)
		{
			if(maximum<arr1.get(i))
			{
				maximum=arr1.get(i);				
				
			}
			
		}
		System.out.println("max number :"+maximum);
		
		//smallest number 
		int smallest=arr1.get(0);
		for(int i=0;i<arr1.size();i++)
		{
			if(smallest>arr1.get(i))
			{
				smallest=arr1.get(i);
			}
		}
		System.out.println("max number :"+smallest);
	
	System.out.println(arr1.indexOf(32));
	}

}
