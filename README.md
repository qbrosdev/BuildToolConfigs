# Build Tool Configurations for Conflicting Annotation processing scenarios

Setting up new projects using build tools such as Maven and Gradle is relatively easy, however when you add libraries
and frameworks that rely on annotations, then you have to consider the effects of the annotation processing on your
build flow.

## Build Process Problems

One of the most important steps in the build process is compilation. If we have annotations on our source code, then the
annotation processing will also be performed.

> The [annotation processing](https://www.baeldung.com/java-annotation-processing-builder#Annotation) is done in multiple rounds. Each round starts with the compiler searching for the annotations in the source files and choosing the annotation processors suited for these annotations.
>
> Each annotation processor, in turn, is called on the corresponding sources. If any files are generated during this process, another round is started with the generated files as its input. This process continues until no new files are generated during the processing stage. This process continues until no new files are generated during the processing stage.

Unfortunately, Lombok does not follow these rules in its annotation processing, and it does not create new files during
the annotation processing phase and as a result other annotation processing will not be triggered properly, and we end
up with lots of errors during the build process.

Another problem is to support annotation processing in a language other than Java (Kotlin). For this Kotlin has
introduced KAPT (Kotlin Annotation Processing Tool). Which enables annotation in the kotlin code during the java
compilation.

## Build Script Configurations

In this project we provide build script configurations for the following scenarios.

### Build Tools

Currently, the two main stream (JVM based) build tools are **Maven** and **Gradle**.

### Languages

In this project we define build tool configuration for the following languages.

* **Java**
* **Kotlin**: To enable annotations processing in kotlin we use KAPT (Kotlin annotation processing).

### Annotation Processing Libraries & Frameworks

Most of the library and tools that we use in our projects are activated through annotations.

* **MapStruct**: In a multi-tier application mapping objects which are specific to one tire to their counterpart object
  in different tires is a tedious task. There are various model mapping libraries and working with different
  ModelMapping libraries (**ModelMapper**, **MapStruct** and  **Dozer**) I found the MapStruct the easiest to use and
  offering the best performance.   
  MapStruct uses annotation processing which is plugged into the Java compiler.

* **Lombok**: Lombok automatically generates boilerplate code and reduces the verbosity of the code. This library is
  specially useful for Java because in Kotlin, lots of the features of this library are built-into the language.

* **Spring**: Spring is one of the most popular Java web frameworks that works based on annotation processing and builds
  dynamic proxies around Java beans.
