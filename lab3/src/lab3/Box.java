package lab3;

public class Box extends Shape {
		
		private double height;
		private double width;
		private double length;
		
		Box(double h, double w, double l){
			setHeight(h);
			setWidth(w);
			setLength(l);
		}
		
		Box(double s){
			
			//height = width = length = s;
			this(s, s, s);
			
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getWidth() {
			return width;
		}
		
		public double getLength() {
			return length;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public void setLength(double length) {
			this.length = length;
		}
		
		public double getVolume() {
			
			return (getHeight()*getWidth()*getLength());
		}
		
		public double getSurfaceArea() {
			
			return 2*((getLength()*getWidth()+getLength()*getHeight()+getHeight()*getWidth()));
			
		}
		
		public void printBox() {
			if( height <= 0 || width <= 0 || length <= 0) {	
				System.out.printf("Box(%f,%f,%f) contains invalid properities",getHeight(), getLength(), getWidth());
			}
			else {
				System.out.println("Length = " + getLength() + " \n Width = " + getWidth() + "\n Height = " + getHeight() + "\n Volume = " + getVolume() + "\n Surface Area = " + getSurfaceArea());
			}
		}
		
		
		

}

