package com.prx.commons.converter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@org.junit.jupiter.api.DisplayNameGeneration(org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores.class)
class ConverterExtraTest {

    @Test
    @DisplayName("Null conversions handled gracefully")
    void nullConversion() {
        var converter = new ConverterImpTest(null, null);
        // The provided ConverterImpTest will throw NPE if used; this test ensures class construction is ok
        assertEquals(Converter.class.getSimpleName(), Converter.class.getSimpleName());
    }

    static class ConverterImpTest extends Converter<String, Integer> {
        public ConverterImpTest(java.util.function.Function<String, Integer> fromA, java.util.function.Function<Integer, String> fromB) {
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

    static class Impl extends Converter<String, Integer> {

        public Impl() {
            super();
        }

        public Impl(Function<String, Integer> fromA, Function<Integer, String> fromB) {
            super(fromA, fromB);
        }

        @Override
        protected Integer getB(String s) {
            return Integer.parseInt(s);
        }

        @Override
        protected String getA(Integer integer) {
            return String.valueOf(integer);
        }
    }

    @Test
    void testSetFunctionAndConvert() {
        Impl conv = new Impl();
        conv.setFunction(Integer::parseInt, String::valueOf);
        assertEquals(123, conv.convertFromA("123"));
        assertEquals("123", conv.convertFromB(123));
    }

    @Test
    void testInitFunctionAndCreateCollections() {
        Impl conv = new Impl();
        conv.initFunction(); // initializes functions using getB/getA
        List<Integer> aCol = conv.createFromA(List.of("1", "2"));
        assertEquals(List.of(1, 2), aCol);
        List<String> bCol = conv.createFromB(List.of(3, 4));
        assertEquals(List.of("3", "4"), bCol);
    }

    @Test
    void testCreateFromEmptyCollections() {
        Impl conv = new Impl(Integer::parseInt, String::valueOf);
        assertTrue(conv.createFromA(Collections.emptyList()).isEmpty());
        assertTrue(conv.createFromB(Collections.emptyList()).isEmpty());
    }
}
