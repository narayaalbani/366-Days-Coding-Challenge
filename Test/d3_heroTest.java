import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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