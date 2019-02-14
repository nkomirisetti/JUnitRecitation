package calculator;

public interface Calculator {
	boolean isNumberPositive(int num);
	int addNumber(int a, int b);
	int addNumber(int a, int b, int c);
	int subtractNumbers(int a, int b);
	int multiplyNumbers(int a, int b);
	int divideNumbers(int a, int b);
	int squareRoot(int num);
	int power(int num, int power);
	int constantSeries(int upperBound, double innerTerm);
	int arithmeticSeries(int upperBound);
	int geometricSeries(int upperBound, int innerTerm);
	int pythagoreanTheorem(int a, int b);
}
