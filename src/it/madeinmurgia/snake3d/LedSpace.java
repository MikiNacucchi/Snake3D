package it.madeinmurgia.snake3d;

import java.util.HashMap;
import java.util.Vector;


public class LedSpace {
	public static final String AXIS_X = "x";
	public static final String AXIS_Y = "y";
	public static final String AXIS_Z = "z";
	public static final int AXIS_MAX_VALUE	=	8;
	
	private String[] axesLabel	=	{AXIS_X, AXIS_Y, AXIS_Z};
	private Vector<Point[]> space;
	private HashMap<String, Integer> defaultPoint;
	
		
	public LedSpace() {
		defaultPoint = new HashMap<String, Integer>();
		for (String axis : axesLabel) {
			defaultPoint.put(axis, 0);
		}
		
		buildSpace();	
	}

	private void buildSpace() {
		Point newPoint = new Point(defaultPoint, AXIS_MAX_VALUE);
		
		
	}

}
