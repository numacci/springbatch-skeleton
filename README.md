# SpringBatch Skeleton

### Summary

This is a skeleton project for SpringBatch. Some developer tools like `checkstyle` or `sonarqube` are installed.

### Prerequisites

* Java 11 installed
* Code follows [Google Java Style](https://github.com/google/styleguide)

### How to set up

Execute following command at the root directory.

```Shell
$ ./gradlew
```

### How to run Spring Batch Application

Run the `main` method or run the following command at the root directory. Environmental profiles can be specified by `-PPROFILE` option.

```Shell
$ ./gradlew bootRun
$ ./gradlew bootRun -PPROFILE=dev # Profiles can be specified
```

You may see `Hello World Tasklet!` log in your console.

### Development tools

Following tools are ready in this project. Each report will be generated at `$projectDir/build/reports/` directory.

* Checkstyle - [google checkstyle](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml)
* [Jacoco](https://www.jacoco.org/jacoco/trunk/doc/)
* [Javadoc](https://docs.oracle.com/javase/jp/1.5.0/tooldocs/windows/javadoc.html)
* [Sonarqube](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-gradle/)
