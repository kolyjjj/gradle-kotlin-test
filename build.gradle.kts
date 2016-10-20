apply<ApplicationPlugin>()

configure<ApplicationPluginConvention> {
    mainClassName = "li.koly.HelloWorld"
    applicationName = "bbjjk"
}

configure<JavaPluginConvention> {
    setSourceCompatibility(1.8)
    setTargetCompatibility(1.8)
}

repositories {
    mavenCentral()
}

dependencies {
    compile("com.google.guava:guava:20.0-rc1")
}

task("hello") {
    println("hello")
}

