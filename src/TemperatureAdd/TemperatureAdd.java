package TemperatureAdd;

import java.util.Scanner;

public class TemperatureAdd {
	
	static int n1, n2;
	static int[] list, list2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		list = new int[n1 + 1];
		list2 = new int[n1 - n2 + 1];
		
		list[0] = 0;
		for(int i = 1; i < n1 + 1; i++) {
			list[i] = sc.nextInt();
			if(i < n2 + 1) {
				list2[0] += list[i];
			}
		}
		
		for(int i = 1; i < n1 - n2 + 1; i++) {
			list2[i] = list2[i - 1] - list[i] + list[i + n2];
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n1 - n2 + 1; i++) {
			if(max < list2[i]) {
				max = list2[i];
			}
		}
		
		System.out.print(max);
	}

}
