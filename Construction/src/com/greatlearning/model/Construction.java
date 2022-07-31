package com.greatlearning.model;

import java.util.LinkedList;

public class Construction {

	private int noOfFloors;
	private LinkedList<Integer> l1 = new LinkedList<>();

	public Construction() {
		// TODO Auto-generated constructor stub
		noOfFloors = 0;
		
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public LinkedList<Integer> getL1() {
		return l1;
	}

	public void addFloors(int floor) {
		l1.add(floor);

		}
	
	public void iterateThroughList() {
		
		
	}

	
	}
	
	
	


