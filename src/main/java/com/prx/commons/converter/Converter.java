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
 * Definici&oacute;n de clase abstracta para conversi&oacute;n entre dos tipos de objetos
 *
 * @param <A> Gen&eacute;rico
 * @param <B> Gen&eacute;rico
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
public abstract class Converter<A, B> {

    /**
     * Function con paridades A y B
     */
    protected Function<A, B> fromA;
    /**
     * Function con paridades B y A
     */
    protected Function<B, A> fromB;

    /**
     * Default constructor.
     */
    protected Converter() {
        //Default constructor
    }

    /**
     *
     * @param fromA
     * @param fromB
     */
    protected Converter(Function<A, B> fromA, Function<B, A> fromB) {
        this.fromA = fromA;
        this.fromB = fromB;
    }

    /**
     * Iniciliza los objetos de tipo {@link Function} encargados de la conversi&oacute;n de datos.
     */
    protected void initFunction() {
        setFunction(this::getB, this::getA);
    }

    /**
     * Retorna un objeto de tipo {@link A}.
     *
     * @param b {@link B}
     *
     * @return {@link A}
     */
    protected abstract A getA(B b);

    /**
     * Retorna un objeto de tipo {@link B}.
     *
     * @param a {@link A}
     *
     * @return {@link B}
     */
    protected abstract B getB(A a);

    /**
     * Asigna los objetos funcionales para la conversi&oacute; de datos.
     *
     * @param fromA {@link Function}
     * @param fromB {@link Function}
     */
    protected void setFunction(final Function<A, B> fromA, final Function<B, A> fromB) {
        this.fromA = fromA;
        this.fromB = fromB;
    }

    /**
     * Realiza la conversi&oacute;n desde {@link B} a {@link A}.
     *
     * @param b {@link B}
     *
     * @return {@link A}
     */
    public A convertFromB(final B b) {
        return fromB.apply(b);
    }

    /**
     * Realiza la conversi&oacute;n desde {@link A} a {@link B}.
     *
     * @param a {@link A}
     *
     * @return {@link B}
     */
    public B convertFromA(final A a) {
        return fromA.apply(a);
    }

    /**
     * Realiza la conversi&oacute;n desde una colecci&oacute;n con elementos de tipo {@link B} a una colecci&oacute;n con
     * elementos de tipo {@link A}.
     *
     * @param bCollection {@link Collection}
     *
     * @return {@link List}
     */
    public List<A> createFromB(final Collection<B> bCollection) {
        return bCollection.stream().map(this::convertFromB).toList();
    }

    /**
     * Realiza la conversi&oacute;n desde una colecci&oacute;n con elementos de tipo {@link A} a una colecci&oacute;n con
     * elementos de tipo {@link B}.
     *
     * @param aCollection {@link Collection}
     *
     * @return {@link List}
     */
    public List<B> createFromA(final Collection<A> aCollection) {
        return aCollection.stream().map(this::convertFromA).toList();
    }

}
