package lab3;

public class Cube extends Box {
	Cube(double s){
		super(s,s,s);
	}
	
	@Override 
	public void setLength(double l) {
		if (getLength() != l) {
			setSide(l);
		}
	}
	@Override 
	public void setWidth(double w) {
		if (getWidth() != w) {
			setSide(w);
		}
	}
	@Override 
	public void setHeight(double h) {
		if (getHeight() != h) {
			setSide(h);
		}
	}
	private void setSide(double s) {
		if (s <= 0) {
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			System.out.println( "ERROR:: " + stackTraceElements[2].getMethodName().substring(3) + " must be greater than 0");
		}
		else {
			super.setLength(s);
			super.setHeight(s);
			super.setWidth(s);
		}
	}
	public double getSide() {
		return (this.getLength());
	}
}

