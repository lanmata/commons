/*
 * @(#)${NAME}.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 *
 */

package com.prx.commons.converter;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * ConverterImpl.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class ConverterTest {

    @Test
    void test_default_constructor(){
        final var converterTest = new ConverterImpTest();
        converterTest.init();
        var object =  converterTest.convertFromA(converterTest.convertFromB("value"));
        var values = new ArrayList<String>();
        var objects = new ArrayList<>();
        values.add(object.toString());
        objects.add(object);
        assertNotNull(object.toString());
        assertNotNull(object);
        assertNotNull(converterTest.createFromA(values));
        assertNotNull(converterTest.createFromB(objects));
    }

    @Test
    void test(){
        Function<String, Object> fA = (String value) -> value;
        Function<Object, String> fB = Object::toString;
        final var converterTest = new ConverterImpTest(fA, fB);
        converterTest.init();
        var object =  converterTest.convertFromA(converterTest.convertFromB("value"));
        var values = new ArrayList<String>();
        var objects = new ArrayList<>();
        values.add(object.toString());
        objects.add(object);
        assertNotNull(object.toString());
        assertNotNull(object);
        assertNotNull(converterTest.createFromA(values));
        assertNotNull(converterTest.createFromB(objects));
    }

    static class ConverterImpTest extends Converter<String, Object> {

        ConverterImpTest(){
            super();
        }
        ConverterImpTest(Function<String, Object> fromA, Function<Object, String> fromB){
            super(fromA, fromB);
        }

        void init(){
            initFunction();
        }

        @Override
        protected String getA(final Object o) {
            return o.toString();
        }

        @Override
        protected Object getB(final String s) {
            return s;
        }

    }
}
