package com.prx.commons.util;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ValidatorAdditionalTest {

    @Test
    void isEmpty_handles_iterator_and_enumeration_and_arrays() {
        List<String> list = List.of("a", "b");
        Iterator<String> it = list.iterator();
        // iterator.hasNext() should be true -> isEmpty should return false
        assertFalse(Validator.isEmpty(it));

        Vector<String> vec = new Vector<>(List.of("x"));
        Enumeration<String> en = vec.elements();
        // enumeration has more elements -> isEmpty should return false
        assertFalse(Validator.isEmpty(en));

        // arrays
        String[] emptyArr = new String[0];
        String[] nonEmptyArr = new String[]{"v"};
        assertTrue(Validator.isEmpty(emptyArr));
        assertFalse(Validator.isEmpty(nonEmptyArr));
    }

    @Test
    void isEmpty_handles_collections_and_maps() {
        List<String> emptyList = List.of();
        List<String> nonEmptyList = List.of("a");
        assertTrue(Validator.isEmpty(emptyList));
        assertFalse(Validator.isEmpty(nonEmptyList));

        assertTrue(Validator.isEmpty(Collections.emptyMap()));
    }
}
