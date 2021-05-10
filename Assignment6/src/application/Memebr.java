package application;

import java.util.Scanner;

public class Memebr {
	public static void main(String[]args){
	     int val,size;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the size of an array: ");
	    size = input.nextInt();
	     int[] array = new int[size];
	    for( int x = 0; x < array.length; x++ ){
	    System.out.print("Enter number for array index "+x+" : ");
	    array[x] = input.nextInt();
	   
	}
	  
	    System.out.println("Enter the number you are looking for: ");
	    val = input.nextInt();
	 
	    System.out.println(isMember(array,val));
	    input.close();
	}

	public static boolean isMember(int[] array, int value) {
		
	    if(array.length == 0) 
	    	return false; 
	    if(array[0] == value) 
	    	return true;
	    int[] array2 = new int[array.length-1];
	    
	    System.arraycopy(array,1,array2,0,array2.length);
	    
	    return isMember(array2, value);           
	}
	    
	    
	  
	   
	

}