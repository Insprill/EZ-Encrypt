plugins {
    id("java")
    id("signing")
    id("maven-publish")
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
}

group = "net.insprill"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks {
    test {
        useJUnitPlatform()
    }
}

java {
    withSourcesJar()
    withJavadocJar()
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set(project.name)
                description.set("A light-weight Java library that makes AES encryption simple")
                url.set("https://github.com/Insprill/EZ-Encrypt")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("insprill")
                        name.set("Pierce Thompson")
                        url.set("https://github.com/Insprill")
                    }
                }
                scm {
                    url.set("https://github.com/Insprill/EZ-Encrypt")
                    connection.set("scm:git:git://github.com/Insprill/EZ-Encrypt.git")
                    developerConnection.set("scm:git:git@github.com:Insprill/EZ-Encrypt.git")
                }
                issueManagement {
                    system.set("GitHub Issues")
                    url.set("https://github.com/Insprill/EZ-Encrypt/issues")
                }
            }
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications)
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}
