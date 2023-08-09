package com.testtoogle

class FirstImpl : PerfectService {
    init {
        println("FIRST BEAN CREATED")
    }

    override fun getStringValue() = "First Implementation"
}