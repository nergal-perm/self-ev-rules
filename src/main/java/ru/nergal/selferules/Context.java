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
 * I represent Rule evaluation Context providing access to datasources.
 * I also contain useful bits of data like ID numbers for entities used to evaluate the Rule.
 * @since 0.0.1
 */
public interface Context {
    /**
     * Fetches required value from the specified Datasource.
     * @param variable Requested value characteristics: datasource and data field.
     * @return Generic value for the requested variable.
     */
    Value value(VariableDescription variable);
    // @todo #19 30m Implement simple Context
}
