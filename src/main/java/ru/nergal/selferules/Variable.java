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
 * @todo #3 15m Add Javadoc to Variable (header, class, methods)
 *  see Qulice report for details
 */
public class Variable<T, R> implements Term<R> {
    /**
     * @todo #3 20m Fix PMD & Checkstyle warnings for Variable (variable names, modificators, etc)
     *  see Qulice report for details
     */
    private final T sourceObject;
    private final Function<T, R> getterMessage;

    public Variable(T sourceObject, Function<T, R> getterMessage) {
        this.sourceObject = sourceObject;
        this.getterMessage = getterMessage;
    }

    public R resolve() {
        return getterMessage.apply(sourceObject);
    }

}
