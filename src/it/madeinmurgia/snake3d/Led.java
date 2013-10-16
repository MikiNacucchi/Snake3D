package it.madeinmurgia.snake3d;

public class Led {
	public Point point;
	private boolean status = false;
	
	private static final boolean ON = true;
	private static final boolean OFF = false;
	
	public Led(Point p) {
		this.point	=	p;
		this.status	=	OFF;
	}
	public Led(Point p, boolean status) {
		this.point	=	p;
		this.status =	status;
	}
	
	public boolean isOn(){
		return status;
	}
	public void on(){
		status = ON;
	}
	public void off(){
		status = OFF;
	}
	public void toggle(){
		status = !status;
	}
}
