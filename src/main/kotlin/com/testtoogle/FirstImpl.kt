package com.testtoogle

import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

//@Component
//@RefreshScope
////@ConditionalOnProperty(value = ["feature.toogle.testValue"], havingValue = "FIRST")
//@Scope("request")
class FirstImpl: PerfectService {

    @PostConstruct
    fun postConstruct() {
        println("FIRST BEAN CREATED")
    }

    override fun getStringValue() = "First Implementation"
}