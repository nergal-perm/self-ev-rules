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
 * Unit-tests for simple constant only cases.
 * @since 0.0.1
 */
public class TestRuleWithConstantsOnly {
    /**
     * Simple Integer constant.
     */
    private Term<Integer> integer;

    /**
     * Method to set up unit-tests.
     */
    @Before
    public void setUp() {
        this.integer = new Constant<>(1);
    }

    /**
     * A Constant Term should resolve to itself (return its value).
     * @since 0.0.1
     */
    @Test
    public void constantShouldResolveToItself() {
        MatcherAssert.assertThat(
            this.integer.resolve(),
            Matchers.equalTo(1)
        );
    }
}
