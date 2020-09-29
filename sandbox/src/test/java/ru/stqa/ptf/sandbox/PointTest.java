package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testArea() {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(-9, 8);
        Assert.assertEquals(p1.distance(p1, p2), 14.035668847618199);
    }
}
