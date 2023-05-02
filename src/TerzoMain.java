
public class TerzoMain {
	public static double rectangle(double a, double b) {
		return a * b;
	}
		
	public static int evenOrOdd(int c) {
		return c % 2 == 0 ? 0 : 1;
    }
	
	public static double triangle(double d, double e, double f) {
		double s = (d + e + f)/2;
		double area = Math.sqrt(s * (s - d) * (s - e) * (s -f));
		return area;
	}
	
	
	public static void main(String[] args) {
		System.out.println(rectangle(1.5 , 2));
		System.out.println(evenOrOdd(3));
		System.out.println(triangle(1.5, 3, 4));
	}
}
