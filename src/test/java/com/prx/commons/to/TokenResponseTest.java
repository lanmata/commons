package com.prx.commons.to;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenResponseTest {

    @Test
    @DisplayName("Get and set accessToken")
    void getAndSetAccessToken() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setAccessToken("access_token_value");
        assertEquals("access_token_value", tokenResponse.getAccessToken());
    }

    @Test
    @DisplayName("Get and set expiresIn")
    void getAndSetExpiresIn() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setExpiresIn(3600);
        assertEquals(3600, tokenResponse.getExpiresIn());
    }

    @Test
    @DisplayName("Get and set refreshExpiresIn")
    void getAndSetRefreshExpiresIn() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setRefreshExpiresIn(7200);
        assertEquals(7200, tokenResponse.getRefreshExpiresIn());
    }

    @Test
    @DisplayName("Get and set refreshToken")
    void getAndSetRefreshToken() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setRefreshToken("refresh_token_value");
        assertEquals("refresh_token_value", tokenResponse.getRefreshToken());
    }

    @Test
    @DisplayName("Get and set tokenType")
    void getAndSetTokenType() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setTokenType("Bearer");
        assertEquals("Bearer", tokenResponse.getTokenType());
    }

    @Test
    @DisplayName("Get and set notBeforePolicy")
    void getAndSetNotBeforePolicy() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setNotBeforePolicy(0);
        assertEquals(0, tokenResponse.getNotBeforePolicy());
    }

    @Test
    @DisplayName("Get and set sessionState")
    void getAndSetSessionState() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setSessionState("session_state_value");
        assertEquals("session_state_value", tokenResponse.getSessionState());
    }

    @Test
    @DisplayName("Get and set scope")
    void getAndSetScope() {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.setScope("read write");
        assertEquals("read write", tokenResponse.getScope());
    }

    @Test
    @DisplayName("Default constructor initializes fields to null or zero")
    void defaultConstructorInitializesFieldsToNullOrZero() {
        TokenResponse tokenResponse = new TokenResponse();
        assertNull(tokenResponse.getAccessToken());
        assertEquals(0, tokenResponse.getExpiresIn());
        assertEquals(0, tokenResponse.getRefreshExpiresIn());
        assertNull(tokenResponse.getRefreshToken());
        assertNull(tokenResponse.getTokenType());
        assertEquals(0, tokenResponse.getNotBeforePolicy());
        assertNull(tokenResponse.getSessionState());
        assertNull(tokenResponse.getScope());
    }
}
