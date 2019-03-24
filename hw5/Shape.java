package hw5;

public class Shape{
	
	/* attribute */
	protected Point position;
	
	/* constructor */
	public Shape()  //no-argument constructor 
	{
		position = new Point(20,30);
	}
	
	public Shape(Point position) //full-argument constructor
	{
		this.position = position;
	}

	/* setter & getter methods*/
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
	
	/* getArea() */
	public double getArea()
	{
		return 0.0;
	}
	
	/* toString() */
	public String toString()
	{
		return("SHAPE class at position (x,y)=(" + position.getX() + "," + position.getY() + ") ");
	}
	
	
} //end of class Shape
