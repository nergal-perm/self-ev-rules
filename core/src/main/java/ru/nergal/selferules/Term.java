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
 * I contain resolvable term like '2+3', so I can provide data to evaluate Rules.
 *
 * @param <T> return type of my resolution
 * @since 0.0.1
 */
public interface Term<T> {

    /**
     * Computes the value of the Term, delegating to all the nested Terms if needed.
     * @return Result of the Term resolution (computation).
     */
    T resolve();
}
