/*
 * Copyright Eugene Terekhov.
 *
 * This file is part of Self-Evaluating-Rules (SER).
 *
 * SER is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * or any later version as published by the Free Software Foundation.
 *
 * SER is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SER.  If not, see <https://www.gnu.org/licenses/>.
 */
package ru.nergal.selferules;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * @todo #3 10m Add Javadoc to TestSimpleVariable (see Qulice report for details)
 */

public class TestSimpleVariable {
    /**
     * @todo #3 20m Fix Checkstyle & PMD warnings in TestSimpleVariable
     */
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
        Variable<TestPerson, String> target = new Variable<>(eugene, TestPerson::firstName);
        Assert.assertEquals("Eugene", target.resolve());
    }
}
