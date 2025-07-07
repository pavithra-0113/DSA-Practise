package com;

import java.util.Scanner;

public class SecondLargest {
	
	static int getSecondLargest(int[] nums,int n) {
		
		int largest=-1; int secondlargest=-1;
		
		for(int i=0;i<n;i++) {
			if(nums[i]>largest) {
				secondlargest=largest;
				largest=nums[i];
			}
			 if(nums[i]<largest && nums[i]>secondlargest) {
				secondlargest=nums[i];
			}
		}
		return secondlargest;
	}

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
 

		int n=sc.nextInt();
		int[] nums=new int[n];
		
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println(getSecondLargest(nums,n));
		
	}

}
