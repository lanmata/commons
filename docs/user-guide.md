# Commons – User Guide: Jackson 3 migration

## What changed for consumers
`com.umdc:commons` now depends on **Jackson 3** (`tools.jackson.core:jackson-databind` 3.1.8).
The annotations (`@JsonProperty`, `@JsonFormat`, `@JsonPropertyOrder`) are unchanged and still live in
`com.fasterxml.jackson.annotation`. Only `@JsonNaming` and the `ObjectMapper` moved.

## How to update your project

| Jackson 2 | Jackson 3 |
|---|---|
| `com.fasterxml.jackson.databind.ObjectMapper` | `tools.jackson.databind.ObjectMapper` (build with `JsonMapper.builder().build()`) |
| `com.fasterxml.jackson.databind.annotation.JsonNaming` | `tools.jackson.databind.annotation.JsonNaming` |
| `com.fasterxml.jackson.core:jackson-databind` | `tools.jackson.core:jackson-databind` |
| `JsonProcessingException` (checked) | `tools.jackson.core.JacksonException` (unchecked) |
| `com.fasterxml.jackson.annotation.*` | **unchanged** |

## Example
```java
ObjectMapper mapper = JsonMapper.builder().build();
String json = mapper.writeValueAsString(role);
Role back = mapper.readValue(json, Role.class);
```

## Compatibility
Projects that still import `com.fasterxml.jackson.databind` must migrate their imports (backbone-rest already did).

## Federation audit event types (0.0.4)

`AuditEventType` now includes `FEDERATED_LOGIN`, `FEDERATION_FAILED`, `FEDERATION_LINKED`, `FEDERATION_UNLINKED` and `FEDERATION_PROVIDER_CHANGED`. Services that record audit events can use them to trace sign-ins through external identity providers (Google, Microsoft, Apple, GitHub, Meta). Existing values are unchanged.
