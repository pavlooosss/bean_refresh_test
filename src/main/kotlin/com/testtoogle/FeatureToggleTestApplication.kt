package com.testtoogle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeatureToggleTestApplication

fun main(args: Array<String>) {
	runApplication<FeatureToggleTestApplication>(*args)
}
