plugins {
    kotlin("jvm") version "1.4.10"
    application
}

group = "org.cmieux"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.antlr:antlr4:4.8")
}

application {
    mainClassName = "org.cmieux.MainKt"

    applicationDistribution.from("scripts") {
        includes += "cc1"
    }
}
