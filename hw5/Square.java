package hw5;

public class Square extends Shape{
	
	/* attributes */
	protected Point position;
	protected float side;

	/* constructor */
	public Square() //no-argument constructor
	{
		this(new Point(20,30), 300);
	}
	
	public Square(Point pos, float r) //full-argument constructor
	{
		super(pos);
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
		return(super.toString() + "Square object at " + this.position + " with the side of " + this.side + ", and the Square's area is " + this.getArea());
	}
	
	/* increaseSide() */
	public void increaseSide(int x)
	{
		this.side += x;
	}
}
