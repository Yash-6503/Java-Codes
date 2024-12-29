/*
Program to Create two user-defined functional interfaces and perform operations as per Question.
*/

@FunctionalInterface
interface BooleanOperation{
	boolean evaluate(int a, int b);
}

@FunctionalInterface
interface DoubleFunction{
	double calculate(double x, double y);
}


public class Example3 {

	public static void main(String[] args) 
	{
		BooleanOperation bool = new BooleanOperation() {

			@Override
			public boolean evaluate(int a, int b) {
				if(a%3 == 0 && b%5==0 && (a+b)%2==0) {
					return true;
				}else {					
					return false;
				}
			}
			
		};
		
		System.out.println(bool.evaluate(2, 5));
		System.out.println(bool.evaluate(3, 5));

		DoubleFunction d = new DoubleFunction() {
			
			@Override
			public double calculate(double x, double y) {
				if(x > 0 && y < 0 && x%2==0) {
					if(y == 0) {						
						return (x*x*x) / 1;
					}else {
						return (x*x*x) / y;
					}
				}else if(x < 0 && y > 0 && y%2!=0) {
					return x*y;
				}else {
					return x+y;
				}
				
			}
		};
		
		System.out.println(d.calculate(4, 0));
		System.out.println(d.calculate(-1, 5));
		System.out.println(d.calculate(5, 5));

	}
}

/*
false
true
4.0
-5.0
10.0
*/