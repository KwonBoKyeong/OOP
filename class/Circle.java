package oop2018;

public class Circle{

	/* attributes */
	public Point center;
	public float radius;
	
	/* constructor */
	public Circle() //no-argument constructor
	{
		this(new Point(10,10), 300);
	}
	
	public Circle(Point pos, float r) //full-argument constructor
	{
		this.center = pos;
		this.radius = r;
	}
	
	public Circle(float r) //partial-argument constructor
	{
		this(new Point(20,30), r);
	}
	
	/* setter and getter */
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	
	/* methods */
	public double getArea()
	{
		return this.radius*this.radius*3.14;
	}
	
	/* toString() */
	public String toString()
	{
		return("Circle object at " + this.center + " with the radius of " + this.radius + ", and the Circle's area is " + this.getArea());
		
	}
		
}
