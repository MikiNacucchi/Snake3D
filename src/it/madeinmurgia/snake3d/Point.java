package it.madeinmurgia.snake3d;

import java.util.HashMap;
import java.util.Map.Entry;


public class Point {	

	HashMap<String, Axis> axes = new HashMap<String, Point.Axis>();
	
	public Point(HashMap<String, Integer> axesMap,int maxValue) {
		for (Entry<String, Integer> map : axesMap.entrySet()) {
			axes.put(map.getKey(), new Axis(map.getValue(), maxValue));			
		}
	}
	
	public void incAxis(String axis){
		axes.get(axis).setValue(axes.get(axis).getValue() +1);
	}
	public void decAxis(String axis){
		axes.get(axis).setValue(axes.get(axis).getValue() -1);
	}
	
	
	class Axis{
		private int value, maxValue;
		
		public Axis(int value, int maxValue) {
			this.value		=	value;
			this.maxValue	=	maxValue;
		}
		
		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * @param value the value to set
		 */
		public void setValue(int value) {
			this.value = (value + maxValue) % maxValue;
		}

		
	}
}
