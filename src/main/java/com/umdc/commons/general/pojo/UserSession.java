package com.umdc.commons.general.pojo;

import java.util.UUID;

public record UserSession(UUID id, String alias, String token) {
}
