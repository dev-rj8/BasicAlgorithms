package com.sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	
	public int[] sort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		
		for(int pi=1; pi<arr.length; pi++) {
			
			int si = pi;
			
			while(si>0) {
				if(arr[si] < arr[si-1]) {
					int temp = arr[si];
					arr[si] = arr[si-1];
					arr[si-1] = temp;
					si--;
					System.out.println(Arrays.toString(arr));
				}
				else {
					break;
				}
			}
		}
		return arr;
	}
		
	public static void main(String[] args) {
		InsertionSort algo = new InsertionSort();
		int arr[] = new int[] {19,8,17,600,121,4,30,2,17};
		System.out.println("Sorted array in ascending order" +Arrays.toString(algo.sort(arr)));
	}
}
