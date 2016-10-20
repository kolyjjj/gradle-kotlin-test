Another kotlin gradle example
----------------

### environments
* Gradle 3.1 wrapper
* IntelliJ IDEA 2016.2.5
Build #IC-162.2228.15, built on October 14, 2016
JRE: 1.8.0_112-release-287-b2 x86_64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
* kotlin-plugin-1.1.0-dev-2222.zip is used as the kotlin plugin for Intellij Idea
* Java 1.8

### tips
* Need to add `rootProject.buildFileName = 'build.gradle.kts'` in the `settings.gradle`

### steps
* Download the kotlin-plugin-1.1.0-dev-2222.zip in [https://github.com/gradle/gradle-script-kotlin/tree/master/samples] and install the plugin in Idea
* Create a gradle java project in Idea, and choose to use gradle wrapper
* In the terminal, under the project directory, use `./gradlew wrapper --gradle-version=3.1` to switch to gradle 3.1
* Create a file `build.gradle.kts` under the root directory of the project
* Add rootProject.buildFileName = 'build.gradle.kts' in the settings.gradle file
* Add codes in `build.gradle.kts`, and if the auto-completion does not work, try "Refresh all projects" in the Gradle Tool Window.
* Restart Idea if it still does not work