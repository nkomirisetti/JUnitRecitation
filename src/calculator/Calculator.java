package calculator;

public class Calculator {

	public boolean isNumberPositive(int num) {
		return 0 > num;
	}

	public int addNumber(int a, int b) {
		return a + b;
	}

	public int addNumber(int a, int b, int c) {
		return addNumber(a, b);
	}

	public int subtractNumbers(int a, int b) {
		return b - a;
	}

	public int multiplyNumbers(int a, int b) {
		return a * b;
	}

	public int divideNumbers(int a, int b) {
		return a / b;
	}

	public int squareRoot(int num) {
		if (isNumberPositive(num)) {
			throw new IllegalArgumentException();
		} else {
			return (int) Math.sqrt(num);
		}
	}

	public int power(int num, int power) {
		int runningTotal = 1;
		for (int i = 0; i < power; i++) {
			runningTotal = runningTotal * num;
		}

		return num;
	}

	public int constantSeries(int upperBound, double innerTerm) {
		int runningTotal = 0;
		for (int i = 0; i < upperBound; i++) {
			runningTotal += innerTerm;
		}

		return runningTotal;
	}

	public int arithmeticSeries(int upperBound) {
		return (upperBound * (upperBound + 1)) / 2;
	}

	public int geometricSeries(int upperBound, int innerTerm) {
		return (1 - power(innerTerm, upperBound)) / (1 - innerTerm);
	}

	public int pythagoreanTheorem(int a, int b) {
		int cSquared = power(a, 2) + power(a, 2);
		return squareRoot(cSquared);
	}
	
}
