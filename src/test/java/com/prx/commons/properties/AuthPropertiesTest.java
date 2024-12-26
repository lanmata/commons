package com.prx.commons.properties;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthPropertiesTest {

    @Test
    @DisplayName("Get and set authorizationGrantType")
    void getAndSetAuthorizationGrantType() {
        AuthProperties authProperties = new AuthProperties();
        authProperties.setAuthorizationGrantType("authorization_code");
        assertEquals("authorization_code", authProperties.getAuthorizationGrantType());
    }

    @Test
    @DisplayName("Get and set scope")
    void getAndSetScope() {
        AuthProperties authProperties = new AuthProperties();
        authProperties.setScope("read");
        assertEquals("read", authProperties.getScope());
    }

    @Test
    @DisplayName("Get and set clientSecret")
    void getAndSetClientSecret() {
        AuthProperties authProperties = new AuthProperties();
        authProperties.setClientSecret("secret");
        assertEquals("secret", authProperties.getClientSecret());
    }

    @Test
    @DisplayName("Get and set clientId")
    void getAndSetClientId() {
        AuthProperties authProperties = new AuthProperties();
        authProperties.setClientId("client_id");
        assertEquals("client_id", authProperties.getClientId());
    }

    @Test
    @DisplayName("Get and set redirectUri")
    void getAndSetRedirectUri() {
        AuthProperties authProperties = new AuthProperties();
        authProperties.setRedirectUri("http://localhost");
        assertEquals("http://localhost", authProperties.getRedirectUri());
    }

    @Test
    @DisplayName("Get and set username")
    void getAndSetUsername() {
        AuthProperties authProperties = new AuthProperties();
        authProperties.setUsername("user");
        assertEquals("user", authProperties.getUsername());
    }

    @Test
    @DisplayName("Get and set password")
    void getAndSetPassword() {
        AuthProperties authProperties = new AuthProperties();
        authProperties.setPassword("password");
        assertEquals("password", authProperties.getPassword());
    }

    @Test
    @DisplayName("Default constructor initializes fields to null")
    void defaultConstructorInitializesFieldsToNull() {
        AuthProperties authProperties = new AuthProperties();
        assertNull(authProperties.getAuthorizationGrantType());
        assertNull(authProperties.getScope());
        assertNull(authProperties.getClientSecret());
        assertNull(authProperties.getClientId());
        assertNull(authProperties.getRedirectUri());
        assertNull(authProperties.getUsername());
        assertNull(authProperties.getPassword());
    }
}
