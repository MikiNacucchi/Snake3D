package it.baobab.makerlab.snake3d;

import java.util.ArrayList;

public class CubeLed {
	final static public int CUBE_AXIS_DIM = 8;
	final static public int CUBE_AXES = 3;	
		
	private boolean cube[][][];
	
	private ArrayList<Short[]> snake;
	private Short[]	apple;
	
	public CubeLed() {		
		snake = new ArrayList<Short[]>();
		
		cube = new boolean[CUBE_AXIS_DIM][CUBE_AXIS_DIM][CUBE_AXIS_DIM];
		
		init();
	}

	
	
	private void init() {//TODO randomize
		snake.add(new Short[]{0, 0, 0}); //TAIL
		
		snake.add(new Short[]{1, 1, 1});
		snake.add(new Short[]{2, 2, 2});
		
		snake.add(new Short[]{3, 3, 3}); //HEAD
		
		for (Short[] ss : snake) {
			cube[ss[0]][ss[1]][ss[2]] = true;
		}
		
		apple = new Short[]{8, 8, 8};
		cube[apple[0]][apple[1]][apple[2]] = true;
	}
	
	
	//TODO Incremento snake 
	
	//TODO Serilaizzazione cubo per trasmission 8x8x8 di boolean => 8x8 di Byte
	


}
