package com.prx.commons.enums.keys;

public enum SizeKey {
    BYTES("b"),
    KILOBYTES("kb"),
    MEGABYTES("mb"),
    GIGABYTES("gb"),
    TERABYTES("tb"),
    PETABYTES("pb"),
    EXABYTES("eb"),
    ZETABYTES("zb"),
    YOTABYTES("yb");

    private final String type;

    SizeKey(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
