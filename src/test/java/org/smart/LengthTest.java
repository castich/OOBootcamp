package org.smart;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void test_mile_3_equals_mile_3(){
        System.out.println(new Mile(3).getValue());
        System.out.println(new Mile(3).getValue());
        assertEquals(new Mile(3), new Mile(3));
    }

    @Test
    public void test_mile_3_not_equals_mile_4(){
        assertNotEquals(new Mile(3), new Mile(4));
    }

    @Test
    public void test_mile_1_not_equals_null(){
        assertNotEquals(new Mile(1), null);
    }

    @Test
    public void test_null_not_equals_mile_1(){
        assertNotEquals(null,new Mile(1));
    }

    @Test
    public void test_1_mile_equals_1760_yards(){
        assertEquals(new Mile(1), new Yard(1760));
    }

    @Test
    public void test_3_yards_equals_3_yards(){
        assertEquals(new Yard(3), new Yard(3));
    }

    @Test
    public void test_1_mile_not_equals_1761_yards(){
        assertNotEquals(new Mile(1), new Yard(1761));
    }

    @Test
    public void test_3_yards_not_equals_4_yards(){
        assertNotEquals(new Yard(3), new Yard(4));
    }

    @Test
    public void test_1_yard_not_equals_null(){
        assertNotEquals(new Yard(1),null);
    }

    @Test
    public void test_null_not_equals_1_yard(){
        assertNotEquals(null,new Yard(1));
    }

    @Test
    public void test_1_yard_equals_3_feet(){
        assertEquals(new Yard(1), new Feet(3));
    }

    @Test
    public void test_1_feet_equals_12_inches(){
        assertEquals(new Feet(1), new Inch(12));
    }

    @Test
    public void test_1_mile_equals_5280_feet(){
        assertEquals(new Mile(1), new Feet(5280));
    }

    @Test
    public void test_1_mile_equals_63360_inches(){
        assertEquals(new Mile(1), new Inch(63360));
    }

    @Test
    public void test_1_yard_not_equals_4_feet(){
        assertNotEquals(new Yard(1), new Feet(4));
    }

    @Test
    public void test_1_feet_not_equals_13_inches(){
        assertNotEquals(new Feet(1), new Inch(1));
    }

    @Test
    public void test_1_mile_not_equals_63361_inch(){
        assertNotEquals(new Mile(1), new Inch(63361));
    }

    @Test
    public void test_1_feet_not_equals_null(){
        assertNotEquals(new Feet(1), null);
    }

    @Test
    public void test_null_not_equals_1_feet(){
        assertNotEquals(null, new Feet(1));
    }

    @Test
    public void test_1_inch_not_equals_null(){
        assertNotEquals(new Inch(1), null);
    }

    @Test
    public void test_null_not_equals_1_inch(){
        assertNotEquals(null,new Inch(1));
    }

    @Test
    public void test_5_miles_equals_to_26400_feet(){
        assertEquals(new Mile(5), new Feet(26400));
    }

    @Test
    public void test_13_inches_plus_11_inches_equals_2_feet(){
        assertEquals(new Inch(13).add(new Inch(11)),new Feet(2));
    }

    @Test
    public void test_3_feet_plus_2_yards_equals_3_yards(){
        assertEquals(new Feet(3).add(new Yard(2)), new Yard(3));
    }

    @Test
    public void test_3_feet_plus_3_feet_equals_6_feet(){
        assertEquals(new Feet(3).add(new Feet(3)), new Feet(6));
    }

    @Test
    public void test_3_feet_plus_4_feet_is_not_equals_5_feet(){
        assertNotEquals(new Feet(3).add(new Feet(4)), new Feet(5));
    }
}