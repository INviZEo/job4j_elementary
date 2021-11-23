package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbers() {
        int start = 4;
        int finish = 18;
        int result = Counter.sumByEven(start, finish);
        int expected = 88;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEven() {
        int start = 5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        Assert.assertEquals(expected, result);
    }
}