package com.testtoogle

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {

    @Value("\${feature.toogle.testValue}")
    lateinit var testValuefeature: String


    @Bean
    @RefreshScope
    fun perfectServiceBean(): PerfectService {
        return if (testValuefeature.equals("FIRST")) {
            FirstImpl()
        } else {
            SecondImpl()
        }
    }
}