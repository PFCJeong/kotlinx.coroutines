/*
 * Copyright 2016-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

val experimentalAnnotations = listOf(
    "kotlin.Experimental",
    "kotlinx.coroutines.ExperimentalCoroutinesApi",
    "kotlinx.coroutines.InternalCoroutinesApi"
)

kotlin {
    sourceSets.all { configureMultiplatform() }
}

tasks.withType<Test> {
    extensions.configure(kotlinx.kover.api.KoverTaskExtension::class) {
        isDisabled.set(true)
    }
}