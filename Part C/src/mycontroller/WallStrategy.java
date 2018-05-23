package mycontroller;

import java.util.ArrayList;

import utilities.Coordinate;

public class WallStrategy implements Strategy{
	private ArrayList<Coordinate> wallTiles;

	public WallStrategy(ArrayList<Coordinate> wallTiles) {
		this.wallTiles = wallTiles;
	}
	
	@Override
	public ArrayList<Coordinate> adviseMove() {
		// TODO Will check what walls are in the area, it will return all directions that do not 
		// cause the car to hit a wall.
		return null;
	}

}
