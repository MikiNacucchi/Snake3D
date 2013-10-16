package it.madeinmurgia.snake3d;

public class Snake {
	int x=0, y=0, z=0;
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}

	public static final int DIR_XP = 0;
	public static final int DIR_XM = 1;
	public static final int DIR_YP = 2;
	public static final int DIR_YM = 3;
	public static final int DIR_ZP = 4;
	public static final int DIR_ZM = 5;
	
	private int lastDir = -1;
	public void nextPosition(int newDir) {
		switch (newDir) {
		case DIR_XP:
			x = f(x++);
			break;
		case DIR_XM:
			x = f(x--);
			break;
		case DIR_YP:
			y = f(y++);
			break;
		case DIR_YM:
			y = f(y--);
			break;
		case DIR_ZP:
			z = f(z++);
			break;
		case DIR_ZM:
			z = f(z--);
			break;

		default:
			break;
		}	
		
		lastDir = newDir;
	}
	public void nextPosition(){
		nextPosition(lastDir);
	}
	
	private int f(int asse){
		return (asse+8)%8;
	}
	
}
