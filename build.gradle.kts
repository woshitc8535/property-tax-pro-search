

group = "com.choypuppy"

object V{
    const val kotlin = "1.7.20"
    const val springdoc = "1.8.0"
}


plugins {
    id("idea")
    id("java")
    id("application")


    kotlin("jvm") version "1.7.20"
    kotlin("plugin.spring") version "1.7.20"
    id("org.springframework.boot") version "2.7.15"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "com.xuanxuan"
version = "0.0.1-SNAPSHOT"




java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(11)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springdoc:springdoc-openapi-ui:${V.springdoc}")
    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")




    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")


    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
