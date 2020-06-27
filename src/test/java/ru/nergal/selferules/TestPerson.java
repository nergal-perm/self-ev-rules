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
 * @todo #3 10m Add Javadoc to TestPerson (see Qulice report for details)
 */

public class TestPerson {
    /**
     * @todo #3 20m Fix Checkstyle & PMD warnings in TestPerson
     */
    private final int age;
    private final String name;

    public TestPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer age() {
        return age;
    }

    public String name() {
        return name;
    }
}
