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

/**
 * I am a dummy person capable of providing some information for testing Rule logic.
 *
 * @since 0.0.1
 */
public final class TestPerson {
    /**
     * Age of a person.
     */
    private final int years;

    /**
     * Name of a person.
     */
    private final String name;

    /**
     * Primary constructor.
     *
     * @param years Person's age.
     * @param name Person's name.
     */
    public TestPerson(final int years, final String name) {
        this.years = years;
        this.name = name;
    }

    /**
     * Method to know person's age.
     *
     * @return Person's age in years.
     */
    public Integer age() {
        return this.years;
    }

    /**
     * Method to know person's name.
     *
     * @return Person's name.
     */
    public String firstName() {
        return this.name;
    }
}
