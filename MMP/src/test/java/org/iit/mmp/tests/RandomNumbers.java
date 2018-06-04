package org.iit.mmp.tests;

import java.util.Random;

public class RandomNumbers {
	
public static void main(String[] args) {
		
		/*128 ASCII characters
		 * Special Characters
		 * numbers
		 * lower Case
		 * upper Case
		 * 
		 * 
		 */
		 
		Random rnd = new Random();
		int k = 97 + rnd.nextInt(26);
		System.out.println((char)k);
		
	
		//Validation 
		//Generate 5 digit random number
		
		//int i = 9999+rnd.nextInt(10000);
		int i = getRandomNumber(10,1);
		System.out.println(i);
	 
	}
	
    public static int getRandomNumber(int limit,int digits)
    {
    	Random rnd = new Random();
    	String value="";
    	for(int i=0;i<digits;i++)
    	{
    		value = value+"9";
    	}
    	int result = Integer.parseInt(value)+rnd.nextInt(limit);
    	return result;
    }

}
