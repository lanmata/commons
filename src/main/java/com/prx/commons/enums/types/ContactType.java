package com.prx.commons.enums.types;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
public enum ContactType {
    EMAIL,
    PHONE,
    WHATSAPP,
    TELEGRAM,
    TWITTER;

    public static ContactType getConctactType(int value){
        return ContactType.values()[value];
    }

}
