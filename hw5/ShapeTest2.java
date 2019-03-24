package hw5;

public class ShapeTest2 {
	
	public static void main(String[] args)
	{
		// 객체 배열 생성 
		Shape[] myShapeList = new Shape[12];

		// 배열의 element object 생성 
		for (int i=0; i<myShapeList.length; i++)
		{
			if(i%4 == 0)
				myShapeList[i] = new Shape();
			else if(i%4 == 1)
				myShapeList[i] = new Circle();
			else if(i%4 == 2)
				myShapeList[i] = new Rectangle();
			else if(i%4 == 3)
				myShapeList[i] = new Square();
		}
		
		// getter & setter methods 를 이용한 값 변경
		for(int i=4; i<8; i++)
		{
			myShapeList[i].setPosition(new Point(10, 50));
			myShapeList[i].getPosition();		
		}
		
		
		for(int i=8; i<12; i++)
		{
			myShapeList[i].setPosition(new Point(77));
			myShapeList[i].getPosition();
		}
		
		((Circle) myShapeList[1]).setRadius(3);
		
		((Rectangle) myShapeList[2]).setHeight(200);
		
		((Square) myShapeList[3]).setSide(100);
		
		((Circle) myShapeList[9]).setRadius(15);
		
		((Rectangle) myShapeList[10]).setHeight(150);
		
		((Square) myShapeList[11]).setSide(150);
		
		
		// 특수 methods (각 도형들)에 접근 (subclass 의 특수 메소드를 이용하기)
		for(int i=0; i<myShapeList.length; i++)
		{
			//myShapeList[i].increaseRadius(); //compile error
			
			if(myShapeList[i] instanceof Circle)
			{
				Circle c = (Circle) myShapeList[i]; //Circle type으로 Downcasting 
				c.increaseRadius(5);
			}
			
			else if(myShapeList[i] instanceof Rectangle)
			{
				Rectangle r = (Rectangle) myShapeList[i]; //Rectangle type으로 Downcasting
				r.changeShapes();
			}
			
			else if(myShapeList[i] instanceof Square)
			{
				Square s = (Square) myShapeList[i]; //Square type으로 Downcasting
				s.increaseSide(10);
			}
			
			System.out.println("면적은 " + myShapeList[i].toString());
			System.out.println();
		}
		
	}
}
