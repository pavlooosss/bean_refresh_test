package com.testtoogle

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.getBean
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment

@Configuration
class Configuration {
    @Bean
    @Qualifier("interface")
    @RefreshScope
    fun perfectServiceBean(env: Environment, ctx: ApplicationContext): PerfectService {
        return if ("FIRST" == env.getProperty("feature.toogle.testValue", "FIRST")) {
            ctx.getBean<FirstImpl>()
        } else {
            ctx.getBean<SecondImpl>()
        }
    }

    @Bean
    @org.springframework.context.annotation.Lazy
    fun firstImpl(): FirstImpl {
        return FirstImpl()
    }

    @Bean
    @org.springframework.context.annotation.Lazy
    fun secondImpl() = SecondImpl()
}