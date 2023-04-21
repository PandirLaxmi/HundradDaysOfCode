package com.demo.hundredDaysOfCode.lambdaExpressions;

@FunctionalInterface
public interface MyInterface{
    void sayHello();

    /*default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { sayHello(t); after.accept(t); };
    }
*/
}
