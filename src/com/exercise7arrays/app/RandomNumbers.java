package com.exercise7arrays.app;

import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) {
		// Constants declaration
		final int ELEMENTS_ARRAY = 10;
		
		//Variables declaration
		double generatedNumber = 0;
		int generatedNumberInt = 0;
		byte generatedNumberByte = 0;
		
		byte evenValues=0;
		byte oddValues=0;
		byte zeroValues=0;
		byte positiveValues=0;
		byte negativeValues=0;
		
		
		//Arrays declaration
		byte[] miArray1 = new byte[ELEMENTS_ARRAY];
		
		//Array pseudo random number
		//Way 1 By means of Random Class
		Random randomNumbers = new Random (System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY;i++)
		{
			generatedNumber = randomNumbers.nextDouble();
			System.out.println(generatedNumber);
			
		}
		for(int i=0; i<ELEMENTS_ARRAY;i++)
		{
			generatedNumberInt = randomNumbers.nextInt(51)+50;
			System.out.println(generatedNumberInt);
			
		}
		
		//Way 2 By means of Math Class
			
		
		
		for (int i=0;i<ELEMENTS_ARRAY; i++)
		{
			generatedNumber = (int)(Math.random()*50 +50);
			//generatedNumberInt=(int)generatedNumber;
			System.out.println(generatedNumberInt);
					
		}
		
		for (int i=0;i<miArray1.length;i++)
		{
			generatedNumberByte = (byte) randomNumbers.nextInt(101);
		//	System.out.println(generatedNumberByte);
			miArray1[i] = generatedNumberByte;
		}
		
		// Pass 2 Process
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			if(miArray1[i]==0)
			{
				zeroValues++;
				
			}
			else if(miArray1[i]%2==0)
			{
				evenValues++;
				
			}
			else if(miArray1[i]%2==1)
			{
				oddValues+=1;
			}
		
			else if(miArray1[i]>0)
			{
				positiveValues+=1;
			}
			else if(miArray1[i]<0)
			{
				negativeValues+=1;
			}
		}
		//Pass 3 Visualization
		System.out.println("Zeros quantity:" + zeroValues);
		System.out.println("Odd values:" + oddValues);
		System.out.println("Even values:" + evenValues);
		System.out.println("Positive Values:" + positiveValues);
		System.out.println("Negative Values:" + negativeValues);
	
	}

}
