package part2_Question6;

class DObject {

	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Circle extends DObject {
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends DObject {
	
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

public class MethodTest {
	public static void main(String[] args) {

		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = line;
		
		obj.draw();
		line.draw();
		p.draw();
		r.draw();
		
		DObject rect = new Rectangle();
		DObject circle = new Circle();
		
		rect.draw();
		circle.draw();
	}
}
