package io.github.terickson87.FunctionalJava;

import java.util.function.Function;

public interface Functor<T> {
    <R> Functor<R> map(Function<T, R> function);
    <R> R getValue();
}
