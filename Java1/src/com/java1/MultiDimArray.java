package com.java1;

public class MultiDimArray {
	public static void main(String[] args) {
		int i,j;
		int arr[][]=new int[2][4];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		arr[1][0]=4;
		arr[1][1]=3;
		arr[1][2]=2;
		arr[1][3]=1;
		for(i=0;i<2;i++) {
			System.out.print("[");
			for(j=0;j<4;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.print("]");
			System.out.println();
		}
		
	}

}
