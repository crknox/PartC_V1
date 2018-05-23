package mycontroller;

import java.util.ArrayList;

import utilities.Coordinate;

public class LavaStrategy implements Strategy{
	private ArrayList<Coordinate> healthTiles;
	private float currentHealth;
	private int desiredKey; //key that we are currently searching for
	private ArrayList<Integer> keysFound; //the numbers of any keys that are seen in area
	
	public LavaStrategy(ArrayList<Coordinate> healthTiles,float currentHealth,int desiredKey) {
		this.healthTiles=healthTiles;
		this.currentHealth=currentHealth;
		this.desiredKey=desiredKey;
	}

	@Override
	public ArrayList<Coordinate> adviseMove() {
		// TODO Look for any keys that are in view, if they are the key that we are looking for 
		// and we have adequate health to reach it, go towards it. Will generally only indicate one potential Coordinate:
		// i.e. will return an arrayList of length 1.
		return null;
	}
}
