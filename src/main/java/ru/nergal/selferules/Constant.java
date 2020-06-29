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
 * I represent a single value or a clearly defined state.
 * @param <T> Type class of my value
 * @since 0.0.1
 */
public final class Constant<T> implements Term<T> {
    /**
     * Inner state of the Constant.
     */
    private final T value;

    /**
     * Primary constructor.
     * @param value Constant value
     */
    public Constant(final T value) {
        this.value = value;
    }

    @Override
    public T resolve() {
        return this.value;
    }
}
