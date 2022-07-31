package com.greatlearning.functionality;

import java.util.LinkedList;

import com.greatlearning.model.Construction;

public class Functionality extends Construction {

	public int temp=0,j=0;
	
	public void findAptFloor(LinkedList<Integer>l1,int i){
		
		
		while (j < l1.size() && j<i) {

			if (l1.get(j) == temp - 1) {

				temp = l1.get(j);
				System.out.print(temp+" ");
				j = 0;
			} else {

				j++;
			}
		
		}

	}

	public void iterateThroughList() {
		
		
		
		for (int i=0;i<getL1().size();i++) {
			
			System.out.print("Day "+(i+1)+": ");
			
			if (getL1().get(i) == getNoOfFloors()) {

				temp = getL1().get(i);
				System.out.print(temp+" ");
			
				findAptFloor(getL1(),i);
			}
			
			if (getL1().get(i) == temp - 1) {
					
				temp=getL1().get(i);
				System.out.print(temp+" ");
				
				j=0;
				
				findAptFloor(getL1(),i);
				
			}
			
			System.out.println("  ");
	
		}
		
		
	}
}
