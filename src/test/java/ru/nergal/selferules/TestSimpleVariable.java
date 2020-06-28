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

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit-tests for a single Variable.
 *
 * @since 0.0.1
 */
public class TestSimpleVariable {
    /**
     * Person age in years.
     */
    public static final int PERSON_AGE = 36;

    /**
     * Person's first name.
     */
    public static final String PERSON_NAME = "Eugene";

    /**
     * Object representing a person.
     */
    private TestPerson eugene;

    /**
     * Method to set up unit-tests.
     */
    @Before
    public void setUp() {
        this.eugene = new TestPerson(TestSimpleVariable.PERSON_AGE, TestSimpleVariable.PERSON_NAME);
    }

    /**
     * Variable should be able to resolve to Integer value.
     */
    @Test
    public void shouldResolveToIntegerValue() {
        final Variable<TestPerson, Integer> target =
            new Variable<>(this.eugene, TestPerson::age);
        MatcherAssert.assertThat(
            target.resolve(),
            Matchers.equalTo(TestSimpleVariable.PERSON_AGE)
        );
    }

    /**
     * Variable should be able to resolve to String value.
     */
    @Test
    public void testStringVariable() {
        final Variable<TestPerson, String> target =
            new Variable<>(this.eugene, TestPerson::firstName);
        MatcherAssert.assertThat(
            target.resolve(),
            Matchers.equalTo(TestSimpleVariable.PERSON_NAME)
        );
    }
}
