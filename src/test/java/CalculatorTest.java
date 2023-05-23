import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.lessons.java.calculator.Calculator;

public class CalculatorTest {

	Calculator calc = new Calculator();

	float x = 20;
	float y = 10;

	@RepeatedTest(10)
	public void addTest() throws Exception {
		float exp = 30;
		float result = calc.add(x, y);
		assertEquals(exp, result, "Addizione");
	}

	@RepeatedTest(10)
	public void asubtractTest() throws Exception {
		float exp = 10;
		float result = calc.subtract(x, y);
		assertEquals(exp, result, "Sottrazione");
	}

	@RepeatedTest(10)
	public void divideTest() throws Exception {
		float exp = 2;
		float result = calc.divide(x, y);
		assertEquals(exp, result, "Divisione");
	}

	@RepeatedTest(10)
	public void multiplyTest() throws Exception {
		float exp = 200;
		float result = calc.multiply(x, y);
		assertEquals(exp, result, "Moltiplicazione");
	}
}
