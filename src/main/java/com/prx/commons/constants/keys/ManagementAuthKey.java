package com.prx.commons.constants.keys;

/**
 * Enum representing various management authentication keys.
 * Each enum constant holds a specific key value used for authentication.
 */
public enum ManagementAuthKey {
    /**
     * Key for grant type.
     */
    GRANT_TYPE("grant_type"),

    /**
     * Key for client ID.
     */
    CLIENT_ID("client_id"),

    /**
     * Key for username.
     */
    USERNAME("username"),

    /**
     * Key for password.
     */
    PASSWORD("password"),

    /**
     * Key for client secret.
     */
    CLIENT_SECRET("client_secret");

    /**
     * The value of the authentication key.
     */
    public final String value;

    /**
     * Constructor to initialize the authentication key with its value.
     *
     * @param key the value of the authentication key
     */
    ManagementAuthKey(String key) {
        this.value = key;
    }
}
