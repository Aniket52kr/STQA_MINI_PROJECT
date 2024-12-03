package programminghub;

import static org.junit.Assert.*;

import org.junit.Test;

import programminghub.Calculator;

public class MulTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
        int result = calculator.mul(30, 20);
        assertEquals(600, result);
	}

}
