package mycontroller;

import java.util.ArrayList;

import utilities.Coordinate;

// Determines whether we should move towards any Health Tiles in direct view
public class HealthStrategy implements Strategy{
	private ArrayList<Coordinate> healthTiles;
	private float currentHealth;
	
	public HealthStrategy(ArrayList<Coordinate> healthTiles,float currentHealth) {
		this.healthTiles=healthTiles;
		this.currentHealth=currentHealth;
	}

	@Override
	public ArrayList<Coordinate> adviseMove() {
		// TODO Uses the current health to decide whether moving towards any health tiles in view is a priority
		// If no health tiles are in view or current health is not low, return null.
		return null;
	}
}
