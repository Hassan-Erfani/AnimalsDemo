package at.campus02.erfani;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    int a;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        a = 2;
    }

    @Test
    void myFirstTest() {
        assertTrue(a > 1);
    }
}
