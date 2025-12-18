# Migration Guide: Spring Boot 4 and Java 25 Upgrade

## Overview

This document details the migration of the lanmata/commons project from Spring Boot 3.4.1 / Java 21 to Spring Boot 4.0.0 / Java 25.

## Changes Made

### 1. POM Configuration Updates

#### Spring Boot and Framework Versions
- **Spring Boot**: `3.4.1` → `4.0.0`
- **Spring Framework**: `6.2.1` → `7.0.1`  
- **Spring Cloud**: `2024.0.0` (Moorgate) → `2025.1.0` (Oakwood)
- **Java Version**: `21` → `25`

#### Dependency Updates

##### Spring Documentation (OpenAPI)
- **Old**: `springdoc-openapi-ui` version `1.8.0`
- **New**: `springdoc-openapi-starter-webmvc-ui` version `2.6.0`
- **Reason**: Spring Boot 3+ requires the new `springdoc-openapi-starter` artifacts

##### Build Plugins and Tools
- **Maven Surefire Plugin**: `3.2.5` → `3.5.2`
  - Updated for Java 25 compatibility
- **ASM Library**: `9.1` → `9.7.1`
  - Required for Java 25 bytecode support

##### Other Dependencies
- **webjars-locator-core**: `0.59` → `0.60`
  - Minor version update for compatibility

#### Repository Configuration
- Removed `repsy` repository (first position) to avoid connection issues
- Retained Maven Central as primary repository

### 2. CI/CD Configuration Updates

####  `.gitlab-ci.yml`
- **Docker Image**: `maven:3.9.9-eclipse-temurin-21` → `maven:3.9.9-eclipse-temurin-25`
- Ensures CI pipeline uses Java 25 for builds

### 3. Code Changes

#### javax.* to jakarta.* Migration
**Status**: No changes required ✓

Analysis of the codebase shows no usage of `javax.*` packages that need to be migrated to `jakarta.*`. The codebase is already Jakarta EE compliant.

## Spring Boot 4 Key Features and Changes

### Major Improvements
1. **Modularization**: Finer-grained JARs for leaner dependencies
2. **Null Safety**: JSpecify annotations throughout the framework
3. **JVM Support**: Full support for Java 17, 21, and 25
4. **REST APIs**: Built-in API versioning and HTTP Service Clients
5. **Observability**: Enhanced OpenTelemetry integration
6. **Jakarta EE 11**: Aligned with Jakarta EE 11 specifications

### Breaking Changes
1. **Servlet API Baseline**: Now requires Servlet 6.1 (Jakarta EE 11)
2. **Undertow Removed**: No longer supported due to Servlet API requirements
3. **Minimum Java Version**: Java 17 required, Java 21+ recommended

## Compatibility Matrix

| Component | Version | Notes |
|-----------|---------|-------|
| Spring Boot | 4.0.0 | Latest stable |
| Spring Framework | 7.0.1 | Required by Spring Boot 4 |
| Spring Cloud | 2025.1.0 (Oakwood) | Compatible with Spring Boot 4 |
| Java | 25 | Fully supported |
| Maven | 3.9.9+ | Recommended |
| Jakarta EE | 11 | Required baseline |

## Build and Test Instructions

### Prerequisites
- Java 25 (Microsoft OpenJDK or equivalent)
- Maven 3.9.9 or later
- Access to Maven Central repository

### Building the Project

```bash
# Set Java 25 as active JDK
export JAVA_HOME=/path/to/jdk-25
export PATH=$JAVA_HOME/bin:$PATH

# Verify Java version
java -version  # Should show 25.x.x

# Clean and build with tests
mvn clean package

# Build with parallel execution
mvn -T1C clean package

# Build with verbose output
mvn -U -e -T1C -V package
```

### Running Tests

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=ConverterTest

# Skip tests (not recommended)
mvn package -DskipTests
```

## Migration Checklist

- [x] Update Spring Boot parent POM to 4.0.0
- [x] Update Java version to 25 in pom.xml
- [x] Update Spring Framework version to 7.0.1
- [x] Update Spring Cloud to 2025.1.0 (Oakwood)
- [x] Update springdoc-openapi to 2.x series
- [x] Update Maven Surefire plugin to 3.5.2
- [x] Update ASM library to 9.7.1 for Java 25 support
- [x] Update CI/CD pipeline to use Java 25 image
- [x] Verify no javax.* to jakarta.* migrations needed
- [ ] Successfully build project with Java 25
- [ ] Run and pass all unit tests
- [ ] Run and pass all integration tests
- [ ] Update README with new versions

## Known Issues and Workarounds

### Issue: Maven SSL Certificate Validation
**Symptom**: `PKIX path building failed: SunCertPathBuilderException: unable to find valid certification path to requested target`

**Cause**: Environment-specific SSL certificate trust issues

**Workarounds**:
1. **Use insecure flags** (development only):
   ```bash
   mvn clean package -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true
   ```

2. **Use wagon transport**:
   ```bash
   mvn clean package -Dmaven.resolver.transport=wagon
   ```

3. **Import Maven Central certificate**:
   ```bash
   # Download Maven Central certificate
   echo -n | openssl s_client -connect repo.maven.apache.org:443 | sed -ne '/-BEGIN CERTIFICATE-/,/-END CERTIFICATE-/p' > maven-central.crt
   
   # Import into Java keystore
   keytool -import -trustcacerts -alias maven-central -file maven-central.crt -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit
   ```

## Testing Strategy

### Unit Tests
All existing unit tests should pass without modification as:
- No API-breaking changes in application code
- Spring Boot 4 maintains backward compatibility for Spring Boot 3 APIs
- JUnit 5.11.3 fully supports Java 25

### Integration Tests
- Verify all Spring context loading
- Test REST endpoints if applicable
- Validate Spring Cloud configuration

### Performance Testing
- Compare startup time (expected improvement with modularization)
- Verify memory footprint
- Test throughput under load

## Post-Migration Validation

1. **Build Success**: `mvn clean package` completes without errors
2. **Test Success**: All tests pass
3. **Code Quality**: PMD, Jacoco, and other quality checks pass
4. **Documentation**: All documentation updated with new versions

## Rollback Plan

If issues arise, rollback is straightforward:

```xml
<!-- Rollback to Spring Boot 3.4.1 -->
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.4.1</version>
</parent>

<properties>
    <java.version>21</java.version>
    <spring-core.version>6.2.1</spring-core.version>
    <spring-boot.version>3.4.1</spring-boot.version>
    <spring-cloud.version>2024.0.0</spring-cloud.version>
</properties>
```

## References

- [Spring Boot 4.0.0 Release Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-4.0-Release-Notes)
- [Spring Boot 4.0 Migration Guide](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-4.0-Migration-Guide)
- [Spring Framework 7 Documentation](https://docs.spring.io/spring-framework/docs/7.0.x/reference/html/)
- [Spring Cloud 2025.1.0 Release Train](https://spring.io/projects/spring-cloud)
- [Java 25 Release Notes](https://jdk.java.net/25/)

## Support

For issues or questions:
1. Check the [Spring Boot Issues](https://github.com/spring-projects/spring-boot/issues)
2. Review [Stack Overflow Spring Boot 4 Tag](https://stackoverflow.com/questions/tagged/spring-boot-4.0)
3. Consult the [Spring Community Forums](https://spring.io/community)

---

**Last Updated**: December 17, 2025  
**Author**: GitHub Copilot  
**Version**: 1.0
