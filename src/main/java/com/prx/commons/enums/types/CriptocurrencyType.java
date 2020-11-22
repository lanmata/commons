/*
 *  @(#)CriptocurrencyType.java
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
package com.prx.commons.enums.types;

/**
 * CriptocurrencyType.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata.</a>
 * @version 1.0.3, 29-09-2020
 */
public enum CriptocurrencyType {
    ETHER("ETH"), BITCOIN("BTC"), IOTA("IOT"), NANO(""), TRON("TRX"), CARDANO("ADA"), BITCOIN_CASH("BCH"), EOS(
        "EOS"), //FIAT
    USD("USD"), CLP("CLP");

    private final String strCurrency;

    CriptocurrencyType(String strCurrency) {
        this.strCurrency = strCurrency;
    }

    /**
     * Retorna el acr&oacute;nimo de la moneda.
     *
     * @return {@link String}
     */
    public String getStrCurrency() {
        return strCurrency;
    }
}
