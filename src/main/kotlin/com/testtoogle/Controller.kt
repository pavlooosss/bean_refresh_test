package com.testtoogle

import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Scope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RefreshScope
@Scope("request")
class Controller(private val perfectService: PerfectService) {

    @GetMapping("test")
    fun test() = ResponseEntity.ok(perfectService.getStringValue())
}