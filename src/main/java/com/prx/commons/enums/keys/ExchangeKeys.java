package com.prx.commons.enums.keys;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
public enum ExchangeKeys {
    BITSTAMP(1),
    BITFINEX(2),
    OKCOIN(3);

    private final int id;

    ExchangeKeys(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
