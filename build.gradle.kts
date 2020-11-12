plugins {
    kotlin("jvm") version "1.4.10"
    application
    distribution
}

application {
    mainClass.set("org.cmieux.MainKt")
}

group = "org.cmieux"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.antlr:antlr4:4.8")
}
