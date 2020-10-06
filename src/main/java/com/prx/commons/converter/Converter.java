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

import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Definicion de clase abstracta para conversion entre dos tipos de objetos
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 * @param <A>
 * @param <B>
 */
@NoArgsConstructor
public abstract class Converter<A, B> {

    protected Function<A, B> fromA;
    protected Function<B, A> fromB;

    protected void initFunction(){
        setFunction(this::getB,this::getA);
    }

    protected abstract A getA(B b);

    protected abstract B getB(A a);

    protected void setFunction(final Function<A, B> fromA, final Function<B, A> fromB) {
        this.fromA = fromA;
        this.fromB = fromB;
    }

    public A convertFromB(final B b) {
        return fromB.apply(b);
    }

    public B convertFromA(final A a) {
        return fromA.apply(a);
    }

    public List<A> createFromB(final Collection<B> bCollection) {
        return bCollection.stream().map(this::convertFromB).collect(Collectors.toList());
    }

    public List<B> createFromA(final Collection<A> aCollection) {
        return aCollection.stream().map(this::convertFromA).collect(Collectors.toList());
    }

}
