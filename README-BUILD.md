# Build & Repsy Credentials (PRX Commons)

This file explains how to use the PRX Commons BOM and how to provide credentials for the private `repsy` repository.

1) Using the PRX BOM in other modules

If you have multiple modules that should share the same dependency versions, import the BOM in your module's POM:

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.prx</groupId>
      <artifactId>prx-commons-bom</artifactId>
      <version>0.0.1</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>
```

After importing the BOM, you can declare dependencies without explicit versions (they will be taken from the BOM):

```xml
<dependencies>
  <dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
  </dependency>
</dependencies>
```

2) Providing `repsy` credentials (recommended approaches)

We intentionally do NOT store `repsy` credentials in the POM. Use one of the following secure methods.

A. Use Maven `settings.xml` (recommended for local dev and CI runners)

Edit your `~/.m2/settings.xml` or set up pipeline `settings.xml` in CI. Add a server entry with id `repsy`:

```xml
<settings>
  <servers>
    <server>
      <id>repsy</id>
      <username>${env.REPSY_ACCOUNT_USER}</username>
      <password>${env.REPSY_ACCOUNT_PASSWORD}</password>
    </server>
  </servers>
</settings>
```

Important: Do NOT commit `settings.xml` with credentials to the repository. Use protected variables in CI.

B. CI variables (recommended for CI pipelines)

- Set `REPSY_ACCOUNT_USER` and `REPSY_ACCOUNT_PASSWORD` as protected variables in the CI/CD system.
- In GitLab CI, you can also generate a `settings.xml` dynamically during the job using those variables and then run Maven with `-s settings.xml`.

Example GitLab CI job snippet (uses Maven image matching the project Java version):

```yaml
stages:
  - build

build-job:
  image: maven:3.9.9-eclipse-temurin-21
  stage: build
  script:
    - echo "<settings><servers><server><id>repsy</id><username>${REPSY_ACCOUNT_USER}</username><password>${REPSY_ACCOUNT_PASSWORD}</password></server></servers></settings>" > ci-settings.xml
    - mvn -s ci-settings.xml clean package
```

C. Pass properties at command-line (not recommended for CI logs):

```bash
mvn -Drepsy.account.user=USERNAME -Drepsy.account.password=PASSWORD clean package
```

3) Useful Commands

- Build with tests:
```bash
mvn clean test
```
- Build using an alternate settings file:
```bash
mvn -s ci-settings.xml clean package
```

4) Publishing the BOM (if desired)

You can publish the BOM POM (`bom/pom.xml`) to your repository to make it available for all modules. Use your usual `mvn deploy` or CI pipeline configured with credentials that can publish to `repsy`.

Example:
```bash
mvn -f bom/pom.xml deploy -DskipTests
```

5) Short note about credentials for README-BUILD.md maintainer

- Provide `repsy` credentials via `~/.m2/settings.xml` or via CI protected variables.
- Do not store credentials in the repository.

End of README-BUILD.md
