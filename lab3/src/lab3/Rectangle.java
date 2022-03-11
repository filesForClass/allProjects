package lab3;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	Rectangle(double l, double w){
		length = l;
		width = w;
		super.setName("Unknown");
		super.setColor("White");
	}
	
	Rectangle(double l, double w, String n, String c){
		length = l;
		width = w;
		super.setName(n);
		super.setColor(c);
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

}
