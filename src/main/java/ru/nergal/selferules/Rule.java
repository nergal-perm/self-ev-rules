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
 * I am a business rule or a formulae that can be composed of many Terms
 * and then be computed (evaluated) given different arguments.
 * @since 0.0.1
 */
public interface Rule {
    /**
     * Method to add a new Term at the end of the Terms list.
     * @param term Term to add.
     * @since 0.0.1
     */
    void add(Term term);

    /**
     * Method returning a Term at the specified index.
     * @param index Zero-based index of the Term to get.
     * @return A Term at the specified index in the Rule's Terms list.
     * @since 0.0.1
     */
    Term atIndex(int index);

    // @todo #4 15m Implement methods for adding and retrieving Rule's Terms

    // @todo #4 15m Write unit-tests for adding and retrieving Rule's Terms
}
