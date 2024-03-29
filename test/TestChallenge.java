import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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

    @Nested
    class d9_countSheepTest {
        @Test
        public void testSomething() {
            assertEquals("", d9_countSheep.countingSheep(0));
            assertEquals("1 sheep...", d9_countSheep.countingSheep(1));
            assertEquals("1 sheep...2 sheep...", d9_countSheep.countingSheep(2));
            assertEquals("1 sheep...2 sheep...3 sheep...", d9_countSheep.countingSheep(3));
        }
    }

    @Nested
    class d10_minMaxTest {
        private final d10_minMax kata;

        d10_minMaxTest() {
            kata = new d10_minMax();
        }

        @Test
        public void testExamples() {
            assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
            assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
            assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
            assertEquals(5, kata.max(new int[]{5}));
        }
    }

    @Nested
    class d11_sumMinMaxTest {
        @Test
        public void BasicTests() {
            assertEquals(16, d11_sumMinMax.sum(new int[] { 6, 2, 1, 8, 10}));
        }
    }

    @Nested
    class d12_factorialTest {
        private d12_factorial fact;

        @BeforeEach
        public void initFactorial() {
            fact = new d12_factorial();
        }

        @AfterEach
        public void afterFactorial() {
            fact = null;
        }

        @Test
        public void test_factorial0() {
            assertEquals(1, fact.factorial(0));
        }

        @Test
        public void test_factorial3() {
            assertEquals(6, fact.factorial(3));
        }

        @Test
        public void test_factorial5() {
            assertEquals(120, fact.factorial(5));
        }
    }

    @Nested
    class d13_bitCountingTest {
        @Test
        public void testGame() {
            assertEquals(5, d13_bitCounting.countBits(1234));
            assertEquals(1, d13_bitCounting.countBits(4));
            assertEquals(3, d13_bitCounting.countBits(7));
            assertEquals(2, d13_bitCounting.countBits(9));
            assertEquals(2, d13_bitCounting.countBits(10));
        }
    }

    @Nested
    class d14_convertIntToStrTest {
        @Test
        public void tests() {
            assertEquals("67", d14_convertIntToStr.numberToString(67));
            assertEquals("123", d14_convertIntToStr.numberToString(123));
            assertEquals("999", d14_convertIntToStr.numberToString(999));
        }
    }

    @Nested
    class d15_stringToArrayTest {
        @Test
        public void basicTests() {
            assertArrayEquals(new String[]{"Robin", "Singh"}, d15_stringToArray.stringToArray("Robin Singh"));
            assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, d15_stringToArray.stringToArray("I love arrays they are my favorite"));
        }
    }

    @Nested
    class d16_yesOrNoTest {
        @Test
        public void testBoolToWord() {
            assertEquals(d16_yesOrNo.boolToWord(true),"Yes");
            assertEquals(d16_yesOrNo.boolToWord(false),"No");
        }
    }

    @Nested
    class d17_suitTest {
        @Test
        public void test1() {
            System.out.println("Fixed Tests Player 1 won!");
            assertEquals("Player 1 won!", d17_suit.rps("rock", "scissors"));
            assertEquals("Player 1 won!", d17_suit.rps("scissors", "paper"));
            assertEquals("Player 1 won!", d17_suit.rps("paper", "rock"));
        }
        @Test
        public void test2() {
            System.out.println("Fixed Tests Player 2 won!");
            assertEquals("Player 2 won!", d17_suit.rps("scissors", "rock"));
            assertEquals("Player 2 won!", d17_suit.rps("paper", "scissors"));
            assertEquals("Player 2 won!", d17_suit.rps("rock", "paper"));
        }
        @Test
        public void test3() {
            System.out.println("Fixed Tests Draw!");
            assertEquals("Draw!", d17_suit.rps("scissors", "scissors"));
            assertEquals("Draw!", d17_suit.rps("paper", "paper"));
            assertEquals("Draw!", d17_suit.rps("rock", "rock"));
        }
    }

    @Nested
    class d18_sumArrayTest {
        @Test
        public void sampleTests() {
            assertEquals(21, d18_sumArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
            assertEquals(-21, d18_sumArray.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
            assertEquals(15, d18_sumArray.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
            assertEquals(2100, d18_sumArray.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
        }
    }
}