import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("test case 0+0")
    public void testAdd0and0() {
        int firstNumber=0;
        int secondNumber=0;
        int expected=0;
        int result= SimpleCalculator.add(firstNumber,secondNumber);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test case 0+1")
    public void testAdd0and1() {
        int firstNumber=0;
        int secondNumber=1;
        int expected=1;
        int result= SimpleCalculator.add(firstNumber,secondNumber);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test case 0-1")
    public void testSub0and1() {
        int firstNumber=0;
        int secondNumber=1;
        int expected= -1;
        int result= SimpleCalculator.sub(firstNumber,secondNumber);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test case 1-0")
    public void testSub1and0() {
        int firstNumber=1;
        int secondNumber=0;
        int expected= 1;
        int result= SimpleCalculator.sub(firstNumber,secondNumber);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test case 1*0")
    public void testMulti1and0() {
        int firstNumber=1;
        int secondNumber=0;
        int expected= 0;
        int result= SimpleCalculator.multi(firstNumber,secondNumber);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test case 10*10")
    public void testMulti10and10() {
        int firstNumber=10;
        int secondNumber=10;
        int expected= 100;
        int result= SimpleCalculator.multi(firstNumber,secondNumber);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test case 10/10")
    public void testDiv10and10() {
        int firstNumber=10;
        int secondNumber=10;
        int expected= 1;
        int result= SimpleCalculator.div(firstNumber,secondNumber);
        assertEquals(expected,result);
    }


}