package oop2018;

public class ShapeTest1 {

	public static void main(String[] args)
	{
		
		// Command Line Arguments 처리하는 방법 
		// int number = Integer.parseInt(args[0]);  

		/* Point */
		Point pt1 = new Point();
		System.out.println(pt1.toString());
		
		Point pt2 = new Point(10, 50);
		System.out.println(pt2.toString()); 
		
		Point pt3 = new Point(77);
		System.out.println(pt3.toString());
		
		System.out.println();
		
		
		/* Circle */
		Circle cir1 = new Circle();
		System.out.println(cir1.toString());
		
		Circle cir2 = new Circle(51);
		System.out.println(cir2.toString());
		
		Circle cir3 = new Circle(pt1, 717);
		System.out.println(cir3.toString());
		
		System.out.println();
		
		
		/* Rectangle */
		Rectangle rec1 = new Rectangle();
		System.out.println(rec1.toString());
		
		Rectangle rec2 = new Rectangle(150, 40);
		System.out.println(rec2.toString());
		
		Rectangle rec3 = new Rectangle(pt2, 30, 20);
		System.out.println(rec3.toString());
		
		System.out.println();
		
		
		
		/* Square */
		Square squ1 = new Square();
		System.out.println(squ1.toString());
		
		Square squ2 = new Square(50);
		System.out.println(squ2.toString());
		
		Square squ3 = new Square(pt3, 40);
		System.out.println(squ3.toString());
		
	}
}
