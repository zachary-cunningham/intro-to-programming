package ss;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ss.week1.BrokenFibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrokenFibonacciTest {
    @Test @Disabled
    void fibonacciTestBase() {
        assertEquals(0, BrokenFibonacci.fibonacci(0));
        assertEquals(1, BrokenFibonacci.fibonacci(1));
        assertEquals(1, BrokenFibonacci.fibonacci(2));
    }

    @Test @Disabled
    void fibonacciTestHigher() {
        assertEquals(2, BrokenFibonacci.fibonacci(3));
        assertEquals(3, BrokenFibonacci.fibonacci(4));
        assertEquals(5, BrokenFibonacci.fibonacci(5));
        assertEquals(8, BrokenFibonacci.fibonacci(6));
        assertEquals(13, BrokenFibonacci.fibonacci(7));
        assertEquals(21, BrokenFibonacci.fibonacci(8));
        assertEquals(4181, BrokenFibonacci.fibonacci(19));
        assertEquals(701408733, BrokenFibonacci.fibonacci(44));
    }
}
