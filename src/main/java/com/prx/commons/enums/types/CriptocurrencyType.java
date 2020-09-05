package com.prx.commons.enums.types;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
public enum CriptocurrencyType {
    ETHER("ETH"),
    BITCOIN("BTC"),
    IOTA("IOT"),
    NANO(""),
    TRON("TRX"),
    CARDANO("ADA"),
    BITCOIN_CASH("BCH"),
    EOS("EOS"),
    //FIAT
    USD("USD"),
    CLP("CLP");
    
    private final String strCurrency;

    CriptocurrencyType(String strCurrency) {
        this.strCurrency = strCurrency;
    }

    public String getStrCurrency() {
        return strCurrency;
    }
}
