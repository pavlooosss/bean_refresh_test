package com.testtoogle

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.core.env.ConfigurableEnvironment
import org.springframework.stereotype.Component

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
class TestPropertySource(environment: ConfigurableEnvironment) : org.springframework.core.env.PropertySource<TestPropertySource>("test") {
    var value: String = "FIRST"

    init {
        environment.propertySources.addFirst(this)
    }

    override fun getProperty(name: String): Any? {
        if (name == "feature.toogle.testValue") {
            return value
        } else {
            return null
        }
    }
}