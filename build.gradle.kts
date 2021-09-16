plugins {
    java
    id("info.solidsoft.pitest") version "1.6.0"
}

group = "io.plagov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.0")
}

tasks.test {
    useJUnitPlatform()
}

pitest {
    targetClasses.set(listOf("net.projecteuler.*"))
    timestampedReports.set(false)
    junit5PluginVersion.set("0.14")
    threads.set(4)
}
