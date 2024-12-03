package programminghub;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MulTest {

    @Test
    public void test() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(30, 20);
        assertEquals(600, result);
    }
}
