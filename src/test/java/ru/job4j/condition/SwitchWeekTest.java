package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {
    
    @Test
    public void stringExpected() {
        String expected = "monday";
        int day = 1;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }
}