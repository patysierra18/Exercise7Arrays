package com.exercise7arrays.app;

public class BubbleSort 
{
	public static void main(String[] args) {

		int j = 0;
		int temp = 0;
		boolean flag = true;
		
		
		
	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred 
	                  }
	            }
	}
	
}
