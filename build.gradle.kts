plugins {
    java
    id("info.solidsoft.pitest") version "1.7.0"
    id("org.jetbrains.qodana") version "0.1.13"
}

group = "io.plagov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
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

qodana {
  saveReport.set(true)
  showReport.set(true)
  showReportPort.set(8081)
  dockerImageName.set("jetbrains/qodana-jvm:latest")
}
