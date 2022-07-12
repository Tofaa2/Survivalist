import org.gradle.internal.impldep.org.eclipse.jgit.lib.ObjectChecker.type

plugins {
    id("java")
    id("maven-publish")
    id("com.github.johnrengelman.shadow") version("7.1.2")
    id ("io.freefair.lombok") version("6.4.3")

}



group = "me.tofaa"
version = "1.18.2"

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://jitpack.io")
    maven("https://repo.minestom.com/repository/maven-public/")

}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")


    // Minestom api
    implementation("com.github.Minestom:Minestom:-SNAPSHOT")

    // SnakeYAML
    implementation("org.yaml:snakeyaml:1.30")

    // JNoise Library
    // https://mavenlibs.com/maven/dependency/de.articdive/jnoise
    implementation("com.github.Articdive.JNoise:jnoise-pipeline:b93008e35e")

    // APACHE COMMONS IO
    implementation("commons-io:commons-io:2.6")

    // JSON
    implementation("org.json:json:20220320")
}



tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "me.tofaa.Survivalist"
        archiveFileName.set("server.jar")
    }
}
