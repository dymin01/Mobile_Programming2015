package kr.ac.kookmin.shape;

public abstract class Shape {
	
	protected Point center;
	
	protected Shape(Point center){
		this.center = center;
	}

	public abstract Rectangle getBounds();

	public Point getCenter() {
		// TODO Auto-generated method stub
		return center;
	}

	public abstract void draw(Graphics g);
	
}