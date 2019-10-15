package com.exercise7arrays.app;

import java.util.Random;

public class TareaVectorPromedio {

	public static void main(String[] args) 
	{
			
		int[] intArray = new int[10];
		double generatedNumber = 0;
		int generatedNumberInt = 0;
		int sumaNum = 0;

		for (int i=0; i<intArray.length;i++)
		{
			
		generatedNumber = ((Math.random())*50) +50;
		generatedNumberInt=(int)generatedNumber;
		System.out.print(generatedNumberInt + " ");
		//intArray[i] = generatedNumberInt;
		sumaNum = sumaNum + generatedNumberInt;
		
		}
		System.out.println(" ");
		System.out.println(sumaNum / intArray.length);
		
		/*for (int i=intArray.length;i<0; i++)
		{
			
			System.out.print(intArray[i] + " ");	
			}
		
		
		
		
		
		
		/*for (int i=0; i<intArray.length;i++)
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println(" ");
		for (int i=0; i<intArray2.length;i++)
		{
		 intArray= 	randomNumbers.nextDouble();
			 System.out.print(intArray2[i] + " ");
			*/
		
			}
		}
		
	
	



	
	
