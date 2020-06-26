package ru.nergal.selferules;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSimpleVariable {

    private TestPerson eugene;

    @Before
    public void setUp() {
        eugene = new TestPerson(36, "Eugene");
    }

    @Test
    public void testSimpleInstantiation() {
        Variable<TestPerson, Integer> target = new Variable<>(eugene, TestPerson::age);
        Assert.assertEquals(Integer.valueOf(36), target.resolve());
    }

    @Test
    public void testStringVariable() {
        Variable<TestPerson, String> target = new Variable<>(eugene, TestPerson::name);
        Assert.assertEquals("Eugene", target.resolve());
    }
}
