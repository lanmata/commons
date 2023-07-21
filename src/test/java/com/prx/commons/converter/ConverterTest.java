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
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * ConverterImpl.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 20-10-2020
 */
class ConverterTest {

    /**
     * Method under test: {@link Converter#initFunction()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInitFunction() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: reactor.netty.http.server.HttpServer
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Converter<String, Object> converter = null;

        // Act
        converter.initFunction();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Converter#setFunction(Function, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetFunction() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: reactor.netty.http.server.HttpServer
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Converter<String, Object> converter = null;
        Function<String, Object> fromA = null;
        Function<Object, String> fromB = null;

        // Act
        converter.setFunction(fromA, fromB);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Converter#convertFromB(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConvertFromB() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: reactor.netty.http.server.HttpServer
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Converter<String, Object> converter = null;
        Object object = null;

        // Act
        String actualConvertFromBResult = converter.convertFromB(object);

        // Assert
        // TODO: Add assertions on result
    }

    @Test
    void test_default_constructor() {
        final var converterTest = new ConverterImpTest();
        converterTest.init();
        var object = converterTest.convertFromA(converterTest.convertFromB("value"));
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
    void test() {
        Function<String, Object> fA = (String value) -> value;
        Function<Object, String> fB = Object::toString;
        final var converterTest = new ConverterImpTest(fA, fB);
        converterTest.init();
        var object = converterTest.convertFromA(converterTest.convertFromB("value"));
        var values = new ArrayList<String>();
        var objects = new ArrayList<>();
        values.add(object.toString());
        objects.add(object);
        assertNotNull(object.toString());
        assertNotNull(object);
        assertNotNull(converterTest.createFromA(values));
        assertNotNull(converterTest.createFromB(objects));
    }

    /**
     * Method under test: {@link Converter#convertFromA(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConvertFromA() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: reactor.netty.http.server.HttpServer
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Converter<String, Object> converter = null;
        String string = "";

        // Act
        Object actualConvertFromAResult = converter.convertFromA(string);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Converter#createFromB(Collection)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateFromB() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: reactor.netty.http.server.HttpServer
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Converter<String, Object> converter = null;
        Collection<Object> bCollection = null;

        // Act
        List<String> actualCreateFromBResult = converter.createFromB(bCollection);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Converter#createFromA(Collection)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateFromA() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: reactor.netty.http.server.HttpServer
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Converter<String, Object> converter = null;
        Collection<String> aCollection = null;

        // Act
        List<Object> actualCreateFromAResult = converter.createFromA(aCollection);

        // Assert
        // TODO: Add assertions on result
    }

    static class ConverterImpTest extends Converter<String, Object> {

        ConverterImpTest() {
            super();
        }

        ConverterImpTest(Function<String, Object> fromA, Function<Object, String> fromB) {
            super(fromA, fromB);
        }

        void init() {
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
