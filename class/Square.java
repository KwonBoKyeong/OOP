package oop2018;

public class Square {
	
	/* attributes */
	private Point position;
	private float side;

	/* constructor */
	public Square() //no-argument constructor
	{
		this(new Point(10,10), 300);
	}
	
	public Square(Point pos, float r) //full-argument constructor
	{
		this.position = pos;
		this.side = r;
	}
	
	public Square(float r) //partial-argument constructor
	{
		this(new Point(5, 10), r);
	}

	
	/* setter and getter */
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	
	/* methods */
	public double getArea()
	{
		return this.side * this.side;
	}
	
	/* toString() */
	public String toString()
	{
		return("Square object at " + this.position + " with the side of " + this.side + ", and the Square's area is " + this.getArea());
	}
	
}
