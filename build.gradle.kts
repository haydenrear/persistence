plugins {
    id("com.hayden.persistence")
    id("com.hayden.no-main-class")
    id("com.hayden.base-plugin")
}

group = "com.hayden"
version = "0.0.1-SNAPSHOT"

tasks.register("prepareKotlinBuildScriptModel")
