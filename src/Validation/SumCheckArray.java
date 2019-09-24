package Validation;

import java.util.Scanner;

public class SumCheckArray {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       SumCheckArray obj=new SumCheckArray();
       int[] arr1= new int[]{-1,-2,5,3,2,7};
       int[] arr2= new int[]{1,4,5,6,9,3};
        obj.mergeArrays(arr1, arr2);
	}

	public int[] mergeArrays(int[]arr1,int[]arr2){
		System.out.println(arr1.length+"==="+(arr1.length+arr2.length));
		
		int combine[]=new int[arr1.length+arr2.length];
		//int combinee[]= new int[]{-2,-1,1,2,3,3,4,5,5,6,7,9};
		int i=0,j=0,k=0;
		 while(i<arr1.length && j<arr2.length)
		combine[k++]=arr1[i]<arr2[j]?arr1[i++]:arr2[j++];
		
		 while(i<arr1.length)
		combine[k++]=arr1[i++];
		
		 while(j<arr2.length)
		combine[k++]=arr2[j++];
		
		
		int temp=0;
		for(int m=0;m<combine.length-1;m++){
		    
		    for(int n=0;n<combine.length-1;n++){
		    temp=combine[n+1];
		    combine[n+1]=combine[n];
		    combine[n]=temp;
		        }
		}
		    for(int n=0;n<combine.length-1;n++){
		    	System.out.print(combine[n]+",");
		    				
		    }
		
		return combine;

		
	}
	

}

