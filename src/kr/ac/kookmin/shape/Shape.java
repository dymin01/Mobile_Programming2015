package kr.ac.kookmin.shape;

public class Shape {
	
	protected Point center;
	
	protected Shape(Point center){
		this.center = center;
	}

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	public Point getCenter() {
		// TODO Auto-generated method stub
		return center;
	}

	public void draw(Graphics g) {}
	
}
