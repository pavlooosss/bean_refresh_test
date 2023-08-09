package com.testtoogle

import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

//@Component
//@RefreshScope
////@ConditionalOnProperty(value = ["feature.toogle.testValue"], havingValue = "SECOND")
//@Scope("request")
class SecondImpl: PerfectService {

    @PostConstruct
    fun postConstruct() {
        println("SECOND BEAN CREATED")
    }

    override fun getStringValue() = "Second Implementation"
}