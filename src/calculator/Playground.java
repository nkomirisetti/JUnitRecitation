package calculator;

public class Playground {

	public static void main(String[] args) {
		Calculator calc = new CalculatorImpl();
		System.out.println(calc.addNumber(1, 2));
	}
}
