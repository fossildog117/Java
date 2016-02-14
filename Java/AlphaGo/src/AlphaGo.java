
class Rectangle implements Sheep {
	
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Square implements Sheep {
	
	public void draw() {
		System.out.println("Square");
	}
}

class Triangle implements Sheep {
	
	public void draw() {
		System.out.println("Triangle huhuhu");
	}
}

class ShapeFactory {
	
	public Sheep getShape(String shapeType) {
		
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}
	
}

public class AlphaGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// get an object of Circle and call its draw method
		Sheep shape1 = shapeFactory.getShape("TRIANGLE");
		shape1.draw();
		
	}

}
