plugins {
    java
}

group = "io.plagov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter", "5.7.1")
}

tasks.test {
    useJUnitPlatform()
}
