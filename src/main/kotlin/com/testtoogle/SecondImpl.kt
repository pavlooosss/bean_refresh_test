package com.testtoogle

class SecondImpl : PerfectService {
    init {
        println("SECOND BEAN CREATED")
    }

    override fun getStringValue() = "Second Implementation"
}