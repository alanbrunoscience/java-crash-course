package entities;

public class Triangle {

	public double[] sides = new double[3];

	public boolean isValid() {
		double a = sides[0], b = sides[1], c = sides[2];
		return a + b > c && a + c > b && b + c > a;
	}

	public double area() {
		double a = sides[0], b = sides[1], c = sides[2];
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
