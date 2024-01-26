import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestChallenge {
    @Nested
    class d1_growTest {
        @Test
        public void testSomething() {
            assertEquals(6, d1_grow.grow(new int[]{1, 2, 3}));
            assertEquals(16, d1_grow.grow(new int[]{4, 1, 1, 1, 4}));
            assertEquals(64, d1_grow.grow(new int[]{2, 2, 2, 2, 2, 2}));
        }
    }

    @Nested
    class d2_reversedTest {
        @Test
        public void simpleTest() {
            assertArrayEquals(new int[]{5,4,3,2,1}, d2_reversed.reverse(5));
        }

    }

    @Nested
    class d3_heroTest {
        @Test @DisplayName("A true hero")
        void aTrueHero() {
            assertTrue(d3_hero.hero(10, 5), "With 10 bullets and 5 dragons");
            assertTrue(d3_hero.hero(100, 40), "With 100 bullets and 40 dragons");
        }

        @Test @DisplayName("A false hero")
        void aFalseHero() {
            assertFalse(d3_hero.hero(4, 5), "With 4 bullets and 5 dragons");
            assertFalse(d3_hero.hero(1500, 751), "With 1500 bullets and 751 dragons");
            assertFalse(d3_hero.hero(0, 1), "With 0 bullets and 1 dragon");
            assertFalse(d3_hero.hero(7, 4), "With 7 bullets and 4 dragons");
        }
    }

    @Nested
    class d4_smashTest {
        @Test
        public void validate() {
            assertEquals("Bilal Djaghout", d4_smash.smash("Bilal", "Djaghout"));
        }

        @Test
        public void validateEmpty() {
            assertEquals("", d4_smash.smash());
        }


        @Test
        public void validateOneWord() {
            assertEquals("Bilal", d4_smash.smash("Bilal"));
        }
    }

    @Nested
    class d5_multiplesTest {
        @Test
        public void test() {
            assertEquals(23, new d5_multiples().solution(10));
        }
    }

    @Nested
    class d6_fuelTest {
        @Test
        public void testSomething() {
            assertTrue(d6_fuel.zeroFuel(50, 25, 2));
            assertFalse(d6_fuel.zeroFuel(100, 50, 1));
        }
    }

    @Nested
    class d7_DNAtoRNATest {
        @Test
        public void testDna() {
            d7_DNAtoRNA b = new d7_DNAtoRNA();
            assertEquals("UUUU", b.dnaToRna("TTTT"));
        }

        @Test
        public void testDna2() {
            d7_DNAtoRNA b = new d7_DNAtoRNA();
            assertEquals("GCAU", b.dnaToRna("GCAT"));
        }
    }

    @Nested
    class d8_countTest {
        @Test
        public void fixedTests() {
            assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, d8_count.countBy(1,10));
            assertArrayEquals(new int[] {2,4,6,8,10}, d8_count.countBy(2,5));
            assertArrayEquals(new int[] {3,6,9,12,15,18,21}, d8_count.countBy(3,7));
            assertArrayEquals(new int[] {50,100,150,200,250}, d8_count.countBy(50,5));
            assertArrayEquals(new int[] {100,200,300,400,500,600}, d8_count.countBy(100,6));
        }
    }
}