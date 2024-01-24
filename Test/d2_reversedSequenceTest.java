import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class d2_reversedSequenceTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},d2_reversedSequence.reverse(5));
    }

}