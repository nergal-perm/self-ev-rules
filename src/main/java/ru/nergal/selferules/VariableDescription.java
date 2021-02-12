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
 * I am a simple textual representation of the Variable. I posess all the information,
 * required to extract data from the Context datasource.
 * @since 0.0.1
 */
public interface VariableDescription {
    /**
     * Name of the datasource used to obtain value.
     * @return Name (unique identifier) of the datasource.
     */
    String source();

    /**
     * Name of the specific field, which value should be assigned to Variable.
     * @return Unique identifier of the data field.
     */
    String parameter();
}
