import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTest {

    @Test
    public void test1() {
        PowerCalculator power_calculator = new PowerCalculator(new PowerImplementor1(new MultImplementor1()));
        assertEquals(32, power_calculator.calculate(2, 5));
        assertEquals(81, power_calculator.calculate(3, 4));
        assertEquals(1, power_calculator.calculate(100, 0));
        assertEquals(24, power_calculator.calculate(24, 1));
        assertEquals(24 * 24, power_calculator.calculate(24, 2));
    }

    @Test
    public void test2() {
        PowerCalculator power_calculator = new PowerCalculator(new PowerImplementor1(new MultImplementor2()));
        assertEquals(32, power_calculator.calculate(2, 5));
        assertEquals(81, power_calculator.calculate(3, 4));
        assertEquals(1, power_calculator.calculate(100, 0));
        assertEquals(24, power_calculator.calculate(24, 1));
        assertEquals(24 * 24, power_calculator.calculate(24, 2));
    }

    @Test
    public void test3() {
        PowerCalculator power_calculator = new PowerCalculator(new PowerImplementor2(new MultImplementor1()));
        assertEquals(32, power_calculator.calculate(2, 5));
        assertEquals(81, power_calculator.calculate(3, 4));
        assertEquals(1, power_calculator.calculate(100, 0));
        assertEquals(24, power_calculator.calculate(24, 1));
        assertEquals(24 * 24, power_calculator.calculate(24, 2));
    }

    @Test
    public void test4() {
        PowerCalculator power_calculator = new PowerCalculator(new PowerImplementor2(new MultImplementor2()));
        assertEquals(32, power_calculator.calculate(2, 5));
        assertEquals(81, power_calculator.calculate(3, 4));
        assertEquals(1, power_calculator.calculate(100, 0));
        assertEquals(24, power_calculator.calculate(24, 1));
        assertEquals(24 * 24, power_calculator.calculate(24, 2));
    }
}
