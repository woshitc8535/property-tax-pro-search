package com.xuanxuan.propertytaxpro.service

import com.xuanxuan.propertytaxpro.dal.UserRepository
import com.xuanxuan.propertytaxpro.model.TestUser
import org.springframework.stereotype.Service


@Service
class UserService(private val userRepository: UserRepository){

    fun save(testUser: TestUser): TestUser {
        return userRepository.save(testUser)
    }

    fun get(username: String): TestUser? {
        return userRepository.findByUsername(username)
    }
}