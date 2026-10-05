<div align="center">

# 🧩 UM Dev Creative Commons

**Shared Java library** — common components, POJOs, converters, utilities, and centralized
dependency versions for UM Dev Creative applications.

[![Qodana](https://github.com/lanmata/commons/actions/workflows/qodana_code_quality.yml/badge.svg)](https://github.com/lanmata/commons/actions/workflows/qodana_code_quality.yml)

[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=lanmata-commons)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)

[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=coverage)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=lanmata-commons&metric=bugs)](https://sonarcloud.io/summary/new_code?id=lanmata-commons)

<br/>

[![Java](https://img.shields.io/badge/Java-25%20LTS-blue?logo=java&style=flat-square)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven->=3.8-red?logo=apachemaven&style=flat-square)](https://maven.apache.org/)

[![Jackson](https://img.shields.io/badge/Jackson-2.22.3-blue?logo=jackson&style=flat-square)](https://github.com/FasterXML/jackson)
[![Gson](https://img.shields.io/badge/Gson-2.14.0-orange?logo=google&style=flat-square)](https://github.com/google/gson)
[![org.json](https://img.shields.io/badge/org.json-20260814-blue?logo=json&style=flat-square)](https://github.com/stleary/JSON-java)
[![Log4j](https://img.shields.io/badge/Log4j-2.26.1-red?logo=apache&style=flat-square)](https://logging.apache.org/log4j/)
[![Jakarta Validation](https://img.shields.io/badge/Jakarta%20Validation-3.1.1-blue?style=flat-square)](https://jakarta.ee/specifications/bean-validation/)
[![WebJars](https://img.shields.io/badge/WebJars-0.59-blue?style=flat-square)](https://www.webjars.org/)
[![ASM](https://img.shields.io/badge/ASM-9.8-lightgrey?style=flat-square)](https://asm.ow2.io/)

[![JUnit](https://img.shields.io/badge/JUnit-6.1.3-red?logo=junit&style=flat-square)](https://junit.org/)
[![JaCoCo](https://img.shields.io/badge/JaCoCo-0.8.14-yellow?logo=jacoco&style=flat-square)](https://www.jacoco.org/)
[![SonarCloud](https://img.shields.io/badge/SonarCloud-detected-4E9BCF?logo=sonarcloud&style=flat-square)](https://sonarcloud.io/)

</div>

Overview
--------

UM Dev Creative Commons is a small, focused Java library that centralizes common components, POJOs, converters, constants, and dependency management used across UM Dev Creative microservices and applications. It is distributed as a Maven artifact and provides a Bill of Materials (BOM) under `bom/pom.xml` to keep versions consistent across modules.

Requirements
------------

- Java 25 (JDK, LTS) or a compatible runtime (the project sets `java.version` = 25 in `pom.xml`).
- Maven (the project uses Maven; `pom.xml` is present at the repository root).
- Network access to Maven Central and any private repositories configured (see `pom.xml` repository entries — e.g., `repsy`).
- Optional: SonarCloud access token for running Sonar analysis locally or in CI (see `sonar.host.url` and sonar properties in `pom.xml`).

Quick build
-----------

Basic build (runs compilation, tests, and generates artifacts):

```bash
mvn clean package
```

If you want to skip tests (not recommended for CI):

```bash
mvn -DskipTests package
```

Run unit tests only:

```bash
mvn test
```

Generate Javadocs (HTML API docs):

```bash
mvn javadoc:javadoc
# then open target/site/apidocs/index.html
```

Known issues and workarounds
---------------------------

- Private repository access (repsy): If you rely on the private `repsy` repository in `pom.xml`, ensure your Maven `settings.xml` contains credentials for that host. Without credentials, dependency resolution may fail.

- Java 25 compatibility: The project is configured to compile with Java 25. If your environment uses an older JDK, update your JDK or set the `java.version` property for local testing. Some third-party libraries may have issues on very new runtimes; check the dependency versions in `pom.xml` if you encounter runtime ClassNotFound or NoSuchMethod errors.

- Code coverage file path for Sonar: The project sets the Jacoco report path via `sonar.coverage.jacoco.xmlReportPaths` to `${project.build.directory}/site/jacoco/jacoco.xml`. If Sonar does not pick up coverage, confirm the file exists after running tests and the path matches your local invocation.

- Surefire/ASM dependency: The `maven-surefire-plugin` is configured with an explicit `asm` dependency (see `pom.xml`) — if you encounter test runner errors, ensure plugin versions and the `asm` property are present.

Continuous Integration
----------------------

A minimal CI pipeline should perform:

1. Checkout code
2. Setup JDK 25
3. Cache Maven local repository (optional)
4. Run `mvn -B clean verify` (or `mvn -B -DskipTests=false clean package`)
5. Run Sonar analysis (if configured)
6. Archive artifacts and test reports

Example GitHub Actions job (conceptual, do not commit blindly):

```yaml
name: CI
on: [push, pull_request]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          distribution: 'temurin'
          java-version: '25'
      - name: Build and test
        run: mvn -B clean verify
      - name: Upload test reports
        uses: actions/upload-artifact@v4
        with:
          name: surefire-reports
          path: target/surefire-reports
      - name: Sonar (optional)
        if: secrets.SONAR_TOKEN != null
        env:
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
        run: mvn -B sonar:sonar -Dsonar.login=$SONAR_TOKEN
```

How to verify Sonar coverage locally
-----------------------------------

1. Run tests and generate the Jacoco XML report. The pom's JaCoCo configuration produces reports during `test` and `site` goals. A reliable local sequence is:

```bash
mvn clean test
mvn jacoco:report
```

This should produce `target/site/jacoco/jacoco.xml` (configured in `pom.xml` via `sonar.coverage.jacoco.xmlReportPaths`).

2. Run Sonar analysis. You can use the Maven Sonar plugin or `sonar-scanner` CLI. Example using Maven (requires `sonar.host.url`, `sonar.login` token):

```bash
mvn sonar:sonar -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=<YOUR_TOKEN> -Dsonar.projectKey=<YOUR_PROJECT_KEY>
```

Note: The project `pom.xml` already sets `sonar.host.url` and `sonar.projectKey` properties; pass `-Dsonar.login` with a valid token to authenticate.

Documentation
-------------

- API Javadocs: generate with `mvn javadoc:javadoc` and open `target/site/apidocs/index.html`.
- BOM: `bom/pom.xml` contains centralized dependency versions for multi-module projects.
- Reports: code coverage HTML and XML are generated under `target/site/jacoco/` after running tests and the JaCoCo goal.
- Project-level notes: see `CHANGELOG`, `README-BUILD.md`, and `BUILD_VALIDATION_REPORT.md` in the repository root for historical and build guidance.

Tech stack and versions
-----------------------
Alphabetically sorted list of the technologies used, the version declared in the root `pom.xml`, and where it was found.

| Technology | Version | Source |
|---|--------:|---|
| ASM | 9.8 | `pom.xml` property `asm.version` |
| Gson | 2.14.0 | `pom.xml` property `google.gson.version` |
| Jackson Annotations | 2.22 | `pom.xml` property `jackson.annotations.version` |
| Jackson Core | 2.22.3 | `pom.xml` managed dependency (uses `jackson.databind.version`) |
| Jackson Databind | 2.22.3 | `pom.xml` property `jackson.databind.version` |
| JaCoCo (Maven plugin) | 0.8.14 | `pom.xml` property `maven.plugin.jacoco.version` |
| Jakarta Validation API | 3.1.1 | `pom.xml` property `jakarta.validation.version` |
| Java (language/runtime) | 25 | `pom.xml` property `java.version` |
| JUnit Jupiter | 6.1.3 | `pom.xml` property `junit.jupiter.version` |
| Log4j Core | 2.26.1 | `pom.xml` property `log4j.core.version` |
| Maven | 3.8+ | `pom.xml` present in repository root |
| Maven Compiler Plugin | 3.14.1 | `pom.xml` property `maven.compiler.plugin.version` |
| Maven Javadoc Plugin | 3.6.3 | `pom.xml` property `maven.plugin.javadoc.version` |
| Maven PMD Plugin | 3.28.0 | `pom.xml` property `maven.plugin.pmd.version` |
| Maven Surefire Plugin | 3.5.2 | `pom.xml` property `maven.surefire.version` |
| org.json (JSON library) | 20260814 | `pom.xml` property `org.json.version` |
| webjars-locator-core | 0.59 | `pom.xml` property `webjars.locator.version` |

Notes
-----
- Versions were extracted from the root `pom.xml`. `bom/pom.xml` still lists older versions (e.g., Jackson 2.20, JUnit 5.9.3) and should be synced separately.
- If you need this project as a BOM for other modules, see `bom/pom.xml` which centralizes many properties.

License
-------

See the [`LICENSE`](LICENSE) file in the project root.
