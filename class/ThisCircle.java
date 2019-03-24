package oop2018;

public class ThisCircle {

	
	/* attributes */
	Point center;
	float radius;
	
	/* constructor */
	public ThisCircle()
	{
		this(new Point(), 10);
	}
	
	public ThisCircle(Point pos, float r)
	{
		this.center = pos;
		this.radius = r;
	}
	
	public ThisCircle(float r)
	{
		this(new Point(), r);
	}
	

	
	
}
