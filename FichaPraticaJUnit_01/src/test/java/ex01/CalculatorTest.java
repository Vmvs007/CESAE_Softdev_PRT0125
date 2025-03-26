package ex01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator aMinhaCalculadora;

    @BeforeEach
    void setUp() {
        aMinhaCalculadora = new Calculator("Máquina");
    }

    @Test
    public void addPositiveTest() {
        assertEquals(15, aMinhaCalculadora.add(10, 5));
        assertEquals(105, aMinhaCalculadora.add(90, 15));
    }

    @Test
    public void addNegativeTest() {
        assertEquals(-5, aMinhaCalculadora.add(-3, -2));
        assertEquals(-40, aMinhaCalculadora.add(-50, 10));
        assertEquals(-10, aMinhaCalculadora.add(5, -15));
    }

    @Test
    public void addZeroTest() {
        assertEquals(15, aMinhaCalculadora.add(15, 0));
        assertEquals(105, aMinhaCalculadora.add(0, 105));
        assertEquals(0, aMinhaCalculadora.add(0, 0));
    }

    @Test
    public void addResultZeroTest() {
        assertEquals(0, aMinhaCalculadora.add(15, -15));
        assertEquals(0, aMinhaCalculadora.add(5, -5));
        assertEquals(0, aMinhaCalculadora.add(0, 0));
    }

    @Test
    public void subtractPositiveTest(){
        assertEquals(20,aMinhaCalculadora.subtract(50,30));
        assertEquals(5,aMinhaCalculadora.subtract(13,8));
    }

    @Test
    public void DividePositiveTest(){
        assertEquals(10,aMinhaCalculadora.divide(90,9));
        assertEquals(5,aMinhaCalculadora.divide(25,5));
    }

    @Test
    public void DivideByZeroTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            aMinhaCalculadora.divide(10, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            aMinhaCalculadora.divide(99, 0);
        });
    }

    @Test
    public void operationCountTest(){
        assertEquals(0,aMinhaCalculadora.getOperationCount());

        aMinhaCalculadora.add(10,10);
        aMinhaCalculadora.add(5,2);

        assertEquals(2,aMinhaCalculadora.getOperationCount());

        aMinhaCalculadora.subtract(5,2);
        aMinhaCalculadora.multiply(10,5);
        aMinhaCalculadora.divide(90,5);

        assertEquals(5,aMinhaCalculadora.getOperationCount());
    }
}