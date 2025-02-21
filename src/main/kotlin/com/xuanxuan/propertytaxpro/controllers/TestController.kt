package com.xuanxuan.propertytaxpro.controllers

import com.xuanxuan.propertytaxpro.model.TestUser
import com.xuanxuan.propertytaxpro.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.time.ExperimentalTime


@ExperimentalTime
@RestController
@RequestMapping("/api/test")
class TestController(
    private val userService: UserService
) {

    @GetMapping("/{username}")
    fun get(@PathVariable username: String): ResponseEntity<TestUser> {
        val result = userService.get(username)
        return ResponseEntity.ok(result)
    }

    @PostMapping
    fun save(@RequestBody user: TestUser): ResponseEntity<TestUser> {
        userService.save(user)
        return ResponseEntity.ok(user)
    }

}