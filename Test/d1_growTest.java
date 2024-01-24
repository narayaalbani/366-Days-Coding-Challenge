import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class d1_growTest {
    @Test
    public void testSomething() {
        assertEquals(6, d1_grow.grow(new int[]{1,2,3}));
        assertEquals(16, d1_grow.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, d1_grow.grow(new int[]{2,2,2,2,2,2}));
    }
}