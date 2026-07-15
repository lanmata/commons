/*
 * @(#)AuditEventType.java
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */

package com.umdc.commons.general.pojo;

/**
 * AuditEventType.
 *
 * Classifies the security events recorded in {@link AuditEvent} and
 * {@link ManagedClientAuditEvent}. Mirrors the {@code audit_event_type_ck}
 * check constraint on the {@code audit_event} table.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 */
public enum AuditEventType {
    LOGIN_SUCCESS,
    LOGIN_FAILURE,
    PASSWORD_CHANGE,
    ROLE_ASSIGNED,
    ROLE_REVOKED,
    LOGOUT,
    ACCOUNT_LOCKED,
    ACCOUNT_UNLOCKED,
    TOKEN_REFRESH,
    PASSWORD_RESET_REQUEST,
    CLIENT_REGISTERED,
    CLIENT_UPDATED,
    CLIENT_DEACTIVATED,
    CLIENT_DELETED,
    CLIENT_SECRET_ROTATED,
    CLIENT_TOKEN_ISSUED,
    CLIENT_TOKEN_ISSUE_FAILED,
    CLIENT_TOKEN_REVOKED,
    CLIENT_INTROSPECTION_CALLED
}
