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
