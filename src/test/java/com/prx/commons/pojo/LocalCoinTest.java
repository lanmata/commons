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
package com.prx.commons.pojo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * LocalCoinTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 19-10-2020
 */
class LocalCoinTest {

    @Test
    void gettersAndSetters() {
        final var localCoin = new LocalCoin();

        localCoin.setActive(true);
        localCoin.setId(1);
        localCoin.setName("LCoin");
        localCoin.setSymbol("LC");

        assertAll("Test Getters ANd Setters",
                () -> assertNotNull(localCoin.getId()),
                () -> assertTrue(localCoin.getActive()),
                () -> assertNotNull(localCoin.getName()),
                () -> assertNotNull(localCoin.toString()),
                () -> assertNotNull(localCoin.getActive()),
                () -> assertNotNull(localCoin.getSymbol()),
                () -> assertNotEquals(1, localCoin.hashCode()),
                () -> assertNotEquals(new LocalCoin(), localCoin)
        );
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link LocalCoin}
     *   <li>{@link LocalCoin#setActive(Boolean)}
     *   <li>{@link LocalCoin#setId(Integer)}
     *   <li>{@link LocalCoin#setName(String)}
     *   <li>{@link LocalCoin#setSymbol(String)}
     *   <li>{@link LocalCoin#toString()}
     *   <li>{@link LocalCoin#getActive()}
     *   <li>{@link LocalCoin#getId()}
     *   <li>{@link LocalCoin#getName()}
     *   <li>{@link LocalCoin#getSymbol()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LocalCoin actualLocalCoin = new LocalCoin();
        actualLocalCoin.setActive(true);
        actualLocalCoin.setId(1);
        actualLocalCoin.setName("Name");
        actualLocalCoin.setSymbol("Symbol");
        String actualToStringResult = actualLocalCoin.toString();
        assertTrue(actualLocalCoin.getActive());
        assertEquals(1, actualLocalCoin.getId().intValue());
        assertEquals("Name", actualLocalCoin.getName());
        assertEquals("Symbol", actualLocalCoin.getSymbol());
        assertEquals("LocalCoin{id=1, symbol='Symbol', name='Name', active=true}", actualToStringResult);
    }

}
