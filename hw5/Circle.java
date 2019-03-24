package hw5;

public class Circle extends Shape{

	/* attributes */
	private float radius;
	
	/* constructor */
	public Circle() //no-argument constructor
	{
		this(new Point(20,30), 300);
	}
	
	public Circle(Point pos, float r) //full-argument constructor
	{
		super(pos);
		this.radius = r;
	}
	
	public Circle(float r) //partial-argument constructor
	{
		this(new Point(20,30), r);
	}
	
	/* setter and getter */
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	
	/* getArea() */
	public double getArea()
	{
		return this.radius*this.radius*3.14;
	}
	
	/* toString() */
	public String toString()
	{
		return(super.toString() + "Circle object at with the radius of " + this.radius + ", and the Circle's area is " + this.getArea());
		
	}
	
	/* increaseRadius() */
	public void increaseRadius(int x)
	{
		this.radius += x;

	}
		
}
