# Commons

## Status

This module is a shared library (PRX Commons) that provides common components, utilities, and constants for PRX applications. It does not declare a Spring Boot parent; versions for dependencies and plugins are centralized in the project POM and the BOM (`bom/pom.xml`).

Key versions (taken from `pom.xml` / `bom/pom.xml`):

- Java: 21
- JUnit Jupiter (bom/core): 5.9.3
- Jackson Annotations: 2.20
- Jackson Databind: 2.20.2
- Gson: 2.13.2
- org.json (json): 20250517
- webjars-locator-core: 0.59
- Log4j Core: 2.25.3
- Jakarta Validation API: 3.0.2
- ASM: 9.8

Build / plugin versions:

- maven-compiler-plugin: 3.13.0
- maven-surefire-plugin: 3.5.2
- jacoco-maven-plugin: 0.8.12
- maven-pmd-plugin: 3.28.0
- build-helper-maven-plugin: 3.6.1
- versions-maven-plugin: 2.18.0
- maven-enforcer-plugin: 3.5.0

## Overview

PRX Commons is intended to be consumed by PRX applications. Dependency and plugin versions are centralized to allow consistent upgrades across multiple modules.

## Building

This project uses Java 21 by default (see `pom.xml`). To build locally:

```bash
# Requires Java 21 (set JAVA_HOME accordingly)
mvn clean package
```

## Using the BOM

The project provides a BOM at `bom/pom.xml` (artifact `com.prx:prx-commons-bom:0.0.1`). Import it in other modules to centralize versions.

## Notes

- Keep `bom/pom.xml` and the root `pom.xml` in sync when updating versions.
- Avoid committing any credentials (e.g., `settings.xml`) to the repository.

[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=lanmata_commons)](https://sonarcloud.io/summary/new_code?id=lanmata_commons)
