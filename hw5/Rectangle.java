package hw5;

public class Rectangle extends Shape{
	
	/* attributes */
	protected Point position;
	protected float height;
	protected float width;
	
	/* constructor */
	public Rectangle() //no-argument constructor
	{
		this(new Point(20,30), 400, 300);
	}
	
	public Rectangle(Point pos, float r1, float r2) //full-argument constructor
	{
		super(pos);
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
		return(super.toString() + "Rectangle object at " + this.position + " with the height of " + this.height + " , the width of " + this.width + ", and the Rectangle's area is " + this.getArea());
	}
	
	/* changeShapes() */
	public void changeShapes()
	{
		float tmp = this.height;
		this.height = this.width;
		this.width = tmp;
	}
	
	
}
