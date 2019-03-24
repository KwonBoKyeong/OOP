package oop2018;

public class Point {
	
	/* attributes */
	private int x;
	private int y;
	
	/* constructor */
	public Point() //no-argument constructor
	{
		x = 1;
		y = 1;
	}
	
	public Point(int a, int b) //full-argument constructor
	{
		x = a;
		y = b;
	}
	
	public Point(int a) //partial-argument constructor
	{
		x = a;
		y = a;
	}
	
	/* setter and getter */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	/* toString() */
	public String toString()
	{
		return("Position is (" + this.x + " , " + this.y + ")");
	}

	
}
