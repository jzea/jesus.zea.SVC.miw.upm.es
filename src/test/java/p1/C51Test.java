package p1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C51Test {

    private C51 c51;

    @BeforeEach
    void before() {
        this.c51 = new C51();
    }
    @Test
    void testM1() {
        assertEquals("m1",c51.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2",c51.m2());
    }
}