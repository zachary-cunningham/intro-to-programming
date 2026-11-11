import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ss.week1.Fibonnaci;

import java.util.Scanner;

public class FibonacciTest {
    @Test
    void fibonacciTest() {
        assertEquals(5, Fibonnaci.fibonacci(5));
        assertEquals(3, Fibonnaci.fibonacci(4));
        assertEquals(2, Fibonnaci.fibonacci(3));
        assertEquals(1, Fibonnaci.fibonacci(2));
        assertEquals(1, Fibonnaci.fibonacci(1));
        assertEquals(0, Fibonnaci.fibonacci(0));
        assertEquals(701408733, Fibonnaci.fibonacci(44));
    }
}
