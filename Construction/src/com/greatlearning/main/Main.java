package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.functionality.Functionality;
import com.greatlearning.model.Construction;

public class Main {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Construction c1=new Functionality();
		
		System.out.println("Enter total number of floors");
		c1.setNoOfFloors(sc.nextInt());
		
		
		for (int i = 0; i < c1.getNoOfFloors(); i++) {

			System.out.println("Enter the floor size on " + (i + 1) + " day");
			c1.addFloors(sc.nextInt());
		
		}
		
		
		//System.out.println(c1.getL1());
		
		c1.iterateThroughList();
		
	
	}	
	
	
}
