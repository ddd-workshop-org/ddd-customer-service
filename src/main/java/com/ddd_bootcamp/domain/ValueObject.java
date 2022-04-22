package com.ddd_bootcamp.domain;

public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
