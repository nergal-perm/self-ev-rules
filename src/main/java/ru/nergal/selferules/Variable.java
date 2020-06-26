package ru.nergal.selferules;

import java.util.function.Function;

public class Variable<T, R> implements Term<R> {
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
