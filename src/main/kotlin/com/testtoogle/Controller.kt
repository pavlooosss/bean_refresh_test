package com.testtoogle

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(@Qualifier("interface") private val perfectService: PerfectService) {

    @GetMapping("test")
    fun test() = ResponseEntity.ok(perfectService.getStringValue())
}