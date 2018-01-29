public class NewMath {
	public static void main(String[] args) {
		short s = 123; //short - min val = -32,768 max = 32,768
		long l = 12345678910L; //long - very large numbers (max = 2^63) *have to add 'L'
		double d = 123.4d; //double - a floating point (if its a float you'd put 'f')

		//subtraction
		System.out.println();
		System.out.println("s - s = " + (s - s)); //format to see the numbers and their outcome
		System.out.println("s - l = " + (s - l));
		System.out.println("s - d = " + (s - d));
		System.out.println("l - l = " + (l - l));
		System.out.println("l - s = " + (l - s));
		System.out.println("l - d = " + (l - d));
		System.out.println("d - d = " + (d - d));
		System.out.println("d - l = " + (d - l));
		System.out.println("d - s = " + (d - s));

		//multiplication
		System.out.println();
		System.out.println("s * s = " + (s * s));
		System.out.println("s * l = " + (s * l));
		System.out.println("s * d = " + (s * d));
		System.out.println("l * l = " + (l * l));
		System.out.println("l * s = " + (l * s));
		System.out.println("l * d = " + (l * d));
		System.out.println("d * d = " + (d * d));
		System.out.println("d * l = " + (d * l));
		System.out.println("d * s = " + (d * s));



	}
}