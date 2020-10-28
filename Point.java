public class Point {
	private double x,y;

	public Point(double X, double Y) {
		x = X;
		y = Y;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
}