package oop2018;

public class Rectangle {
	
	/* attributes */
	Point position;
	float height;
	float width;
	
	/* constructor */
	public Rectangle() //no-argument constructor
	{
		this(new Point(10,10), 400, 300);
	}
	
	public Rectangle(Point pos, float r1, float r2) //full-argument constructor
	{
		this.position = pos;
		this.height = r1;
		this.width = r2;
	}
	
	public Rectangle(float r1, float r2) //partial-argument constructor
	{
		this(new Point(20,30), r1, r2);
	}

	
	/* setter and getter */
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	/* methods */
	public double getArea()
	{
		return this.height * this.width;
	}
	
	/* toString() */
	public String toString()
	{
		return("Rectangle object at " + this.position + " with the height of " + this.height + " , the width of " + this.width + ", and the Rectangle's area is " + this.getArea());
	}
	
	
}
