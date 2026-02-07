package com.umdev.commons.general.pojo;

import java.util.UUID;

public record UserSession(UUID id, String alias, String token) {
}
