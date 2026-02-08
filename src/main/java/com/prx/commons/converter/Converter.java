/*
 *  @(#)Converter.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

package com.prx.commons.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 * Abstract class definition for converting between two object types.
 *
 * @param <A> source generic type
 * @param <B> target generic type
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
public abstract class Converter<A, B> {

    /**
     * Function to convert from A to B
     */
    protected Function<A, B> fromA;
    /**
     * Function to convert from B to A
     */
    protected Function<B, A> fromB;

    /**
     * Default constructor.
     */
    protected Converter() {
        //Default constructor
    }

    /**
     * Constructor with conversion functions.
     *
     * @param fromA function converting A -> B
     * @param fromB function converting B -> A
     */
    protected Converter(Function<A, B> fromA, Function<B, A> fromB) {
        this.fromA = fromA;
        this.fromB = fromB;
    }

    /**
     * Initializes the conversion functions using {@link #getA} and {@link #getB} implementations.
     */
    protected void initFunction() {
        setFunction(this::getB, this::getA);
    }

    /**
     * Converts an instance of {@link B} to type {@link A}.
     *
     * @param b input value of type B
     * @return converted value of type A
     */
    protected abstract A getA(B b);

    /**
     * Converts an instance of {@link A} to type {@link B}.
     *
     * @param a input value of type A
     * @return converted value of type B
     */
    protected abstract B getB(A a);

    /**
     * Assigns the functional converters.
     *
     * @param fromA {@link Function}
     * @param fromB {@link Function}
     */
    protected void setFunction(final Function<A, B> fromA, final Function<B, A> fromB) {
        this.fromA = fromA;
        this.fromB = fromB;
    }

    /**
     * Converts from {@link B} to {@link A} using the configured function.
     *
     * @param b value of type B
     * @return converted A
     */
    public A convertFromB(final B b) {
        return fromB.apply(b);
    }

    /**
     * Converts from {@link A} to {@link B} using the configured function.
     *
     * @param a value of type A
     * @return converted B
     */
    public B convertFromA(final A a) {
        return fromA.apply(a);
    }

    /**
     * Converts a collection of {@link B} elements to a {@link List} of {@link A} elements.
     *
     * @param bCollection collection of B
     * @return list of converted A values
     */
    public List<A> createFromB(final Collection<B> bCollection) {
        return bCollection.stream().map(this::convertFromB).toList();
    }

    /**
     * Converts a collection of {@link A} elements to a {@link List} of {@link B} elements.
     *
     * @param aCollection collection of A
     * @return list of converted B values
     */
    public List<B> createFromA(final Collection<A> aCollection) {
        return aCollection.stream().map(this::convertFromA).toList();
    }

}
