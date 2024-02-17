package io.github.terickson87.FunctionalJava;

import java.util.function.Function;

public class Box<T> implements Functor<T> {
    private final T value;

    Box(T value) {
        this.value = value;
    }

    @Override
    public <R> Functor<R> map(Function<T, R> function) {
        R result = function.apply(value);
        return new Box<>(result);
    }
    
    @SuppressWarnings("unchecked")
    public T getValue() {
        return value;
    }
    
}
