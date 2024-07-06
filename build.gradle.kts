plugins {
    id("java")
    application
    checkstyle
    id("com.github.ben-manes.versions") version "0.51.0"
    id("se.patrikerdes.use-latest-versions") version "0.2.18"
    id("io.freefair.lombok") version "8.6"
}

group = ""
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.1")
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("org.apache.commons:commons-math3:3.6.1")
    implementation("info.picocli:picocli:4.7.6")

    //Lombok
    annotationProcessor("info.picocli:picocli-codegen:4.7.6")
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")
    testCompileOnly("org.projectlombok:lombok:1.18.32")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.32")

    //test
    testImplementation("org.assertj:assertj-core:3.26.0")
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}


tasks.withType<JavaCompile> {
    val compilerArgs = options.compilerArgs
    compilerArgs.add("-Aproject=${project.group}/${project.name}")
}



tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("App")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}