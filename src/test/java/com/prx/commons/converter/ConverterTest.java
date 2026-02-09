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

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
class ConverterTest {

    @Test
    @DisplayName("Convert from A to B")
    void convertFromAToB() {
        Function<String, Integer> fromA = Integer::parseInt;
        Function<Integer, String> fromB = String::valueOf;
        Converter<String, Integer> converter = new ConverterImpTest(fromA, fromB);
        assertEquals(123, converter.convertFromA("123"));
    }

    @Test
    @DisplayName("Convert from B to A")
    void convertFromBToA() {
        Function<String, Integer> fromA = Integer::parseInt;
        Function<Integer, String> fromB = String::valueOf;
        Converter<String, Integer> converter = new ConverterImpTest(fromA, fromB);
        assertEquals("123", converter.convertFromB(123));
    }

    @Test
    @DisplayName("Create from A collection")
    void createFromACollection() {
        Function<String, Integer> fromA = Integer::parseInt;
        Function<Integer, String> fromB = String::valueOf;
        Converter<String, Integer> converter = new ConverterImpTest(fromA, fromB);
        List<String> aCollection = List.of("1", "2", "3");
        List<Integer> result = converter.createFromA(aCollection);
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    @DisplayName("Create from B collection")
    void createFromBCollection() {
        Function<String, Integer> fromA = Integer::parseInt;
        Function<Integer, String> fromB = String::valueOf;
        Converter<String, Integer> converter = new ConverterImpTest(fromA, fromB);
        List<Integer> bCollection = List.of(1, 2, 3);
        List<String> result = converter.createFromB(bCollection);
        assertEquals(List.of("1", "2", "3"), result);
    }

    @Test
    @DisplayName("Create from empty A collection")
    void createFromEmptyACollection() {
        Function<String, Integer> fromA = Integer::parseInt;
        Function<Integer, String> fromB = String::valueOf;
        Converter<String, Integer> converter = new ConverterImpTest(fromA, fromB);
        List<String> aCollection = Collections.emptyList();
        List<Integer> result = converter.createFromA(aCollection);
        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Create from empty B collection")
    void createFromEmptyBCollection() {
        Function<String, Integer> fromA = Integer::parseInt;
        Function<Integer, String> fromB = String::valueOf;
        Converter<String, Integer> converter = new ConverterImpTest(fromA, fromB);
        List<Integer> bCollection = Collections.emptyList();
        List<String> result = converter.createFromB(bCollection);
        assertTrue(result.isEmpty());
    }

    static class ConverterImpTest extends Converter<String, Integer> {

        public ConverterImpTest(Function<String, Integer> fromA, Function<Integer, String> fromB) {
            super(fromA, fromB);
        }

        @Override
        protected String getA(Integer integer) {
            return integer.toString();
        }

        @Override
        protected Integer getB(String s) {
            return Integer.parseInt(s);
        }
    }
}
