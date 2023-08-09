package com.testtoogle

import org.springframework.context.annotation.Scope

@Scope("request")
interface PerfectService {

    fun getStringValue(): String
}