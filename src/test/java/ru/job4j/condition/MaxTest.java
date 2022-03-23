package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

    public class MaxTest {
        @Test
        public void whenMax1To2Then2() {
            int first = 1;
            int second = 2;
            int result = Max.max(first, second);
            int expected = 2;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax2To1Then2() {
            int first = 2;
            int second = 1;
            int result = Max.max(first, second);
            int expected = 2;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax2To2Then2() {
            int first = 2;
            int second = 2;
            int result = Max.max(first, second);
            int expected = 2;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax4To3To3Then4() {
            int first = 4;
            int second = 3;
            int third = 3;
            int result = Max.max(first, second, third);
            int expected = 4;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenMax2To3To9To4Then9() {
            int first = 2;
            int second = 3;
            int third = 9;
            int fourth = 4;
            int result = Max.max(first, second, third, fourth);
            int expected = 9;
            Assert.assertEquals(result, expected);
        }
    }