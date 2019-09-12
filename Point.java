public class Point {
	double x;
	double y;
	double z;

	public Point(double x,double y,double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void setPoint(double x,double y,double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double substance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
	}

	public static void main(String[] args) {
		Point p1 = new Point(1.2,7.4,-1.5);
		Point p2 = new Point(-2.0,4.8,3.2);

		System.out.println(p1.substance(p2)==p2.substance(p1));
	}
}
