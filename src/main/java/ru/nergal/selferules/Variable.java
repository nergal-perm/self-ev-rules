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

import java.util.function.Function;

/**
 * I represent a Variable capable of instantiating myself. In other words
 * I can obtain my own value by sending some specified message to my source
 * object to get (compute) my value.
 * @param <T> type of an object which can provide me with value
 * @param <R> return type of my value
 * @since 0.0.1
 */
public class Variable<T, R> implements Term<R> {
    /**
     * Object that can provide or compute the value for a Variable.
     */
    private final T source;

    /**
     * Function used to compute the value.
     */
    private final Function<T, R> getter;

    /**
     * Primary constructor.
     *
     * @param source Object that can provide or compute the value for a Variable.
     * @param getter Function used to compute the value.
     */
    public Variable(final T source, final Function<T, R> getter) {
        this.source = source;
        this.getter = getter;
    }

    /**
     * Sends specified getter message to the source object in order to compute this
     * Variable's value.
     * @return Computed value for this Variable.
     */
    public R resolve() {
        return this.getter.apply(this.source);
    }

}
