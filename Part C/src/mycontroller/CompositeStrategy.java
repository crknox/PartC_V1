package mycontroller;

import java.util.ArrayList;

import utilities.Coordinate;

public class CompositeStrategy implements Strategy{
	private ArrayList<Coordinate> tilesinView;
	private float currentHealth;
	private int desiredKey;
	
	public CompositeStrategy (ArrayList<Coordinate> tilesinView,float currentHealth,int desiredKey) {
		this.tilesinView = tilesinView;
		this.currentHealth = currentHealth;
		this.desiredKey = desiredKey;
	}
	
	@Override
	public ArrayList<Coordinate> adviseMove() {
		// TODO Creates Strategies for all the relevant tile types in view
		// composes these strategies to output the optimum direction for the car to move
		return null;
	}


}

